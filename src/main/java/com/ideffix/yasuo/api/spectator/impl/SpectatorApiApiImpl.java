package com.ideffix.yasuo.api.spectator.impl;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.spectator.SpectatorApi;
import com.ideffix.yasuo.dto.spectator.CurrentGameInfoDTO;
import com.ideffix.yasuo.dto.spectator.FeaturedGamesDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class SpectatorApiApiImpl extends BaseRiotApi implements SpectatorApi {
	
	private static final Logger LOG = Logger.getLogger(SpectatorApiApiImpl.class);

	public SpectatorApiApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	public CurrentGameInfoDTO getCurrentGameInformation(long summonerId) {
		LOG.info("Calling getCurrentGameInformation service, summonerId: " + summonerId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("active-games/by-summoner", summonerId), CurrentGameInfoDTO.class);
	}

	public FeaturedGamesDTO getFeaturedGamesList() {
		LOG.info("Calling getFeaturedGamesList service");
		return callGetRequest("featured-games", FeaturedGamesDTO.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.SPECTATOR_PATH;
	}

}
