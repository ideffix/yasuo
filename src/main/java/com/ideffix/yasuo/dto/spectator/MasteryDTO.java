package com.ideffix.yasuo.dto.spectator;

/**
 * @author IdeFFiX
 *
 *         Jul 19, 2017
 */
public class MasteryDTO {

	private long masteryId;
	private int rank;

	/**
	 * 
	 * @return The ID of the mastery
	 */
	public long getMasteryId() {
		return masteryId;
	}

	public void setMasteryId(long masteryId) {
		this.masteryId = masteryId;
	}

	/**
	 * 
	 * @return The number of points put into this mastery by the user
	 */
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
