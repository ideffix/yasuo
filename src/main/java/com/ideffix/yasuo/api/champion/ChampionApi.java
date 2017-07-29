/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

package com.ideffix.yasuo.api.champion;

import com.ideffix.yasuo.dto.champion.ChampionDTO;
import com.ideffix.yasuo.dto.champion.ChampionListDTO;

public interface ChampionApi {

	/**
	 * 
	 * @return Retrieve all champions.
	 */
	ChampionListDTO getAllChampions();
	
	/**
	 * 
	 * @param freeToPlay Optional filter param to retrieve only free to play champions.
	 * @return Retrieve all champions.
	 */
	ChampionListDTO getAllChampions(boolean freeToPlay);
	
	/**
	 * 
	 * @param championId Champion ID
	 * @return Retrieve champion by ID
	 */
	ChampionDTO getChampion(int championId);
}
