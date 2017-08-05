package com.ideffix.yasuo.api.masteries;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.masteries.impl.MasteriesApiImpl;
import com.ideffix.yasuo.dto.masteries.MasteryPagesDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Aug 1, 2017 
 *
 * @author IdeFFiX
 */

public class MasteriesApiTest extends BaseApiTest {

	private MasteriesApi masteriesApi;
	
	@Before
	public void setUp() {
		masteriesApi = new MasteriesApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getMasteryPagesTest() {
		MasteryPagesDTO masteryPages = masteriesApi.getMasteryPages(IDEFFIX_SUMMONER_ID);
		
		assertNotNull("Error getting mastery pages", masteryPages);
	}
	
}
