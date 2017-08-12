package com.ideffix.yasuo.api.match.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.RiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.match.MatchApi;
import com.ideffix.yasuo.dto.match.MatchDTO;
import com.ideffix.yasuo.dto.match.MatchListDTO;
import com.ideffix.yasuo.dto.match.MatchTimelineDTO;
import com.ideffix.yasuo.dto.matcha.MatchFilters;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class MatchApiApiImpl extends BaseRiotApi implements MatchApi {
	
	private static final Logger LOG = Logger.getLogger(MatchApiApiImpl.class);

	public MatchApiApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	@Override
	public MatchDTO getMatch(long matchId) {
		LOG.info("Calling getMatch service, matchId: " + matchId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("matches", matchId), MatchDTO.class);
	}
	
	@Override
	public MatchListDTO getMatchList(long accountId) {
		LOG.info("Calling getMatchList service, accountId: " + accountId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("matchlists/by-account", accountId), MatchListDTO.class);
	}

	@Override
	public MatchListDTO getLast20Matches(long accountId) {
		LOG.info("Calling getLast20Matches service, accountId: " + accountId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("matchlists/by-account", accountId) + "/recent", MatchListDTO.class);
	}

	@Override
	public MatchTimelineDTO getMatchTimeline(long matchId) {
		LOG.info("Calling getMatchTimeline service, matchId: " + matchId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("timelines/by-match", matchId), MatchTimelineDTO.class);
	}

	@Override
	public List<Long> getMatchIDs(String tournamentCode) {
		LOG.info("Calling getMatchIDs service, tournamentCode: " + tournamentCode);
		return callGetRequest(PathParamHelper.buildSinglePathParam("matches/by-tournament-code", tournamentCode) + "/ids", List.class);
	}

	@Override
	public MatchDTO getMatch(long matchId, String tournamentCode) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("matches", Long.toString(matchId));
		params.put("by-tournament-code", tournamentCode);
		LOG.info("Calling getMatch service, matchId: " + matchId + ", tournamentCode: " + tournamentCode);
		return callGetRequest(PathParamHelper.buildMultiplyPathParam(params), MatchDTO.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.MATCH_PATH;
	}

}
