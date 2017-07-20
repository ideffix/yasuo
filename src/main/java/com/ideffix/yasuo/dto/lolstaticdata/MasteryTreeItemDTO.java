package com.ideffix.yasuo.dto.lolstaticdata;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class MasteryTreeItemDTO {
	
	private int masteryId;
	private String prereq;

	public int getMasteryId() {
		return masteryId;
	}

	public void setMasteryId(int masteryId) {
		this.masteryId = masteryId;
	}

	public String getPrereq() {
		return prereq;
	}

	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}

}
