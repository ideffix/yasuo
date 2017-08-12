package com.ideffix.yasuo.api.masteries.impl;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.masteries.MasteriesApi;
import com.ideffix.yasuo.dto.masteries.MasteryPagesDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class MasteriesApiImpl extends BaseRiotApi implements MasteriesApi {
	
	private static final Logger LOG = Logger.getLogger(MasteriesApiImpl.class);

	public MasteriesApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	@Override
	public MasteryPagesDTO getMasteryPages(long summonerId) {
		LOG.info("Calling getMasteryPages service, summonerId: " + summonerId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("masteries/by-summoner", summonerId), MasteryPagesDTO.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.MASTERIES_PATH;
	}

}
