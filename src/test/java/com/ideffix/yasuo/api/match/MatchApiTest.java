package com.ideffix.yasuo.api.match;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.match.impl.MatchApiApiImpl;
import com.ideffix.yasuo.dto.match.MatchListDTO;
import com.ideffix.yasuo.dto.matcha.MatchFilters;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Aug 1, 2017 
 *
 * @author IdeFFiX
 */

public class MatchApiTest extends BaseApiTest {
	
	private MatchApi matchApi;
	
	@Before
	public void setUp() {
		matchApi = new MatchApiApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getMatchListTest() {
		MatchListDTO matchList = matchApi.getMatchList(IDEFFIX_ACCOUNT_ID);
		
		assertNotNull("Error getting match list", matchList);
	}
	
	@Test
	public void getLast20MatchesTest() {
		MatchListDTO match20List = matchApi.getLast20Matches(IDEFFIX_ACCOUNT_ID);
		
		assertNotNull("Error getting match list", match20List);
	}

}
