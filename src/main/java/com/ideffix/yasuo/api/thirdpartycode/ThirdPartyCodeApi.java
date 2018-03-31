/**
 * 
 */
package com.ideffix.yasuo.api.thirdpartycode;

/**
 * @author ideff
 *
 */
public interface ThirdPartyCodeApi {

	/**
	 * 
	 * @param summonerId SummonerID
	 * @return Get third party code for a given summoner ID
	 */
	String getThirdPartyCode(long summonerId);
}
