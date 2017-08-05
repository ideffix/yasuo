package com.ideffix.yasuo.api.summoner;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.summoner.impl.SummonerApiImpl;
import com.ideffix.yasuo.dto.summoner.SummonerDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Aug 5, 2017 
 *
 * @author IdeFFiX
 */

public class SummonerApiTest extends BaseApiTest {
	
	private SummonerApi summonerApi;
	
	@Before
	public void setUp() {
		summonerApi = new SummonerApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getSummonerByAccountIdTest() {
		SummonerDTO summonerByAccountId = summonerApi.getSummonerByAccountId(IDEFFIX_ACCOUNT_ID);
		
		assertNotNull("Error getting summoner by account id", summonerByAccountId);
	}
	
	@Test
	public void getSummonerByNameTest() {
		SummonerDTO summoner = summonerApi.getSummoner(IDEFFIX_NAME);
		
		assertNotNull("Error getting summoner by name", summoner);
	}
	
	@Test
	public void getSummonerBySummonerId() {
		SummonerDTO summonerBySummonerId = summonerApi.getSummonerBySummonerId(IDEFFIX_SUMMONER_ID);
		
		assertNotNull("Error getting summoner by summoner id", summonerBySummonerId);
	}

}
