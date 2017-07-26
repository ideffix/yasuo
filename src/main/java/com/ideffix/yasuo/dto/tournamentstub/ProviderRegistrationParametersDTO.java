package com.ideffix.yasuo.dto.tournamentstub;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class ProviderRegistrationParametersDTO {
	
	private String url;
	private Region region;

	/**
	 * 
	 * @return The provider's callback URL to which tournament game results in this region should be posted. The URL must be well-formed, use the http or https protocol, and use the default port for the protocol (http URLs must use port 80, https URLs must use port 443).
	 */
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 
	 * @return The region in which the provider will be running tournaments. 
	 */
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}


}
