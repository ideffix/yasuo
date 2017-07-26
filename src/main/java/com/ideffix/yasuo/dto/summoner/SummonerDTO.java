package com.ideffix.yasuo.dto.summoner;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class SummonerDTO {
	
	private int profileIconId;
	private String name;
	private long summonerLevel;
	private long revisionDate;
	private long id;
	private long accountId;

	/**
	 * 
	 * @return ID of the summoner icon associated with the summoner.
	 */
	public int getProfileIconId() {
		return profileIconId;
	}

	public void setProfileIconId(int profileIconId) {
		this.profileIconId = profileIconId;
	}

	/**
	 * 
	 * @return Summoner name.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return Summoner level associated with the summoner.
	 */
	public long getSummonerLevel() {
		return summonerLevel;
	}

	public void setSummonerLevel(long summonerLevel) {
		this.summonerLevel = summonerLevel;
	}

	/**
	 * 
	 * @return Date summoner was last modified specified as epoch milliseconds. The following events will update this timestamp: profile icon change, playing the tutorial or advanced tutorial, finishing a game, summoner name change
	 */
	public long getRevisionDate() {
		return revisionDate;
	}

	public void setRevisionDate(long revisionDate) {
		this.revisionDate = revisionDate;
	}

	/**
	 * 
	 * @return Summoner ID.
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return Account ID.
	 */
	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

}
