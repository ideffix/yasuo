package com.ideffix.yasuo.api.lolstaticdata.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.ideffix.yasuo.api.BaseRiotApi;
import com.ideffix.yasuo.api.constans.RiotApiConstans;
import com.ideffix.yasuo.api.lolstaticdata.LolStaticDataApi;
import com.ideffix.yasuo.dto.lolstaticdata.ChampionDTO;
import com.ideffix.yasuo.dto.lolstaticdata.ChampionListDTO;
import com.ideffix.yasuo.dto.lolstaticdata.ItemDTO;
import com.ideffix.yasuo.dto.lolstaticdata.ItemListDTO;
import com.ideffix.yasuo.dto.lolstaticdata.LanguageStringsDTO;
import com.ideffix.yasuo.dto.lolstaticdata.MapDataDTO;
import com.ideffix.yasuo.dto.lolstaticdata.MasteryDTO;
import com.ideffix.yasuo.dto.lolstaticdata.MasteryListDTO;
import com.ideffix.yasuo.dto.lolstaticdata.ProfileIconDataDTO;
import com.ideffix.yasuo.dto.lolstaticdata.RealmDTO;
import com.ideffix.yasuo.dto.lolstaticdata.ReforgedRuneDTO;
import com.ideffix.yasuo.dto.lolstaticdata.ReforgedRunePathDTO;
import com.ideffix.yasuo.dto.lolstaticdata.RuneDTO;
import com.ideffix.yasuo.dto.lolstaticdata.RuneListDTO;
import com.ideffix.yasuo.dto.lolstaticdata.SummonerSpellDTO;
import com.ideffix.yasuo.dto.lolstaticdata.SummonerSpellListDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;
import com.ideffix.yasuo.helper.PathParamHelper;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class LolStaticDataApiImpl extends BaseRiotApi implements LolStaticDataApi {
	
	private static final Logger LOG = Logger.getLogger(LolStaticDataApiImpl.class);

	public LolStaticDataApiImpl(String apiKey, Region region) {
		super(apiKey, region);
	}

	@Override
	public ChampionListDTO getChampions() {
		LOG.info("Calling getChampions service");
		return callGetRequest("champions", ChampionListDTO.class);
	}

	@Override
	public ChampionDTO getChampion(int championId) {
		LOG.info("Calling getChampion service, champion id: " + championId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("champions", championId), ChampionDTO.class);
	}

	@Override
	public ItemListDTO getItems() {
		LOG.info("Calling getItems service");
		return callGetRequest("items", ItemListDTO.class);
	}

	@Override
	public ItemDTO getItem(int itemId) {
		LOG.info("Calling getItem service, itemId: " + itemId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("items", itemId), ItemDTO.class);
	}

	@Override
	public LanguageStringsDTO getLanguageStringsData() {
		LOG.info("Calling getLanguageStringsData service");
		return callGetRequest("language-strings", LanguageStringsDTO.class);
	}

	@Override
	public List<String> getLanguages() {
		LOG.info("Calling getLanguages service");
		return callGetRequest("languages", List.class);
	}

	@Override
	public MapDataDTO getMapData() {
		LOG.info("Calling getMapData service");
		return callGetRequest("maps", MapDataDTO.class);
	}

	@Override
	public MasteryListDTO getMasteryList() {
		LOG.info("Calling getMasteryList service");
		return callGetRequest("masteries", MasteryListDTO.class);
	}

	@Override
	public MasteryDTO getMastery(int masteryId) {
		LOG.info("Calling getMastery service, masteryId: " + masteryId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("masteries", masteryId), MasteryDTO.class);
	}

	@Override
	public ProfileIconDataDTO getProfileIcons() {
		LOG.info("Calling getProfileIcons service");
		return callGetRequest("profile-icons", ProfileIconDataDTO.class);
	}

	@Override
	public RealmDTO getRealmData() {
		LOG.info("Calling getRealmData service");
		return callGetRequest("realms", RealmDTO.class);
	}

	@Override
	public RuneListDTO getRuneList() {
		LOG.info("Calling getRuneList service");
		return callGetRequest("runes", RuneListDTO.class);
	}

	@Override
	public RuneDTO getRune(int runeId) {
		LOG.info("Calling getRune service, runeId: " + runeId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("runes", runeId), RuneDTO.class);
	}

	@Override
	public SummonerSpellListDTO getSummonerSpellList() {
		LOG.info("Calling getSummonerSpellList service");
		return callGetRequest("summoner-spells", SummonerSpellListDTO.class);
	}

	@Override
	public SummonerSpellDTO getSummonerSpell(int summonerSpellId) {
		LOG.info("Calling getSummonerSpell service, summonerSpellId: " + summonerSpellId);
		return callGetRequest(PathParamHelper.buildSinglePathParam("summoner-spells", summonerSpellId), SummonerSpellDTO.class);
	}

	@Override
	public List<String> getVersions() {
		LOG.info("Calling getVersions service");
		return callGetRequest("versions", List.class);
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.LOL_STATIC_DATA_PATH;
	}

	@Override
	public List<ReforgedRunePathDTO> getReforgedRunePathList() {
		LOG.info("Calling getReforgedRunePathList service");
		return callGetRequest("reforged-rune-paths", List.class);
	}

	@Override
	public ReforgedRunePathDTO getReforgedRunePath(int id) {
		LOG.info("Calling getReforgedRunePath service, id: " + id);
		return callGetRequest(PathParamHelper.buildSinglePathParam("reforged-rune-paths", id), ReforgedRunePathDTO.class);
	}

	@Override
	public List<ReforgedRuneDTO> getReforgedRuneList() {
		LOG.info("Calling getReforgedRuneList service");
		return callGetRequest("reforged-runes", List.class);
	}

	@Override
	public ReforgedRuneDTO getReforgedRune(int id) {
		LOG.info("Calling getReforgedRune service, id: " + id);
		return callGetRequest(PathParamHelper.buildSinglePathParam("reforged-runes", id), ReforgedRuneDTO.class);
	}

}
