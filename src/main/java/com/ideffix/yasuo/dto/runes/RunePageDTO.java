package com.ideffix.yasuo.dto.runes;

import java.util.Set;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class RunePageDTO {
	
	private boolean current;
	private Set<RuneSlotDTO> slots;
	private String name;
	private long id;

	/**
	 * 
	 * @return Indicates if the page is the current page.
	 */
	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

	/**
	 * 
	 * @return Collection of rune slots associated with the rune page.
	 */
	public Set<RuneSlotDTO> getSlots() {
		return slots;
	}

	public void setSlots(Set<RuneSlotDTO> slots) {
		this.slots = slots;
	}

	/**
	 * 
	 * @return Rune page name.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return Rune page ID.
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
