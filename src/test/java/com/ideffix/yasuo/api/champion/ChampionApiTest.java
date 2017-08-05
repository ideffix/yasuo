package com.ideffix.yasuo.api.champion;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.champion.impl.ChampionApiImpl;
import com.ideffix.yasuo.dto.champion.ChampionDTO;
import com.ideffix.yasuo.dto.champion.ChampionListDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Jul 30, 2017 
 *
 * @author IdeFFiX
 */

public class ChampionApiTest extends BaseApiTest {

	private ChampionApi championApi;
	
	@Before
	public void setUp() {
		championApi = new ChampionApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getAllChampionTest() {
		ChampionListDTO allChampions = championApi.getAllChampions();
		ChampionListDTO freeToPlayChampions = championApi.getAllChampions(true);
		
		assertNotNull("Error getting all champions", allChampions);
		assertNotNull("Error getting all free to play champions", freeToPlayChampions);
	}
	
	@Test
	public void getChampionByIdTest() {
		ChampionDTO champion = championApi.getChampion(YASUO_ID);
		
		assertNotNull("Error getting champion  by ID", champion);
	}

}
