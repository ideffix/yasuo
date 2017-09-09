package com.ideffix.yasuo.api.tournament.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.tournament.TournamentApi;
import com.ideffix.yasuo.dto.tournament.TournamentCodeDTO;
import com.ideffix.yasuo.dto.tournament.TournamentCodeUpdateParametersDTO;
import com.ideffix.yasuo.dto.tournamentstub.LobbyEventDTOWrapper;
import com.ideffix.yasuo.dto.tournamentstub.ProviderRegistrationParametersDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.dto.tournamentstub.TournamentCodeParametersDTO;
import com.ideffix.yasuo.dto.tournamentstub.TournamentRegistrationParametersDTO;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class TournamentApiImpl extends BaseRiotApi implements TournamentApi {
	
	private static final Logger LOG = Logger.getLogger(TournamentApiImpl.class);

	public TournamentApiImpl(String apiKey) {
		super(apiKey, Region.AMERICAS);
	}

	@Override
	public List<String> createTournamentCode(TournamentCodeParametersDTO tournamentCodeParametersDTO, int touramentId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("tournamentId", Integer.toString(touramentId));
		LOG.info("Calling createTournamentCode service, touramentId: " + touramentId);
		return callPostRequest("codes", params, tournamentCodeParametersDTO, List.class);
	}

	@Override
	public void updateTournament(String tournamentCode, TournamentCodeUpdateParametersDTO tournamentCodeUpdateParametersDTO) {
		LOG.info("Calling updateTournament service, tournamentCode: " + tournamentCode);
		callPutRequest(PathParamHelper.buildSinglePathParam("codes", tournamentCode), tournamentCodeUpdateParametersDTO, Void.class);
	}

	@Override
	public TournamentCodeDTO getTournamentCode(String tournamentCode) {
		LOG.info("Calling getTournamentCode service, tournamentCode: " + tournamentCode);
		return callGetRequest(PathParamHelper.buildSinglePathParam("codes", tournamentCode), TournamentCodeDTO.class);
	}

	@Override
	public LobbyEventDTOWrapper getListOfLobbyEvents(String tournamentCode) {
		LOG.info("Calling getListOfLobbyEvents service, tournamentCode: " + tournamentCode);
		return callGetRequest(PathParamHelper.buildSinglePathParam("lobby-events/by-code", tournamentCode), LobbyEventDTOWrapper.class);
	}

	@Override
	public int createTournamentProvider(ProviderRegistrationParametersDTO providerRegistrationParametersDTO) {
		LOG.info("Calling createTournamentProvider service");
		return callPostRequest("providers", providerRegistrationParametersDTO, Integer.class);
	}

	@Override
	public int createTournament(TournamentRegistrationParametersDTO tournamentRegistrationParametersDTO) {
		LOG.info("Calling createTournament service");
		return callPostRequest("tournaments", tournamentRegistrationParametersDTO, Integer.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.TOURNAMENT_PATH;
	}

}
