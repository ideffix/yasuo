package com.ideffix.yasuo.dto.spectator;

/**
 * @author IdeFFiX
 *
 *         Jul 19, 2017
 */
public class BannedChampionDTO {

	private int pickTurn;
	private long championId;
	private long teamId;

	/**
	 * 
	 * @return The turn during which the champion was banned
	 */
	public int getPickTurn() {
		return pickTurn;
	}

	public void setPickTurn(int pickTurn) {
		this.pickTurn = pickTurn;
	}

	/**
	 * 
	 * @return 	The ID of the banned champion
	 */
	public long getChampionId() {
		return championId;
	}

	public void setChampionId(long championId) {
		this.championId = championId;
	}

	/**
	 * 
	 * @return The ID of the team that banned the champion
	 */
	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

}
