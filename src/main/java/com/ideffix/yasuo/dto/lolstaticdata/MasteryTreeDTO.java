package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class MasteryTreeDTO {
	
	private List<MasteryTreeListDTO> resolve;
	private List<MasteryTreeListDTO> ferocity;
	private List<MasteryTreeListDTO> cunning;

	public List<MasteryTreeListDTO> getResolve() {
		return resolve;
	}

	public void setResolve(List<MasteryTreeListDTO> resolve) {
		this.resolve = resolve;
	}

	public List<MasteryTreeListDTO> getFerocity() {
		return ferocity;
	}

	public void setFerocity(List<MasteryTreeListDTO> ferocity) {
		this.ferocity = ferocity;
	}

	public List<MasteryTreeListDTO> getCunning() {
		return cunning;
	}

	public void setCunning(List<MasteryTreeListDTO> cunning) {
		this.cunning = cunning;
	}

}
