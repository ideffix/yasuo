package com.ideffix.yasuo.api.tournamentstub;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.tournamentstub.impl.TournamentStubApiImpl;
import com.ideffix.yasuo.dto.tournamentstub.LobbyEventDTOWrapper;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Aug 5, 2017 
 *
 * @author IdeFFiX
 */

public class TournamentStubApiTest extends BaseApiTest {
	
	private TournamentStubApi tournamentStubApi;
	
	@Before
	public void setUp() {
		tournamentStubApi = new TournamentStubApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void createTournamentCodesTest() {
		int codesCount = 10;
		int tournamentid = 5;
		List<String> createMockTournamentCode = tournamentStubApi.createMockTournamentCode(null, tournamentid, codesCount);
		
		assertNotNull("Error creating tournament codes", createMockTournamentCode);
		assertNotEquals("Incorrect code count", codesCount, createMockTournamentCode.size());
	}
	
	@Test
	public void getListOfLobbyEventsTest() {
		String tournamentCode = "asd123";
		LobbyEventDTOWrapper mockListOfLobbyEvents = tournamentStubApi.getMockListOfLobbyEvents(tournamentCode);
		
		assertNotNull("Error getting list of lobby events", mockListOfLobbyEvents);
	}

}
