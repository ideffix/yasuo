package com.ideffix.yasuo.api.summoner;

import com.ideffix.yasuo.dto.summoner.SummonerDTO;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public interface SummonerApi {
	
	/**
	 * 
	 * @param accountId AccountId
	 * @return summoner by account ID
	 */
	SummonerDTO getSummonerByAccountId(long accountId);

	/**
	 * 
	 * @param summonerName Summoner name
	 * @return summoner by summoner name.
	 */
	SummonerDTO getSummoner(String summonerName);
	
	/**
	 * 
	 * @param summonerId Summoner ID
	 * @return summoner by summoner ID
	 */
	SummonerDTO getSummonerBySummonerId(long summonerId);
	
}
