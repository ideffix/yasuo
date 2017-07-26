package com.ideffix.yasuo.dto.tournamentstub;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class TournamentCodeParametersDTO {
	
	private SpectatorType spectatorType;
	private int teamSize;
	private PickType pickType;
	private SummonerIdParamsDTO allowedSummonerIds;
	private MapType mapType;
	private String metadata;

	/**
	 * 
	 * @return The spectator type of the game.
	 */
	public SpectatorType getSpectatorType() {
		return spectatorType;
	}

	public void setSpectatorType(SpectatorType spectatorType) {
		this.spectatorType = spectatorType;
	}

	/**
	 * 
	 * @return The team size of the game. Valid values are 1-5.

	 */
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	/**
	 * 
	 * @return The pick type of the game.
	 */
	public PickType getPickType() {
		return pickType;
	}

	public void setPickType(PickType pickType) {
		this.pickType = pickType;
	}

	/**
	 * 
	 * @return Optional list of participants in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future.
	 */
	public SummonerIdParamsDTO getAllowedSummonerIds() {
		return allowedSummonerIds;
	}

	public void setAllowedSummonerIds(SummonerIdParamsDTO allowedSummonerIds) {
		this.allowedSummonerIds = allowedSummonerIds;
	}

	/**
	 * 
	 * @return The map type of the game.
	 */
	public MapType getMapType() {
		return mapType;
	}

	public void setMapType(MapType mapType) {
		this.mapType = mapType;
	}

	/**
	 * 
	 * @return Optional string that may contain any data in any format, if specified at all. Used to denote any custom information about the game.
	 */
	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

}
