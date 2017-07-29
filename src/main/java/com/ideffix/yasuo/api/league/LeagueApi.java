package com.ideffix.yasuo.api.league;

import java.util.Set;

import com.ideffix.yasuo.dto.common.QueueType;
import com.ideffix.yasuo.dto.league.LeagueListDTO;
import com.ideffix.yasuo.dto.league.LeaguePositionDTO;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public interface LeagueApi {
	
	/**
	 * 
	 * @param queueType QueueType
	 * @return challenger league for a given queue
	 */
	LeagueListDTO getChallangerLeague(QueueType queueType);

	/**
	 * 
	 * @param queueType QueueType
	 * @return master league for a given queue
	 */
	LeagueListDTO getMasterLeague(QueueType queueType);
	
	/**
	 * 
	 * @param summonerId Summoner ID associated with the player
	 * @return leagues in all queues for a given summoner ID
	 */
	Set<LeagueListDTO> getLeagues(long summonerId);
	
	/**
	 * 
	 * @param summonerId Summoner ID associated with the player
	 * @return league positions in all queues for a given summoner ID
	 */
	Set<LeaguePositionDTO> getLeaguePosition(long summonerId);
	
}
