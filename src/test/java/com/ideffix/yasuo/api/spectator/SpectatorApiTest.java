package com.ideffix.yasuo.api.spectator;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.spectator.impl.SpectatorApiApiImpl;
import com.ideffix.yasuo.dto.spectator.CurrentGameInfoDTO;
import com.ideffix.yasuo.dto.spectator.FeaturedGamesDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Aug 1, 2017 
 *
 * @author IdeFFiX
 */

public class SpectatorApiTest extends BaseApiTest {
	
	private SpectatorApi spectatorApi;
	
	@Before
	public void setUp() {
		spectatorApi = new SpectatorApiApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getCurrentGameInfoTest() {
		CurrentGameInfoDTO currentGameInformation = spectatorApi.getCurrentGameInformation(IDEFFIX_SUMMONER_ID);
		
		assertNotNull("Error getting current game info", currentGameInformation);
	}
	
	@Test
	public void getFeaturedGamesTest() {
		FeaturedGamesDTO featuredGamesList = spectatorApi.getFeaturedGamesList();
		
		assertNotNull("Error getting featured games", featuredGamesList);
	}
	

}
