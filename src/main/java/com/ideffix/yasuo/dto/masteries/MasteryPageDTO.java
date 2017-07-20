package com.ideffix.yasuo.dto.masteries;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class MasteryPageDTO {
	
	private boolean current;
	private List<MasteryDTO> masteries;
	private String name;
	private long id;

	/**
	 * 
	 * @return ndicates if the mastery page is the current mastery page.
	 */
	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

	/**
	 * 
	 * @return Collection of masteries associated with the mastery page.
	 */
	public List<MasteryDTO> getMasteries() {
		return masteries;
	}

	public void setMasteries(List<MasteryDTO> masteries) {
		this.masteries = masteries;
	}

	/**
	 * 
	 * @return Mastery page name.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return Mastery page ID.
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
