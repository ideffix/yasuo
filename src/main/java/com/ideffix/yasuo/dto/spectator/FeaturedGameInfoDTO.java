package com.ideffix.yasuo.dto.spectator;

import java.util.List;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class FeaturedGameInfoDTO {
	
	private long gameId;
	private long gameStartTime;
	private String platformId;
	private String gameMode;
	private long mapId;
	private String gameType;
	private List<BannedChampionDTO> bannedChampions;
	private ObserverDTO observers;
	private List<ParticipantDTO> participants;
	private long gameLength;
	private long gameQueueConfigId;

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public long getGameStartTime() {
		return gameStartTime;
	}

	public void setGameStartTime(long gameStartTime) {
		this.gameStartTime = gameStartTime;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	public long getMapId() {
		return mapId;
	}

	public void setMapId(long mapId) {
		this.mapId = mapId;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public List<BannedChampionDTO> getBannedChampions() {
		return bannedChampions;
	}

	public void setBannedChampions(List<BannedChampionDTO> bannedChampions) {
		this.bannedChampions = bannedChampions;
	}

	public ObserverDTO getObservers() {
		return observers;
	}

	public void setObservers(ObserverDTO observers) {
		this.observers = observers;
	}

	public List<ParticipantDTO> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ParticipantDTO> participants) {
		this.participants = participants;
	}

	public long getGameLength() {
		return gameLength;
	}

	public void setGameLength(long gameLength) {
		this.gameLength = gameLength;
	}

	public long getGameQueueConfigId() {
		return gameQueueConfigId;
	}

	public void setGameQueueConfigId(long gameQueueConfigId) {
		this.gameQueueConfigId = gameQueueConfigId;
	}

}
