package com.ideffix.yasuo.api.tournamentstub;

import java.util.List;

import com.ideffix.yasuo.dto.tournamentstub.LobbyEventDTOWrapper;
import com.ideffix.yasuo.dto.tournamentstub.ProviderRegistrationParametersDTO;
import com.ideffix.yasuo.dto.tournamentstub.TournamentCodeParametersDTO;
import com.ideffix.yasuo.dto.tournamentstub.TournamentRegistrationParametersDTO;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public interface TournamentStubApi {
	
	/**
	 * 
	 * @param tournamentCodeParametersDTO Tournament parameters
	 * @Param touramentId Tournament ID
	 * @return a mock tournament code for the given tournament.
	 */
	List<String> createMockTournamentCode(TournamentCodeParametersDTO tournamentCodeParametersDTO, int tournamentid, int codesCount);

	/**
	 * 
	 * @param tournamentCode The short code to look up lobby events for
	 * @return mock list of lobby events by tournament code
	 */
	LobbyEventDTOWrapper getMockListOfLobbyEvents(String tournamentCode);
	
	/**
	 * 
	 * @param providerRegistrationParametersDTO provider registration parameters
	 * @return tournament provider ID
	 */
	int createMockTournamentProvider(ProviderRegistrationParametersDTO providerRegistrationParametersDTO);
	
	/**
	 * 
	 * @param tournamentRegistrationParametersDTO tournament registration parameters
	 * @return tournament id
	 */
	int createMockTournament(TournamentRegistrationParametersDTO tournamentRegistrationParametersDTO);
}
