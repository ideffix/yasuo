package com.ideffix.yasuo.dto.tournament;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * Created on May 3, 2018
 *
 * @author IdeFFiX
 */

public class TournamentResultDTO {

	private Date startTime;
	private List<TournamentSummonerDTO> winningTeam;
	private List<TournamentSummonerDTO> losingTeam;
	private String shortCode;
	private String metaData;
	private long gameId;
	private String gameName;
	private String gameType;
	private long gameMap;
	private String gameMode;
	private String region;

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the winningTeam
	 */
	public List<TournamentSummonerDTO> getWinningTeam() {
		return winningTeam;
	}

	/**
	 * @param winningTeam
	 *            the winningTeam to set
	 */
	public void setWinningTeam(List<TournamentSummonerDTO> winningTeam) {
		this.winningTeam = winningTeam;
	}

	/**
	 * @return the losingTeam
	 */
	public List<TournamentSummonerDTO> getLosingTeam() {
		return losingTeam;
	}

	/**
	 * @param losingTeam
	 *            the losingTeam to set
	 */
	public void setLosingTeam(List<TournamentSummonerDTO> losingTeam) {
		this.losingTeam = losingTeam;
	}

	/**
	 * @return the shortCode
	 */
	public String getShortCode() {
		return shortCode;
	}

	/**
	 * @param shortCode
	 *            the shortCode to set
	 */
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	/**
	 * @return the metaData
	 */
	public String getMetaData() {
		return metaData;
	}

	/**
	 * @param metaData
	 *            the metaData to set
	 */
	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

	/**
	 * @return the gameId
	 */
	public long getGameId() {
		return gameId;
	}

	/**
	 * @param gameId
	 *            the gameId to set
	 */
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	/**
	 * @return the gameName
	 */
	public String getGameName() {
		return gameName;
	}

	/**
	 * @param gameName
	 *            the gameName to set
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	/**
	 * @return the gameType
	 */
	public String getGameType() {
		return gameType;
	}

	/**
	 * @param gameType
	 *            the gameType to set
	 */
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	/**
	 * @return the gameMap
	 */
	public long getGameMap() {
		return gameMap;
	}

	/**
	 * @param gameMap
	 *            the gameMap to set
	 */
	public void setGameMap(long gameMap) {
		this.gameMap = gameMap;
	}

	/**
	 * @return the gameMode
	 */
	public String getGameMode() {
		return gameMode;
	}

	/**
	 * @param gameMode
	 *            the gameMode to set
	 */
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region
	 *            the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "TournamentResultDTO [startTime=" + startTime + ", winningTeam=" + winningTeam + ", losingTeam="
				+ losingTeam + ", shortCode=" + shortCode + ", metaData=" + metaData + ", gameId=" + gameId
				+ ", gameName=" + gameName + ", gameType=" + gameType + ", gameMap=" + gameMap + ", gameMode="
				+ gameMode + ", region=" + region + "]";
	}

}
