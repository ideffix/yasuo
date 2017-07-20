package com.ideffix.yasuo.dto.lolstaticdata;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class PassiveDTO {
	
	private ImageDTO image;
	private String sanitizedDescription;
	private String name;
	private String description;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
