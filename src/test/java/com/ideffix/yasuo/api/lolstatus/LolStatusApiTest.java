package com.ideffix.yasuo.api.lolstatus;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.lolstatus.impl.LolStatusApiImpl;
import com.ideffix.yasuo.dto.lolstatus.ShardStatusDTO;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * <p>
 * Created on Aug 1, 2017 
 *
 * @author IdeFFiX
 */

public class LolStatusApiTest extends BaseApiTest {

	private LolStatusApi lolStatusApi;
	
	@Before
	public void setUp() {
		lolStatusApi = new LolStatusApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}
	
	@Test
	public void getLolStatusTest() {
		ShardStatusDTO lolStatus = lolStatusApi.getLolStatus();
		
		assertNotNull("Error getting lol status", lolStatus);
	}
	
}
