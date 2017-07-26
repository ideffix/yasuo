package com.ideffix.yasuo.dto.tournament;

import java.util.Set;

import com.ideffix.yasuo.dto.tournamentstub.MapType;
import com.ideffix.yasuo.dto.tournamentstub.PickType;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.dto.tournamentstub.SpectatorType;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class TournamentCodeDTO {
	
	private MapType map;
	private String code;
	private SpectatorType spectators;
	private Region region;
	private int providerId;
	private int teamSize;
	private Set<Long> participants;
	private PickType pickType;
	private int tournamentId;
	private String lobbyName;
	private String password;
	private int id;
	private String metaData;

	/**
	 * 
	 * @return The game map for the tournament code game
	 */
	public MapType getMap() {
		return map;
	}

	public void setMap(MapType map) {
		this.map = map;
	}

	/**
	 * 
	 * @return The tournament code.
	 */
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 
	 * @return The spectator mode for the tournament code game.
	 */
	public SpectatorType getSpectators() {
		return spectators;
	}

	public void setSpectators(SpectatorType spectators) {
		this.spectators = spectators;
	}

	/**
	 * 
	 * @return The tournament code's region. 
	 */
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	/**
	 * 
	 * @return 	The provider's ID.
	 */
	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	/**
	 * 
	 * @return The team size for the tournament code game.
	 */
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public Set<Long> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<Long> participants) {
		this.participants = participants;
	}

	/**
	 * 
	 * @return The pick mode for tournament code game.
	 */
	public PickType getPickType() {
		return pickType;
	}

	public void setPickType(PickType pickType) {
		this.pickType = pickType;
	}

	/**
	 * 
	 * @return The tournament's ID.
	 */
	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	/**
	 * 
	 * @return 	The lobby name for the tournament code game.
	 */
	public String getLobbyName() {
		return lobbyName;
	}

	public void setLobbyName(String lobbyName) {
		this.lobbyName = lobbyName;
	}

	/**
	 * 
	 * @return The password for the tournament code game.
	 */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * @return The tournament code's ID.
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The metadata for tournament code.
	 */
	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

}
