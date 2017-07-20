package com.ideffix.yasuo.dto.lolstatus;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class ServiceDTO {
	
	private String status;
	private List<IncidentDTO> incidents;
	private String name;
	private String slug;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<IncidentDTO> getIncidents() {
		return incidents;
	}

	public void setIncidents(List<IncidentDTO> incidents) {
		this.incidents = incidents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
