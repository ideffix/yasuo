package com.ideffix.yasuo.dto.masteries;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class MasteryDTO {
	
	private int id;
	private int rank;

	/**
	 * 
	 * @return Mastery ID. For static information correlating to masteries, please refer to the LoL Static Data API.
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return Mastery rank (i.e., the number of points put into this mastery).
	 */
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
