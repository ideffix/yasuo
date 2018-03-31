/**
 * 
 */
package com.ideffix.yasuo.dto.league;

/**
 * @author ideff
 *
 */
public class MmrAfDTO {

	private String tier;
	private String summonerName;
	private String analysis;
	private int mmr;

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	public String getAnalysis() {
		return analysis;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	public int getMmr() {
		return mmr;
	}

	public void setMmr(int mmr) {
		this.mmr = mmr;
	}

}
