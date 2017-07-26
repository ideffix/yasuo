package com.ideffix.yasuo.dto.runes;

import java.util.Set;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class RunePagesDTO {

	private Set<RunePageDTO> pages;
	private long summonerId;

	/**
	 * 
	 * @return Collection of rune pages associated with the summoner.
	 */
	public Set<RunePageDTO> getPages() {
		return pages;
	}

	public void setPages(Set<RunePageDTO> pages) {
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
