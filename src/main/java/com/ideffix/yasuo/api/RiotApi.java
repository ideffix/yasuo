package com.ideffix.yasuo.api;

import com.ideffix.yasuo.api.champion.ChampionApi;
import com.ideffix.yasuo.api.champion.impl.ChampionApiImpl;
import com.ideffix.yasuo.api.championmastery.ChampionMasteryApi;
import com.ideffix.yasuo.api.championmastery.impl.ChampionMasteryApiImpl;
import com.ideffix.yasuo.api.league.LeagueApi;
import com.ideffix.yasuo.api.league.impl.LeagueApiImpl;
import com.ideffix.yasuo.api.lolstaticdata.LolStaticDataApi;
import com.ideffix.yasuo.api.lolstaticdata.impl.LolStaticDataApiImpl;
import com.ideffix.yasuo.api.lolstatus.LolStatusApi;
import com.ideffix.yasuo.api.lolstatus.impl.LolStatusApiImpl;
import com.ideffix.yasuo.api.masteries.MasteriesApi;
import com.ideffix.yasuo.api.masteries.impl.MasteriesApiImpl;
import com.ideffix.yasuo.api.match.MatchApi;
import com.ideffix.yasuo.api.match.impl.MatchApiApiImpl;
import com.ideffix.yasuo.api.runes.RunesApi;
import com.ideffix.yasuo.api.runes.impl.RunesApiImpl;
import com.ideffix.yasuo.api.spectator.SpectatorApi;
import com.ideffix.yasuo.api.spectator.impl.SpectatorApiApiImpl;
import com.ideffix.yasuo.api.summoner.SummonerApi;
import com.ideffix.yasuo.api.summoner.impl.SummonerApiImpl;
import com.ideffix.yasuo.api.tournament.TournamentApi;
import com.ideffix.yasuo.api.tournament.impl.TournamentApiImpl;
import com.ideffix.yasuo.api.tournamentstub.TournamentStubApi;
import com.ideffix.yasuo.api.tournamentstub.impl.TournamentStubApiImpl;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class RiotApi {
	
	private String apiKey;
	
	private Region region;
	
	private ChampionApi championApi;
	
	private ChampionMasteryApi championMasteryApi;
	
	private LeagueApi leagueApi;
	
	private LolStaticDataApi lolStaticDataApi;
	
	private LolStatusApi lolStatusApi;
	
	private MasteriesApi masteriesApi;
	
	private MatchApi matchApi;
	
	private RunesApi runesApi;
	
	private SpectatorApi spectatorApi;
	
	private SummonerApi summonerApi;
	
	private TournamentApi tournamentApi;
	
	private TournamentStubApi tournamentStubApi;
	
	
	public RiotApi(String apiKey, Region region) {
		this.apiKey = apiKey;
		this.region = region;
		
		init();
	}

	private void init() {
		championApi = new ChampionApiImpl(apiKey, region);
		championMasteryApi = new ChampionMasteryApiImpl(apiKey, region);
		leagueApi = new LeagueApiImpl(apiKey, region);
		lolStaticDataApi = new LolStaticDataApiImpl(apiKey, region);
		lolStatusApi = new LolStatusApiImpl(apiKey, region);
		masteriesApi = new MasteriesApiImpl(apiKey, region);
		matchApi = new MatchApiApiImpl(apiKey, region);
		runesApi = new RunesApiImpl(apiKey, region);
		spectatorApi = new SpectatorApiApiImpl(apiKey, region);
		summonerApi = new SummonerApiImpl(apiKey, region);
		tournamentApi = new TournamentApiImpl(apiKey);
		tournamentStubApi = new TournamentStubApiImpl(apiKey);
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public ChampionApi getChampionApi() {
		return championApi;
	}

	public void setChampionApi(ChampionApi championApi) {
		this.championApi = championApi;
	}

	public ChampionMasteryApi getChampionMasteryApi() {
		return championMasteryApi;
	}

	public void setChampionMasteryApi(ChampionMasteryApi championMasteryApi) {
		this.championMasteryApi = championMasteryApi;
	}

	public LeagueApi getLeagueApi() {
		return leagueApi;
	}

	public void setLeagueApi(LeagueApi leagueApi) {
		this.leagueApi = leagueApi;
	}

	public LolStaticDataApi getLolStaticDataApi() {
		return lolStaticDataApi;
	}

	public void setLolStaticDataApi(LolStaticDataApi lolStaticDataApi) {
		this.lolStaticDataApi = lolStaticDataApi;
	}

	public LolStatusApi getLolStatusApi() {
		return lolStatusApi;
	}

	public void setLolStatusApi(LolStatusApi lolStatusApi) {
		this.lolStatusApi = lolStatusApi;
	}

	public MasteriesApi getMasteriesApi() {
		return masteriesApi;
	}

	public void setMasteriesApi(MasteriesApi masteriesApi) {
		this.masteriesApi = masteriesApi;
	}

	public MatchApi getMatchApi() {
		return matchApi;
	}

	public void setMatchApi(MatchApi matchApi) {
		this.matchApi = matchApi;
	}

	public RunesApi getRunesApi() {
		return runesApi;
	}

	public void setRunesApi(RunesApi runesApi) {
		this.runesApi = runesApi;
	}

	public SpectatorApi getSpectatorApi() {
		return spectatorApi;
	}

	public void setSpectatorApi(SpectatorApi spectatorApi) {
		this.spectatorApi = spectatorApi;
	}

	public SummonerApi getSummonerApi() {
		return summonerApi;
	}

	public void setSummonerApi(SummonerApi summonerApi) {
		this.summonerApi = summonerApi;
	}

	public TournamentApi getTournamentApi() {
		return tournamentApi;
	}

	public void setTournamentApi(TournamentApi tournamentApi) {
		this.tournamentApi = tournamentApi;
	}

	public TournamentStubApi getTournamentStubApi() {
		return tournamentStubApi;
	}

	public void setTournamentStubApi(TournamentStubApi tournamentStubApi) {
		this.tournamentStubApi = tournamentStubApi;
	}
	
	
	
	

}
