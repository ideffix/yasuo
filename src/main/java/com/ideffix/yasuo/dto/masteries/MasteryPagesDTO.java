package com.ideffix.yasuo.dto.masteries;

import java.util.Set;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class MasteryPagesDTO {
	
	private Set<MasteryPageDTO> pages;
	private long summonerId;

	/**
	 * 
	 * @return Collection of mastery pages associated with the summoner.
	 */
	public Set<MasteryPageDTO> getPages() {
		return pages;
	}

	public void setPages(Set<MasteryPageDTO> pages) {
		this.pages = pages;
	}

	/**
	 * 
	 * @return Summoner ID.
	 */
	public long getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}

}
