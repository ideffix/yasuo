package com.ideffix.yasuo.api.spectator;

import com.ideffix.yasuo.dto.spectator.CurrentGameInfoDTO;
import com.ideffix.yasuo.dto.spectator.FeaturedGamesDTO;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public interface SpectatorApi {
	
	/**
	 * 
	 * @param summonerId Summoner ID
	 * @return current game information for the given summoner ID
	 */
	CurrentGameInfoDTO getCurrentGameInformation(long summonerId);
	
	/**
	 * 
	 * @return list of featured games
	 */
	FeaturedGamesDTO getFeaturedGamesList();
}
