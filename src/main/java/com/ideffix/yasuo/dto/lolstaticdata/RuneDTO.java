package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class RuneDTO {
	
	private RuneStatsDTO stats;
	private String name;
	private List<String> tags;
	private ImageDTO image;
	private String sanitizedDescription;
	private MetaDataDTO rune;
	private int id;
	private String description;

	public RuneStatsDTO getStats() {
		return stats;
	}

	public void setStats(RuneStatsDTO stats) {
		this.stats = stats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}

	public String getSanitizedDescription() {
		return sanitizedDescription;
	}

	public void setSanitizedDescription(String sanitizedDescription) {
		this.sanitizedDescription = sanitizedDescription;
	}

	public MetaDataDTO getRune() {
		return rune;
	}

	public void setRune(MetaDataDTO rune) {
		this.rune = rune;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
