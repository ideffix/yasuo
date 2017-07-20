package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.Map;


/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class MasteryListDTO {
	
	private Map<String, MasteryDTO> data;
	private String version;
	private MasteryTreeDTO tree;
	private String type;

	public Map<String, MasteryDTO> getData() {
		return data;
	}

	public void setData(Map<String, MasteryDTO> data) {
		this.data = data;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public MasteryTreeDTO getTree() {
		return tree;
	}

	public void setTree(MasteryTreeDTO tree) {
		this.tree = tree;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
