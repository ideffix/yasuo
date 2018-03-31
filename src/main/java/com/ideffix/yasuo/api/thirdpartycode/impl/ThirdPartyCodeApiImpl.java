/**
 * 
 */
package com.ideffix.yasuo.api.thirdpartycode.impl;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.thirdpartycode.ThirdPartyCodeApi;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * @author ideff
 *
 */
public class ThirdPartyCodeApiImpl extends BaseRiotApi implements ThirdPartyCodeApi {

	private static final Logger LOG = Logger.getLogger(ThirdPartyCodeApiImpl.class);

	public ThirdPartyCodeApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	@Override
	public String getThirdPartyCode(long summonerId) {
		LOG.info("Calling getThirdPartyCode service, id: " + summonerId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("third-party-code/by-summoner", summonerId),
				String.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.THIRD_PARTY_CODE_PATH;
	}

}
