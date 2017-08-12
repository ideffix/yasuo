package com.ideffix.yasuo.api.league.impl;

import java.util.Set;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.league.LeagueApi;
import com.ideffix.yasuo.dto.common.QueueType;
import com.ideffix.yasuo.dto.league.LeagueListDTO;
import com.ideffix.yasuo.dto.league.LeaguePositionDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class LeagueApiImpl extends BaseRiotApi implements LeagueApi {
	
	private static final Logger LOG = Logger.getLogger(LeagueApiImpl.class);

	public LeagueApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	@Override
	public LeagueListDTO getChallangerLeague(QueueType queueType) {
		LOG.info("Calling getChallangerLeague service, queueType: " + queueType);
		return callGetRequest(PathParamHelper.buildSinglePathParam("challengerleagues/by-queue", queueType.toString()), LeagueListDTO.class);
	}

	@Override
	public LeagueListDTO getMasterLeague(QueueType queueType) {
		LOG.info("Calling getMasterLeague service, queueType: " + queueType);
		return callGetRequest(PathParamHelper.buildSinglePathParam("masterleagues/by-queue", queueType.toString()), LeagueListDTO.class);
	}

	@Override
	public Set<LeagueListDTO> getLeagues(long summonerId) {
		LOG.info("Calling getLeagues service, summonerId: " + summonerId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("leagues/by-summoner", summonerId), Set.class);
	}

	@Override
	public Set<LeaguePositionDTO> getLeaguePosition(long summonerId) {
		LOG.info("Calling getLeaguePosition service, summonerId: " + summonerId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("positions/by-summoner", summonerId), Set.class);
	}
	
	@Override
	protected String specificApiPath() {
		return RiotApiConstans.LEAGUE_PATH;
	}

}
