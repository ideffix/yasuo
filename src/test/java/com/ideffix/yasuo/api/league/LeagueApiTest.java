package com.ideffix.yasuo.api.league;

import static org.junit.Assert.assertNotNull;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.league.impl.LeagueApiImpl;
import com.ideffix.yasuo.dto.common.QueueType;
import com.ideffix.yasuo.dto.league.LeagueListDTO;
import com.ideffix.yasuo.dto.league.LeaguePositionDTO;
import com.ideffix.yasuo.dto.league.MmrAfDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Jul 30, 2017 
 *
 * @author IdeFFiX
 */

public class LeagueApiTest extends BaseApiTest {

	private LeagueApi leagueApi;
	
	@Before
	public void setUp() {
		leagueApi = new LeagueApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getChallengerLeagueTest() {
		LeagueListDTO challangerLeague = leagueApi.getChallangerLeague(QueueType.RANKED_SOLO_5x5);
		
		assertNotNull("Error getting challenger league", challangerLeague);
	}
	
	@Test
	public void getLeaguesTest() {
		Set<LeagueListDTO> leagues = leagueApi.getLeagues(IDEFFIX_SUMMONER_ID);
		
		assertNotNull("Error getting IdeFFiX leagues", leagues);
	}
	
	@Test
	public void getMasterLeagueTest() {
		LeagueListDTO challangerLeague = leagueApi.getMasterLeague(QueueType.RANKED_SOLO_5x5);
		
		assertNotNull("Error getting challenger league", challangerLeague);
	}
	
	@Test
	public void getLeaguePositionsTest() {
		Set<LeaguePositionDTO> leaguePosition = leagueApi.getLeaguePosition(IDEFFIX_SUMMONER_ID);
		
		assertNotNull("Error getting league position", leaguePosition);
	}
	
	@Test
	public void getMmrTest() {
		MmrAfDTO mmr = leagueApi.getMmr(IDEFFIX_SUMMONER_ID);
		
		assertNotNull("Error while getting mmr", mmr);
	}
	
}
