package com.ideffix.yasuo.api.lolstaticdata;

import java.util.List;

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

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public interface LolStaticDataApi {
	
	/**
	 * 
	 * @return Retrieves champion list
	 */
	ChampionListDTO getChampions();
	
	/**
	 * 
	 * @param championId Champion ID
	 * @return Retrieves champion by ID
	 */
	ChampionDTO getChampion(int championId);

	/**
	 * 
	 * @return Retrieves item list
	 */
	ItemListDTO getItems();
	
	/**
	 * 
	 * @param itemId Item ID
	 * @return Retrieves item by ID
	 */
	ItemDTO getItem(int itemId);
	
	/**
	 * 
	 * @return Retrieve language strings data
	 */
	LanguageStringsDTO getLanguageStringsData();
	
	/**
	 * 
	 * @return Retrieve supported languages data
	 */
	List<String> getLanguages();
	
	/**
	 * 
	 * @return Retrieve map data
	 */
	MapDataDTO getMapData();
	
	/**
	 * 
	 * @return Retrieves mastery list
	 */
	MasteryListDTO getMasteryList();
	
	/**
	 * 
	 * @param masteryId Mastery ID
	 * @return Retrieves mastery item by ID
	 */
	MasteryDTO getMastery(int masteryId);
	
	/**
	 * 
	 * @return Retrieve profile icons
	 */
	ProfileIconDataDTO getProfileIcons();
	
	/**
	 * 
	 * @return Retrieve realm data
	 */
	RealmDTO getRealmData();
	
	/**
	 * 
	 * @return Retrieves reforged rune path list
	 */
	List<ReforgedRunePathDTO> getReforgedRunePathList();
	
	/**
	 * 
	 * @param id Reforged rune path ID
	 * @return Retrieves reforged rune path by ID
	 */
	ReforgedRunePathDTO getReforgedRunePath(int id);
	
	/**
	 * 
	 * @return Retrieves reforged rune list
	 */
	List<ReforgedRuneDTO> getReforgedRuneList();
	
	/**
	 * 
	 * @param id Reforged rune ID
	 * @return Retrieves reforged rune by ID
	 */
	ReforgedRuneDTO getReforgedRune(int id);
	
	/**
	 * 
	 * @return Retrieves rune list
	 */
	RuneListDTO getRuneList();
	
	/**
	 * 
	 * @param runeId Rune ID
	 * @return Retrieves rune by ID
	 */
	RuneDTO getRune(int runeId);
	
	/**
	 * 
	 * @return Retrieves summoner spell list
	 */
	SummonerSpellListDTO getSummonerSpellList();
	
	/**
	 * 
	 * @param summonerSpellId Summoner spell ID
	 * @return Retrieves summoner spell by ID
	 */
	SummonerSpellDTO getSummonerSpell(int summonerSpellId);
	
	/**
	 * 
	 * @return Retrieve version data
	 */
	List<String> getVersions();
}
