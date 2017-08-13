package com.ideffix.yasuo.api.tournamentstub.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.tournamentstub.TournamentStubApi;
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

public class TournamentStubApiImpl extends BaseRiotApi implements TournamentStubApi {
	
	private static final Logger LOG = Logger.getLogger(TournamentStubApiImpl.class);

	public TournamentStubApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	@Override
	public List<String> createMockTournamentCode(TournamentCodeParametersDTO tournamentCodeParametersDTO, int tournamentId, int codesCount) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("tournamentId", Integer.toString(tournamentId));
		params.put("codesCount", Integer.toString(codesCount));
		LOG.info("Calling createMockTournamentCode service, tournamentId: " + tournamentId + ", codesCount: " + codesCount);
		return callPostRequest("codes", params, tournamentCodeParametersDTO, List.class);
	}

	@Override
	public LobbyEventDTOWrapper getMockListOfLobbyEvents(String tournamentCode) {
		LOG.info("Calling getMockListOfLobbyEvents service, tournamentCode: " + tournamentCode);
		return callGetRequest(PathParamHelper.buildSinglePathParam("lobby-events/by-code", tournamentCode), LobbyEventDTOWrapper.class);
	}

	@Override
	public int createMockTournamentProvider(ProviderRegistrationParametersDTO providerRegistrationParametersDTO) {
		LOG.info("Calling createMockTournamentProvider service");
		return callPostRequest("providers", providerRegistrationParametersDTO, Integer.class);
	}

	@Override
	public int createMockTournament(TournamentRegistrationParametersDTO tournamentRegistrationParametersDTO) {
		LOG.info("Calling createMockTournament service");
		return callPostRequest("tournaments", tournamentRegistrationParametersDTO, Integer.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.TOURNAMENT_STUB_PATH;
	}

}
