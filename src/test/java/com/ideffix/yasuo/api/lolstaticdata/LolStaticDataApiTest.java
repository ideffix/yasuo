package com.ideffix.yasuo.api.lolstaticdata;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.lolstaticdata.impl.LolStaticDataApiImpl;
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

/**
 * <p>
 * Created on Jul 30, 2017 
 *
 * @author IdeFFiX
 */

public class LolStaticDataApiTest extends BaseApiTest {

	private LolStaticDataApi lolStaticDataApi;
	
	@Before
	public void setUp() {
		lolStaticDataApi = new LolStaticDataApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getChampionsTest() {
		ChampionListDTO champions = lolStaticDataApi.getChampions();
		
		assertNotNull("Error getting champions", champions);
	}
	
	@Test
	public void getChampionTest() {
		ChampionDTO champion = lolStaticDataApi.getChampion(YASUO_ID);
		
		assertNotNull("Error getting champion", champion);
	}
	
	@Test
	public void getItemsTest() {
		ItemListDTO items = lolStaticDataApi.getItems();
		
		assertNotNull("Error getting items", items);
	}
	
	@Test
	public void getItemTest() {
		ItemDTO item = lolStaticDataApi.getItem(DUSKBLADE_ID);
		
		assertNotNull("Error getting items", item);
	}
	
	@Test
	public void getLanguageDataTest() {
		LanguageStringsDTO languageStringsData = lolStaticDataApi.getLanguageStringsData();
		
		assertNotNull("Error getting language strings data", languageStringsData);
	}
	
	@Test
	public void getLanguagesTest() {
		List<String> languages = lolStaticDataApi.getLanguages();
		
		assertNotNull("Error getting languages", languages);
	}
	
	@Test
	public void getMapsTest() {
		MapDataDTO mapData = lolStaticDataApi.getMapData();
		
		assertNotNull("Error getting map data", mapData);
	}
	
	@Test
	public void getMasteryListTest() {
		MasteryListDTO mastaryList = lolStaticDataApi.getMasteryList();
		
		assertNotNull("Error getting mastery list", mastaryList);		
	}
	
	@Test
	public void getMasteryTest() {
		MasteryDTO mastery = lolStaticDataApi.getMastery(THUNDERLORD_ID);
		
		assertNotNull("Error getting mastery", mastery);
	}
	
	@Test
	public void getProfileIconsTest() {
		ProfileIconDataDTO profileIcons = lolStaticDataApi.getProfileIcons();
		
		assertNotNull("Error getting profile icons", profileIcons);
	}
	
	@Test
	public void getRealmsTest() {
		RealmDTO realmData = lolStaticDataApi.getRealmData();
		
		assertNotNull("Error getting realmData", realmData);
	}
	
	@Test
	public void getRuneListTest() {
		RuneListDTO runeList = lolStaticDataApi.getRuneList();
		
		assertNotNull("Error getting rune list", runeList);
	}
	
	@Test
	public void getRuneTest() {
		RuneDTO rune = lolStaticDataApi.getRune(AD_MARK_RUNE_ID);
		
		assertNotNull("Error getting rune", rune);
	}
	
	@Test
	public void getSummonerSpellsTest() {
		SummonerSpellListDTO summonerSpellList = lolStaticDataApi.getSummonerSpellList();
		
		assertNotNull("Error getting summoner spells", summonerSpellList);
	}
	
	@Test
	public void getSummonerSpellTest() {
		SummonerSpellDTO summonerSpell = lolStaticDataApi.getSummonerSpell(FLASH_ID);
		
		assertNotNull("Error getting summoner spell", summonerSpell);
	}
	
	@Test
	public void getVersionsTest() {
		List<String> versions = lolStaticDataApi.getVersions();
		
		assertNotNull("Error getting versions", versions);
	}
	
	@Test
	public void getReforgedRunePathListTest() {
		List<ReforgedRunePathDTO> reforgedRunePathList = lolStaticDataApi.getReforgedRunePathList();
		
		assertNotNull("Error getting reforgedRunePath list", reforgedRunePathList);
	}
	
	@Test
	public void getReforgedRunePathByIdTest() {
		ReforgedRunePathDTO reforgedRunePath = lolStaticDataApi.getReforgedRunePath(DOMINATION_PATH_ID);
		
		assertNotNull("Error getting reforgdRunePath", reforgedRunePath);
	}
	
	@Test
	public void getReforgedRunesListTest() {
		List<ReforgedRuneDTO> reforgedRuneList = lolStaticDataApi.getReforgedRuneList();
		
		assertNotNull("Error getting reforgedRune list", reforgedRuneList);
	}
	
	@Test
	public void getReforgedRunesByIdTest() {
		ReforgedRuneDTO reforgedRune = lolStaticDataApi.getReforgedRune(SUMMON_AERY_ID);
		
		assertNotNull("Error getting reforgedRune", reforgedRune);
	}
	
}
