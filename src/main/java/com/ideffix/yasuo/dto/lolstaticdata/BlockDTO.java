package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class BlockDTO {
	
	private List<BlockItemDTO> items;
	private boolean recMath;
	private String type;

	public List<BlockItemDTO> getItems() {
		return items;
	}

	public void setItems(List<BlockItemDTO> items) {
		this.items = items;
	}

	public boolean isRecMath() {
		return recMath;
	}

	public void setRecMath(boolean recMath) {
		this.recMath = recMath;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
