package com.ideffix.yasuo.api.tournament;

import java.util.List;

import com.ideffix.yasuo.dto.tournament.TournamentCodeDTO;
import com.ideffix.yasuo.dto.tournament.TournamentCodeUpdateParametersDTO;
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

public interface TournamentApi {
	
	/**
	 * 
	 * @param tournamentCodeParametersDTO tournament code parameters
	 * @param touramentId Tournament ID
	 * @param count count of tournament codes
	 * @return tournament code
	 */
	List<String> createTournamentCode(TournamentCodeParametersDTO tournamentCodeParametersDTO, int touramentId, int count);
	
	/**
	 * 
	 * @param tournamentCode The tournament code to update
	 * @param tournamentCodeUpdateParametersDTO tournament code update parameters
	 */
	void updateTournament(String tournamentCode, TournamentCodeUpdateParametersDTO tournamentCodeUpdateParametersDTO);

	/**
	 * 
	 * @param tournamentCode The tournament code string
	 * @return the tournament code DTO associated with a tournament code string
	 */
	TournamentCodeDTO getTournamentCode(String tournamentCode);
	
	/**
	 * 
	 * @param tournamentCode The short code to look up lobby events for
	 * @return a list of lobby events by tournament code
	 */
	LobbyEventDTOWrapper getListOfLobbyEvents(String tournamentCode);
	
	/**
	 * 
	 * @param providerRegistrationParametersDTO provider registration parameters
	 * @return tournament provider ID
	 */
	int createTournamentProvider(ProviderRegistrationParametersDTO providerRegistrationParametersDTO);
	
	/**
	 * 
	 * @param tournamentRegistrationParametersDTO tournament registration parameters
	 * @return tournament ID
	 */
	int createTournament(TournamentRegistrationParametersDTO tournamentRegistrationParametersDTO);
	
}
