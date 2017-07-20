package com.ideffix.yasuo.dto.champion;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class ChampionListDTO {
	
	private List<ChampionDTO> champions;

	/**
	 * 
	 * @return The collection of champion information.
	 */
	public List<ChampionDTO> getChampions() {
		return champions;
	}

	public void setChampions(List<ChampionDTO> champions) {
		this.champions = champions;
	}


}
