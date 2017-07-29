package com.ideffix.yasuo.api.tournament.impl;

import java.util.List;

import com.ideffix.yasuo.api.tournament.TournamentApi;
import com.ideffix.yasuo.dto.tournament.TournamentCodeDTO;
import com.ideffix.yasuo.dto.tournament.TournamentCodeUpdateParametersDTO;
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

public class TournamentApiImpl implements TournamentApi {

	public TournamentApiImpl(String apiKey, Region region) {
		// TODO Auto-generated constructor stub
	}

	public List<String> createTournamentCode(TournamentCodeParametersDTO tournamentCodeParametersDTO, int touramentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateTournament(String tournamentCode,
			TournamentCodeUpdateParametersDTO tournamentCodeUpdateParametersDTO) {
		// TODO Auto-generated method stub

	}

	public TournamentCodeDTO getTournamentCode(String tournamentCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public LobbyEventDTOWrapper getListOfLobbyEvents(String tournamentCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public int createTournamentProvider(ProviderRegistrationParametersDTO providerRegistrationParametersDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int createTournament(TournamentRegistrationParametersDTO tournamentRegistrationParametersDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

}
