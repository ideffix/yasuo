package com.ideffix.yasuo.api.lolstatus.impl;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.lolstatus.LolStatusApi;
import com.ideffix.yasuo.dto.lolstatus.ShardStatusDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Jul 29, 2017
 *
 * @author IdeFFiX
 */

public class LolStatusApiImpl extends BaseRiotApi implements LolStatusApi {
	
	private static final Logger LOG = Logger.getLogger(LolStatusApiImpl.class);

	public LolStatusApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	public ShardStatusDTO getLolStatus() {
		LOG.info("Calling getLolStatus service");
		return callGetRequest("shard-data", ShardStatusDTO.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.LOL_STATUS_PATH;
	}

}
