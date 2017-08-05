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
import com.ideffix.yasuo.dto.lolstaticdata.RuneDTO;
import com.ideffix.yasuo.dto.lolstaticdata.RuneListDTO;
import com.ideffix.yasuo.dto.lolstaticdata.SummonerSpellDTO;
import com.ideffix.yasuo.dto.lolstaticdata.SummonerSpellListDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

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
		LOG.info("Calling getChampion service");
		return callGetRequest("champions", null, ChampionListDTO.class);
	}

	@Override
	public ChampionDTO getChampion(int championId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemListDTO getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemDTO getItem(int itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LanguageStringsDTO getLanguageStringsData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getLanguages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MapDataDTO getMapData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MasteryListDTO getMastaryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MasteryDTO getMastery(int masteryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProfileIconDataDTO getProfileIcons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RealmDTO getRealmData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RuneListDTO getRuneList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RuneDTO getRune(int runeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SummonerSpellListDTO getSummonerSpellList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SummonerSpellDTO getSummonerSpell(int summonerSpellId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getVersions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String specificApiPath() {
		return RiotApiConstans.LOL_STATIC_DATA_PATH;
	}

}
