package com.ideffix.yasuo.dto.lolstatus;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class ShardStatusDTO {
	
	private String name;
	private String region_tag;
	private String hostname;
	private List<ServiceDTO> services;
	private String slug;
	private List<String> locales;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion_tag() {
		return region_tag;
	}

	public void setRegion_tag(String region_tag) {
		this.region_tag = region_tag;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public List<ServiceDTO> getServices() {
		return services;
	}

	public void setServices(List<ServiceDTO> services) {
		this.services = services;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public List<String> getLocales() {
		return locales;
	}

	public void setLocales(List<String> locales) {
		this.locales = locales;
	}

}
