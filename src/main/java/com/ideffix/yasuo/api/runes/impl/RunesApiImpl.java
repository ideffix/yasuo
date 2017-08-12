package com.ideffix.yasuo.api.runes.impl;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.runes.RunesApi;
import com.ideffix.yasuo.dto.runes.RunePagesDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class RunesApiImpl extends BaseRiotApi implements RunesApi {
	
	private static final Logger LOG = Logger.getLogger(RunesApiImpl.class);

	public RunesApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	@Override
	public RunePagesDTO getRunePages(long summonerId) {
		LOG.info("Calling getRunePages service, summonerId: " + summonerId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("runes/by-summoner", summonerId), RunePagesDTO.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.RUNES_PATH;
	}

}
