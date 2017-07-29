package com.ideffix.yasuo.dto.matcha;

import java.util.Set;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class MatchFilters {
	
	private Set<Integer> queue;
	private long beginTime;
	private int endIndex;
	private Set<Integer> season;
	private Set<Integer> champion;
	private int beginIndex;
	private long endTime;

	/**
	 * 
	 * @return Set of queue IDs for which to filtering matchlist.
	 */
	public Set<Integer> getQueue() {
		return queue;
	}

	public void setQueue(Set<Integer> queue) {
		this.queue = queue;
	}

	/**
	 * 
	 * @return The begin time to use for filtering matchlist specified as epoch milliseconds.
	 */
	public long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * 
	 * @return The end index to use for filtering matchlist.
	 */
	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	/**
	 * 
	 * @return Set of season IDs for which to filtering matchlist.
	 */
	public Set<Integer> getSeason() {
		return season;
	}

	public void setSeason(Set<Integer> season) {
		this.season = season;
	}

	/**
	 * 
	 * @return Set of champion IDs for which to filtering matchlist.
	 */
	public Set<Integer> getChampion() {
		return champion;
	}

	public void setChampion(Set<Integer> champion) {
		this.champion = champion;
	}

	/**
	 * 
	 * @return The begin index to use for filtering matchlist.
	 */
	public int getBeginIndex() {
		return beginIndex;
	}

	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}

	/**
	 * 
	 * @return The end time to use for filtering matchlist specified as epoch milliseconds.
	 */
	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

}
