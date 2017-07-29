package com.ideffix.yasuo.api.runes;

import com.ideffix.yasuo.dto.runes.RunePagesDTO;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public interface RunesApi {
	
	/**
	 * 
	 * @param summonerId Summoner ID
	 * @return rune pages for a given summoner ID
	 */
	RunePagesDTO getRunePages(long summonerId);

}
