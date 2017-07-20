package com.ideffix.yasuo.dto.league;

import java.util.List;

/**
 * @author IdeFFiX
 *
 *         Jul 20, 2017
 */
public class LeagueListDTO {

	private String tier;
	private String queue;
	private String name;
	List<LeagueItemDTO> entries;

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<LeagueItemDTO> getEntries() {
		return entries;
	}

	public void setEntries(List<LeagueItemDTO> entries) {
		this.entries = entries;
	}

}
