package com.ideffix.yasuo.api.tournamentstub;

import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.tournamentstub.impl.TournamentStubApiImpl;
import com.ideffix.yasuo.dto.tournamentstub.LobbyEventDTOWrapper;
import com.ideffix.yasuo.dto.tournamentstub.MapType;
import com.ideffix.yasuo.dto.tournamentstub.PickType;
import com.ideffix.yasuo.dto.tournamentstub.ProviderRegistrationParametersDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.dto.tournamentstub.SpectatorType;
import com.ideffix.yasuo.dto.tournamentstub.SummonerIdParamsDTO;
import com.ideffix.yasuo.dto.tournamentstub.TournamentCodeParametersDTO;
import com.ideffix.yasuo.dto.tournamentstub.TournamentRegistrationParametersDTO;

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
		tournamentStubApi = new TournamentStubApiImpl(lolProperties.getApiKey());
	}
	
	@Test
	public void createTournamentTest() {
		ProviderRegistrationParametersDTO parametersDTO = new ProviderRegistrationParametersDTO();
		parametersDTO.setRegion(Region.EUNE);
		parametersDTO.setUrl("http://cebulol.pl/hey");
		Integer providerId = tournamentStubApi.createMockTournamentProvider(parametersDTO);	
		assertNotNull("Error creating tournament provider", providerId);
		
		TournamentRegistrationParametersDTO registrationParametersDTO = new TournamentRegistrationParametersDTO();
		registrationParametersDTO.setName("Test tournament");
		registrationParametersDTO.setProviderId(providerId);
		Integer tournamentId = tournamentStubApi.createMockTournament(registrationParametersDTO);
		assertNotNull("Error creating tournament", providerId);
					
		int codesCount = 2;
		List<String> createMockTournamentCode = tournamentStubApi.createMockTournamentCode(prepareTournamentCodeParameters(), tournamentId, codesCount);	
		assertNotNull("Error creating tournament codes", createMockTournamentCode);
	}
	
	private TournamentCodeParametersDTO prepareTournamentCodeParameters() {
		TournamentCodeParametersDTO tournament = new TournamentCodeParametersDTO();
		tournament.setSpectatorType(SpectatorType.ALL);
		tournament.setTeamSize(1);
		tournament.setPickType(PickType.ALL_RANDOM);
		tournament.setMapType(MapType.HOWLING_ABYSS);
		SummonerIdParamsDTO allowedSummoners = new SummonerIdParamsDTO();
		Set<Long> allowed = new HashSet<Long>();
		allowed.add(123L);
		allowed.add(1234L);
		allowedSummoners.setParticipants(allowed);
		tournament.setAllowedSummonerIds(allowedSummoners);
		return tournament;
	}

	@Test
	public void getListOfLobbyEventsTest() {
		String tournamentCode = "asd123";
		LobbyEventDTOWrapper mockListOfLobbyEvents = tournamentStubApi.getMockListOfLobbyEvents(tournamentCode);
		
		assertNotNull("Error getting list of lobby events", mockListOfLobbyEvents);
	}

}
