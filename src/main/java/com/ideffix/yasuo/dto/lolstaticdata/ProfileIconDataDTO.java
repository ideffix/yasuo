package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.Map;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class ProfileIconDataDTO {
	
	private Map<String, ProfileIconDetailsDTO> data;
	private String version;
	private String type;
	
	public Map<String, ProfileIconDetailsDTO> getData() {
		return data;
	}
	public void setData(Map<String, ProfileIconDetailsDTO> data) {
		this.data = data;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
