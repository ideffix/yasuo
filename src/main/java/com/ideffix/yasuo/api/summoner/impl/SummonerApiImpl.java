package com.ideffix.yasuo.api.summoner.impl;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.summoner.SummonerApi;
import com.ideffix.yasuo.dto.summoner.SummonerDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class SummonerApiImpl extends BaseRiotApi implements SummonerApi {

	private static final Logger LOG = Logger.getLogger(SummonerApiImpl.class);
	
	public SummonerApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	@Override
	public SummonerDTO getSummonerByAccountId(long accountId) {
		LOG.info("Calling getSummonerByAccountId service, accountId: " + accountId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("summoners/by-account", accountId), SummonerDTO.class);
	}

	@Override
	public SummonerDTO getSummoner(String summonerName) {
		LOG.info("Calling getSummoner service, summonerName: " + summonerName);
		return callGetRequest(PathParamHelper.buildSinglePathParam("summoners/by-name", summonerName), SummonerDTO.class);
	}

	@Override
	public SummonerDTO getSummonerBySummonerId(long summonerId) {
		LOG.info("Calling getSummonerBySummonerId service, summonerId: " + summonerId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("summoners", summonerId), SummonerDTO.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.SUMMONERS_PATH;
	}

}
