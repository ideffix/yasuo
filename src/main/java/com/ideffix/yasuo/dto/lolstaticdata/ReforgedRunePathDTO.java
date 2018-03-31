/**
 * 
 */
package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.List;

/**
 * @author ideff
 *
 */
public class ReforgedRunePathDTO {

	private List<ReforgedRuneSlotDTO> slots;
	private String icon;
	private int id;
	private String key;
	private String name;

	public List<ReforgedRuneSlotDTO> getSlots() {
		return slots;
	}

	public void setSlots(List<ReforgedRuneSlotDTO> slots) {
		this.slots = slots;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
