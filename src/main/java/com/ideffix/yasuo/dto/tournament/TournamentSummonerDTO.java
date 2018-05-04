package com.ideffix.yasuo.dto.tournament;

/**
 * <p>
 * Created on May 3, 2018
 *
 * @author IdeFFiX
 */

public class TournamentSummonerDTO {

	private long summonerId;
	private String summonerName;

	/**
	 * @return the summonerId
	 */
	public long getSummonerId() {
		return summonerId;
	}

	/**
	 * @param summonerId
	 *            the summonerId to set
	 */
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}

	/**
	 * @return the summonerName
	 */
	public String getSummonerName() {
		return summonerName;
	}

	/**
	 * @param summonerName
	 *            the summonerName to set
	 */
	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	@Override
	public String toString() {
		return "TournamentSummonerDTO [summonerId=" + summonerId + ", summonerName=" + summonerName + "]";
	}

}
