package com.ideffix.yasuo.api.championmastery;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.championmastery.impl.ChampionMasteryApiImpl;
import com.ideffix.yasuo.dto.championmastery.ChampionMasteryDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Jul 30, 2017 
 *
 * @author IdeFFiX
 */

public class ChampionMasteryApiKeyTest extends BaseApiTest {

	private ChampionMasteryApi championMasteryApi;	
	
	@Before
	public void setUp() {
		championMasteryApi = new ChampionMasteryApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getAllChampionMasteryTest() {
		List<ChampionMasteryDTO> allChampionMastery = championMasteryApi.getAllChampionMastery(IDEFFIX_SUMMONER_ID);
		
		assertNotNull("Error getting all champion mastery", allChampionMastery);
	}
	
	@Test
	public void getChampionMasteryByPlayerAnsChampionIdTest() {
		ChampionMasteryDTO championMastery = championMasteryApi.getChampionMastery(IDEFFIX_SUMMONER_ID, YASUO_ID);
		
		assertNotNull("Error getting champion mastery", championMastery);
	}
	
	@Test
	public void getTotalPlayerChampionMasteryScoreTest() {
		Integer totalPlayerChampionMasteryScore = championMasteryApi.getTotalPlayerChampionMasteryScore(IDEFFIX_SUMMONER_ID);
		
		assertNotNull("Error gettin total player champion mastery score", totalPlayerChampionMasteryScore);
	}

}
