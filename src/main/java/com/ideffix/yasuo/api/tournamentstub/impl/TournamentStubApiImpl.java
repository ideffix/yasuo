package com.ideffix.yasuo.api.tournamentstub.impl;

import java.util.List;

import com.ideffix.yasuo.api.tournamentstub.TournamentStubApi;
import com.ideffix.yasuo.dto.tournamentstub.LobbyEventDTOWrapper;
import com.ideffix.yasuo.dto.tournamentstub.ProviderRegistrationParametersDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.dto.tournamentstub.TournamentCodeParametersDTO;
import com.ideffix.yasuo.dto.tournamentstub.TournamentRegistrationParametersDTO;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class TournamentStubApiImpl implements TournamentStubApi {

	public TournamentStubApiImpl(String apiKey, Region region) {
		// TODO Auto-generated constructor stub
	}

	public List<String> createMockTournamentCode(TournamentCodeParametersDTO tournamentCodeParametersDTO,
			int tournamentid) {
		// TODO Auto-generated method stub
		return null;
	}

	public LobbyEventDTOWrapper getMockListOfLobbyEvents(String tournamentCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public int createMockTournamentProvider(ProviderRegistrationParametersDTO providerRegistrationParametersDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int createMockTournament(TournamentRegistrationParametersDTO tournamentRegistrationParametersDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

}
