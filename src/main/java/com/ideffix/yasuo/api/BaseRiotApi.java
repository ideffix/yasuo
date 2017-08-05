package com.ideffix.yasuo.api;

import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.dto.tournamentstub.Region;
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
	
	public <T> T callGetRequest(String endpointPath, Map<String, String> params, Class<T> c) {	
		String requestUrl = buildApiUrl(endpointPath, params);
		LOG.info("Request url: " + requestUrl);
		
		WebResource webResource = client.resource(requestUrl);
		ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if (response.getStatus() != 200) {
			LOG.error("Response is " + response.getStatus() + ", returning null");
			return null;
		}
		T result = null;
		try {
			result = mapper.readValue(response.getEntity(String.class), c);
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
