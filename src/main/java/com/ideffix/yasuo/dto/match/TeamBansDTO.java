package com.ideffix.yasuo.dto.match;

/**
 * @author IdeFFiX
 *
 * Jul 25, 2017
 */
public class TeamBansDTO {
	
	private int pickTurn;
	private int championId;
	
	public int getPickTurn() {
		return pickTurn;
	}

	public void setPickTurn(int pickTurn) {
		this.pickTurn = pickTurn;
	}

	public int getChampionId() {
		return championId;
	}

	public void setChampionId(int championId) {
		this.championId = championId;
	}

}
