package com.ideffix.yasuo.dto.tournament;

import com.ideffix.yasuo.dto.tournamentstub.MapType;
import com.ideffix.yasuo.dto.tournamentstub.PickType;
import com.ideffix.yasuo.dto.tournamentstub.SpectatorType;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class TournamentCodeUpdateParametersDTO {
	
	private SpectatorType spectatorType;
	private PickType pickType;
	private String allowedParticipants;
	private MapType mapType;

	/**
	 * 
	 * @return The spectator type
	 */
	public SpectatorType getSpectatorType() {
		return spectatorType;
	}

	public void setSpectatorType(SpectatorType spectatorType) {
		this.spectatorType = spectatorType;
	}

	/**
	 * 
	 * @return The pick type
	 */
	public PickType getPickType() {
		return pickType;
	}

	public void setPickType(PickType pickType) {
		this.pickType = pickType;
	}

	/**
	 * 
	 * @return Comma separated list of summoner Ids
	 */
	public String getAllowedParticipants() {
		return allowedParticipants;
	}

	public void setAllowedParticipants(String allowedParticipants) {
		this.allowedParticipants = allowedParticipants;
	}

	/**
	 * 
	 * @return The map type 
	 */
	public MapType getMapType() {
		return mapType;
	}

	public void setMapType(MapType mapType) {
		this.mapType = mapType;
	}

}
