package com.ideffix.yasuo.api.match;

import java.util.List;

import com.ideffix.yasuo.dto.match.MatchDTO;
import com.ideffix.yasuo.dto.match.MatchListDTO;
import com.ideffix.yasuo.dto.match.MatchTimelineDTO;
import com.ideffix.yasuo.dto.matcha.MatchFilters;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public interface MatchApi {
	
	/**
	 * 
	 * @param matchId Match ID
	 * @return match by match ID
	 */
	MatchDTO getMatch(long matchId);
	
	/**
	 * 
	 * @param matchId Match ID
	 * @param forAccountId If provided, used to identify the participant to be unobfuscated.
	 * @return match by match ID
	 */
	MatchDTO getMatch(long matchId, long forAccountId);
	
	/**
	 * 
	 * @param accountId The account ID
	 * @param matchFilters match filters
	 * @return
	 */
	MatchListDTO getMatchList(long accountId, MatchFilters matchFilters);
	
	/**
	 * 
	 * @param accountId The account ID
	 * @return matchlist for last 20 matches played on given account ID and platform ID
	 */
	MatchListDTO getLast20Matches(long accountId);
	
	/**
	 * 
	 * @param matchId Match ID
	 * @return match timeline by match ID
	 */
	MatchTimelineDTO getMatchTimeline(long matchId);
	
	/**
	 * 
	 * @param tournamentCode The tournament code.
	 * @return match IDs by tournament code
	 */
	List<Long> getMatchIDs(String tournamentCode);
	
	/**
	 * 
	 * @param matchId The match ID.
	 * @param tournamentCode The tournament code.
	 * @return match by match ID and tournament code
	 */
	MatchDTO getMatch(long matchId, String tournamentCode);

}
