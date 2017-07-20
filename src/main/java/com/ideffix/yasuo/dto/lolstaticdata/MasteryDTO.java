package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class MasteryDTO {
	
	private String prereq;
	private String masteryTree;
	private String name;
	private int ranks;
	private ImageDTO image;
	private List<String> sanitizedDescription;
	private int id;
	private List<String> description;

	public String getPrereq() {
		return prereq;
	}

	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}

	public String getMasteryTree() {
		return masteryTree;
	}

	public void setMasteryTree(String masteryTree) {
		this.masteryTree = masteryTree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanks() {
		return ranks;
	}

	public void setRanks(int ranks) {
		this.ranks = ranks;
	}

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}

	public List<String> getSanitizedDescription() {
		return sanitizedDescription;
	}

	public void setSanitizedDescription(List<String> sanitizedDescription) {
		this.sanitizedDescription = sanitizedDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getDescription() {
		return description;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

}
