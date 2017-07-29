package com.ideffix.yasuo.api.championmastery;

import java.util.List;

import com.ideffix.yasuo.dto.championmastery.ChampionMasteryDTO;

/**
 * @author IdeFFiX
 *
 * Jul 29, 2017
 */
public interface ChampionMasteryApi {
	
	/**
	 * 
	 * @param summonerId Summoner ID associated with the player
	 * @return all champion mastery entries sorted by number of champion points descending
	 */
	List<ChampionMasteryDTO> getAllChampionMastery(long summonerId);
	
	/**
	 * 
	 * @param summonerId Summoner ID associated with the player
	 * @param championId Champion ID to retrieve Champion Mastery for
	 * @return a champion mastery by player ID and champion ID.
	 */
	ChampionMasteryDTO getChampionMastery(long summonerId, long championId);
	
	/**
	 *
	 * @param summonerId Summoner ID associated with the player
	 * @return a player's total champion mastery score, which is the sum of individual champion mastery levels
	 */
	Integer getTotalPlayerChampionMasteryScore(long summonerId);

}
