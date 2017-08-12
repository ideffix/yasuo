package com.ideffix.yasuo.api.champion.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.champion.ChampionApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.dto.champion.ChampionDTO;
import com.ideffix.yasuo.dto.champion.ChampionListDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class ChampionApiImpl extends BaseRiotApi implements ChampionApi {
	
	private static final Logger LOG = Logger.getLogger(ChampionApiImpl.class);

	public ChampionApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	public ChampionListDTO getAllChampions() {
		LOG.info("Calling getChampions service");
		return callGetRequest("champions", ChampionListDTO.class);
	}

	public ChampionListDTO getAllChampions(boolean freeToPlay) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("freeToPlay", Boolean.toString(freeToPlay));
		
		LOG.info("Calling getChampions service, freeToPlay=" + freeToPlay);
		return callGetRequest("champions", ChampionListDTO.class);
	}

	public ChampionDTO getChampion(int championId) {
		LOG.info("Calling get champion service, championId: " + championId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("champions", championId), ChampionDTO.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.CHAMPIONS_PATH;
	}

}
