package com.ideffix.yasuo.api;

import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.dto.error.ErrorResponseDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.DateHelper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * <p>
 * Created on Aug 5, 2017 
 *
 * @author IdeFFiX
 */

public abstract class BaseRiotApi {
	
	private static final Logger LOG = Logger.getLogger(BaseRiotApi.class);
	
	private static final String HTTPS_PROTOCOL = "https://";
	
	private String apiKey;
	
	private Region region;
	
	private Client client = Client.create();
	
	private ObjectMapper mapper = new ObjectMapper();

	public BaseRiotApi(String apiKey, Region region) {
		this.apiKey = apiKey;
		this.region = region;
	}
	
	public <T> T callGetRequest(String endpointPath, Class<T> responseClass) {
		return callGetRequest(endpointPath, null, responseClass);
	}
	
	public <T> T callGetRequest(String endpointPath, Map<String, String> params, Class<T> responseClass) {	
		long requestStartTime = System.currentTimeMillis();
		
		String requestUrl = buildApiUrl(endpointPath, params);
		ClientResponse response = getResponse(requestUrl);
		T result = mapResponse(responseClass, response);
		
		long requestStopTime = System.currentTimeMillis();
		LOG.info("Request execution time: " + DateHelper.formatTimeBetween(requestStartTime, requestStopTime));
		return result;
	}
	
	public <T> T callPostRequest(String endpointPath, Object postObject, Class<T> responseClass) {
		return callPostRequest(endpointPath, null, postObject, responseClass);
	}
	
	public <T> T callPostRequest(String endpointPath, Map<String, String> params, Object postObject, Class<T> responseClass) {
		long requestStartTime = System.currentTimeMillis();
		
		String requestUrl = buildApiUrl(endpointPath, params);
		ClientResponse response = postResponse(requestUrl, postObject);
		T result = mapResponse(responseClass, response);
		
		long requestStopTime = System.currentTimeMillis();
		LOG.info("Request execution time: " + DateHelper.formatTimeBetween(requestStartTime, requestStopTime));
		return result;	
	}
	
	public <T> T callPutRequest(String endpointPath, Object putObject, Class<T> responseClass) {
		return callPutRequest(endpointPath, null, putObject, responseClass);
	}
	
	public <T> T callPutRequest(String endpointPath, Map<String, String> params, Object putObject, Class<T> responseClass) {
		long requestStartTime = System.currentTimeMillis();
		
		String requestUrl = buildApiUrl(endpointPath, params);
		ClientResponse response = putResponse(requestUrl, putObject);
		T result = mapResponse(responseClass, response);
		
		long requestStopTime = System.currentTimeMillis();
		LOG.info("Request execution time: " + DateHelper.formatTimeBetween(requestStartTime, requestStopTime));
		return result;	
	}

	private ClientResponse getResponse(String requestUrl) {
		LOG.info("Method: GET, request url: " + requestUrl);	
		WebResource webResource = client.resource(requestUrl);
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if (response.getStatus() != 200) {
			handleWebServiceError(response);
			return null;
		}
		return response;
	}
	
	private ClientResponse postResponse(String requestUrl, Object postObject) {
		LOG.info("Method: POST, request url: " + requestUrl);	
		WebResource webResource = client.resource(requestUrl);
		ClientResponse response = webResource
				.accept(MediaType.APPLICATION_JSON)
				.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, postObject);
		if (response.getStatus() != 200) {
			handleWebServiceError(response);
			return null;
		}
		return response;
	}
	
	private ClientResponse putResponse(String requestUrl, Object putObject) {
		LOG.info("Method: PUT, request url: " + requestUrl);	
		WebResource webResource = client.resource(requestUrl);
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).put(ClientResponse.class, putObject);
		if (response.getStatus() != 200) {
			handleWebServiceError(response);
		}
		return response;
	}
	
	private void handleWebServiceError(ClientResponse response) {
		ErrorResponseDTO errorResponse = mapResponse(ErrorResponseDTO.class, response);
		LOG.error("Error from webService, status: " + errorResponse.getStatus().getStatus_code() + ", message: " + errorResponse.getStatus().getMessage());
	}

	private <T> T mapResponse(Class<T> c, ClientResponse response) {
		
		T result = null;
		try {
			result = mapper.readValue(response.getEntityInputStream(), c);
		} catch (Exception ex) {
			LOG.error("Error when parsing object, message:" + ex.getMessage());
		}
		return result;
	}
	
	private String buildApiUrl(String endpointPath, Map<String, String> params) {
		StringBuilder sb = new StringBuilder();
		sb.append(HTTPS_PROTOCOL);
		sb.append(region.getHttpPath() + ".");
		sb.append(RiotApiConstans.API_DOMAIN);
		sb.append(specificApiPath());
		sb.append(endpointPath);
		sb.append("?");
		sb.append(RiotApiConstans.API_KEY + "=" + apiKey);
		sb.append(buildParams(params));
		return sb.toString();
	}

	private String buildParams(Map<String, String> params) {
		if (params == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		params.forEach((k, v) -> sb.append("&" + k + "=" + v));
		return sb.toString();
	}

	protected abstract String specificApiPath();	

}
