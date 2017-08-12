package com.ideffix.yasuo.api.championmastery.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.championmastery.ChampionMasteryApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.dto.championmastery.ChampionMasteryDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class ChampionMasteryApiImpl extends BaseRiotApi implements ChampionMasteryApi {
	
	private static final Logger LOG = Logger.getLogger(ChampionMasteryApiImpl.class);

	public ChampionMasteryApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	public List<ChampionMasteryDTO> getAllChampionMastery(long summonerId) {
		LOG.info("Calling getAllCHampionMastery service");
		return callGetRequest(PathParamHelper.buildSinglePathParam("champion-masteries/by-summoner", summonerId), List.class);
	}

	public ChampionMasteryDTO getChampionMastery(long summonerId, long championId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("champion-masteries/by-summoner", Long.toString(summonerId));
		params.put("by-champion", Long.toString(championId));
		
		LOG.info("Calling getChampionMastery service, summonerId: " + summonerId + ", championId" + championId);
		return callGetRequest(PathParamHelper.buildMultiplyPathParam(params), ChampionMasteryDTO.class);
	}

	public Integer getTotalPlayerChampionMasteryScore(long summonerId) {
		LOG.info("Calling getTotalPlayerChampionMasteryScore service, summonerId: " + summonerId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("scores/by-summoner", summonerId), Integer.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.CHAMPION_MASTERY_PATH;
	}

}
