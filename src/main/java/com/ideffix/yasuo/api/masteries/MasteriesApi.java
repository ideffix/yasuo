package com.ideffix.yasuo.api.masteries;

import com.ideffix.yasuo.dto.masteries.MasteryPagesDTO;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public interface MasteriesApi {
	
	/**
	 * 
	 * @param summonerId Summoner ID
	 * @return mastery pages for a given summoner ID.
	 */
	MasteryPagesDTO getMasteryPages(long summonerId);

}
