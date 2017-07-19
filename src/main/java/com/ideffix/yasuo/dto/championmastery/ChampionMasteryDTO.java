package com.ideffix.yasuo.dto.championmastery;

/**
 * @author IdeFFiX
 *
 *         Jul 19, 2017
 */
public class ChampionMasteryDTO {

	private boolean chestGranted;
	private int championLevel;
	private int championPoints;
	private long championId;
	private long playerId;
	private long championPointsUntilNextLevel;
	private long championPointsSinceLastLevel;
	private long lastPlayTime;

	/**
	 * 
	 * @return Is chest granted for this champion or not in current season.
	 */
	public boolean isChestGranted() {
		return chestGranted;
	}

	public void setChestGranted(boolean chestGranted) {
		this.chestGranted = chestGranted;
	}

	/**
	 * 
	 * @return Champion level for specified player and champion combination.
	 */
	public int getChampionLevel() {
		return championLevel;
	}

	public void setChampionLevel(int championLevel) {
		this.championLevel = championLevel;
	}

	/**
	 * 
	 * @return Total number of champion points for this player and champion
	 *         combination - they are used to determine championLevel.
	 */
	public int getChampionPoints() {
		return championPoints;
	}

	public void setChampionPoints(int championPoints) {
		this.championPoints = championPoints;
	}

	/**
	 * 
	 * @return Champion ID for this entry.
	 */
	public long getChampionId() {
		return championId;
	}

	public void setChampionId(long championId) {
		this.championId = championId;
	}

	/**
	 * 
	 * @return Player ID for this entry.
	 */
	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	/**
	 * 
	 * @return Number of points needed to achieve next level. Zero if player
	 *         reached maximum champion level for this champion.
	 */
	public long getChampionPointsUntilNextLevel() {
		return championPointsUntilNextLevel;
	}

	public void setChampionPointsUntilNextLevel(long championPointsUntilNextLevel) {
		this.championPointsUntilNextLevel = championPointsUntilNextLevel;
	}

	/**
	 * 
	 * @return Number of points earned since current level has been achieved.
	 *         Zero if player reached maximum champion level for this champion.
	 */
	public long getChampionPointsSinceLastLevel() {
		return championPointsSinceLastLevel;
	}

	public void setChampionPointsSinceLastLevel(long championPointsSinceLastLevel) {
		this.championPointsSinceLastLevel = championPointsSinceLastLevel;
	}

	/**
	 * 
	 * @return Last time this champion was played by this player - in Unix
	 *         milliseconds time format.
	 */
	public long getLastPlayTime() {
		return lastPlayTime;
	}

	public void setLastPlayTime(long lastPlayTime) {
		this.lastPlayTime = lastPlayTime;
	}

}
