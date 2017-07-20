package com.ideffix.yasuo.dto.lolstaticdata;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class MetaDataDTO {
	
	private String tier;
	private String type;
	private boolean isRune;

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isRune() {
		return isRune;
	}

	public void setRune(boolean isRune) {
		this.isRune = isRune;
	}
	
}
