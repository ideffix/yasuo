package com.ideffix.yasuo.api.match.impl;

import java.util.List;

import com.ideffix.yasuo.api.match.MatchApi;
import com.ideffix.yasuo.dto.match.MatchDTO;
import com.ideffix.yasuo.dto.match.MatchListDTO;
import com.ideffix.yasuo.dto.match.MatchTimelineDTO;
import com.ideffix.yasuo.dto.matcha.MatchFilters;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class MatchApiApiImpl implements MatchApi {

	public MatchApiApiImpl(String apiKey, Region region) {
		// TODO Auto-generated constructor stub
	}

	public MatchDTO getMatch(long matchId) {
		// TODO Auto-generated method stub
		return null;
	}

	public MatchDTO getMatch(long matchId, long forAccountId) {
		// TODO Auto-generated method stub
		return null;
	}

	public MatchListDTO getMatchList(long accountId, MatchFilters matchFilters) {
		// TODO Auto-generated method stub
		return null;
	}

	public MatchListDTO getLast20Matches(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	public MatchTimelineDTO getMatchTimeline(long matchId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Long> getMatchIDs(String tournamentCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public MatchDTO getMatch(long matchId, String tournamentCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
