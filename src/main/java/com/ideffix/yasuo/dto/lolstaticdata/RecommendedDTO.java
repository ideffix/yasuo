package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class RecommendedDTO {
	
	private String map;
	private List<BlockDTO> blocks;
	private String champion;
	private String title;
	private boolean priority;
	private String mode;
	private String type;

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public List<BlockDTO> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<BlockDTO> blocks) {
		this.blocks = blocks;
	}

	public String getChampion() {
		return champion;
	}

	public void setChampion(String champion) {
		this.champion = champion;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
