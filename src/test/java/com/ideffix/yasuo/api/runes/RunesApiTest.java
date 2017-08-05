package com.ideffix.yasuo.api.runes;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.runes.impl.RunesApiImpl;
import com.ideffix.yasuo.dto.runes.RunePagesDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Aug 1, 2017 
 *
 * @author IdeFFiX
 */

public class RunesApiTest extends BaseApiTest {
	
	private RunesApi runesApi;
	
	@Before
	public void setUp() {
		runesApi = new RunesApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getRunePageTest() {
		RunePagesDTO runePages = runesApi.getRunePages(IDEFFIX_SUMMONER_ID);
		
		assertNotNull("Error getting rune pages", runePages);
	}

}
