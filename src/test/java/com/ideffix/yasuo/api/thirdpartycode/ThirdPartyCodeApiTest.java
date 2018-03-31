/**
 * 
 */
package com.ideffix.yasuo.api.thirdpartycode;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ideffix.yasuo.api.BaseApiTest;
import com.ideffix.yasuo.api.thirdpartycode.impl.ThirdPartyCodeApiImpl;
import com.ideffix.yasuo.dto.tournamentstub.Region;

/**
 * @author ideff
 *
 */
public class ThirdPartyCodeApiTest extends BaseApiTest {

	private ThirdPartyCodeApi thirdPartyCodeApi;

	@Before
	public void setUp() {
		thirdPartyCodeApi = new ThirdPartyCodeApiImpl(lolProperties.getApiKey(), Region.EUNE);
	}

	@Test
	public void getThirdPartyCodeTest() {
		String thirdPartyCode = thirdPartyCodeApi.getThirdPartyCode(IDEFFIX_SUMMONER_ID);

		assertNotNull("Error getting third party code", thirdPartyCode);
	}

}
