package com.ideffix.yasuo.api.league.impl;

import java.util.Set;

import com.ideffix.yasuo.api.league.LeagueApi;
import com.ideffix.yasuo.dto.common.QueueType;
import com.ideffix.yasuo.dto.league.LeagueListDTO;
import com.ideffix.yasuo.dto.league.LeaguePositionDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class LeagueApiImpl implements LeagueApi {

	public LeagueApiImpl(String apiKey, Region region) {
		// TODO Auto-generated constructor stub
	}

	public LeagueListDTO getChallangerLeague(QueueType queueType) {
		// TODO Auto-generated method stub
		return null;
	}

	public LeagueListDTO getMasterLeague(QueueType queueType) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<LeagueListDTO> getLeagues(long summonerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<LeaguePositionDTO> getLeaguePosition(long summonerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
