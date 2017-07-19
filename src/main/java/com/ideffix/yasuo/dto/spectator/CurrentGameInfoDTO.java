package com.ideffix.yasuo.dto.spectator;

import java.util.List;

/**
 * @author IdeFFiX
 *
 *         Jul 19, 2017
 */
public class CurrentGameInfoDTO {

	private long gameId;
	private long gameStartTime;
	private String platformId;
	private String gameMode;
	private long mapId;
	private String gameType;
	private List<BannedChampionDTO> bannedChampions;
	private ObserverDTO observers;
	private List<CurrentGameParticipantDTO> participants;
	private long gameLength;
	private long gameQueueConfigId;

	/**
	 * 
	 * @return The ID of the game
	 */
	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	/**
	 * 
	 * @return 	The game start time represented in epoch milliseconds
	 */
	public long getGameStartTime() {
		return gameStartTime;
	}

	public void setGameStartTime(long gameStartTime) {
		this.gameStartTime = gameStartTime;
	}

	/**
	 * 
	 * @return The ID of the platform on which the game is being played
	 */
	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	/**
	 * 
	 * @return The game mode
	 */
	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	/**
	 * 
	 * @return The ID of the map
	 */
	public long getMapId() {
		return mapId;
	}

	public void setMapId(long mapId) {
		this.mapId = mapId;
	}

	/**
	 * 
	 * @return The game type
	 */
	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	/**
	 * 
	 * @return Banned champion information
	 */
	public List<BannedChampionDTO> getBannedChampions() {
		return bannedChampions;
	}

	public void setBannedChampions(List<BannedChampionDTO> bannedChampions) {
		this.bannedChampions = bannedChampions;
	}

	/**
	 * 
	 * @return The observer information
	 */
	public ObserverDTO getObservers() {
		return observers;
	}

	public void setObservers(ObserverDTO observers) {
		this.observers = observers;
	}

	/**
	 * 
	 * @return The participant information
	 */
	public List<CurrentGameParticipantDTO> getParticipants() {
		return participants;
	}

	public void setParticipants(List<CurrentGameParticipantDTO> participants) {
		this.participants = participants;
	}

	/**
	 * 
	 * @return The amount of time in seconds that has passed since the game started
	 */
	public long getGameLength() {
		return gameLength;
	}

	public void setGameLength(long gameLength) {
		this.gameLength = gameLength;
	}

	/**
	 * 
	 * @return The queue type (queue types are documented on the Game Constants page)
	 */
	public long getGameQueueConfigId() {
		return gameQueueConfigId;
	}

	public void setGameQueueConfigId(long gameQueueConfigId) {
		this.gameQueueConfigId = gameQueueConfigId;
	}

}
