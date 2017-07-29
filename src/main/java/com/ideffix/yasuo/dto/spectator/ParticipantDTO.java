package com.ideffix.yasuo.dto.spectator;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class ParticipantDTO {
	
	private long profileIconId;
	private long championId;
	private String summonerName;
	private boolean bot;
	private long spell2Id;
	private long teamId;
	private long spell1Id;

	/**
	 * 
	 * @return The ID of the profile icon used by this participant
	 */
	public long getProfileIconId() {
		return profileIconId;
	}

	public void setProfileIconId(long profileIconId) {
		this.profileIconId = profileIconId;
	}

	/**
	 * 
	 * @return The ID of the champion played by this participant
	 */
	public long getChampionId() {
		return championId;
	}

	public void setChampionId(long championId) {
		this.championId = championId;
	}

	/**
	 * 
	 * @return The summoner name of this participant
	 */
	public String getSummonerName() {
		return summonerName;
	}

	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	/**
	 * 
	 * @return 	Flag indicating whether or not this participant is a bot
	 */
	public boolean isBot() {
		return bot;
	}

	public void setBot(boolean bot) {
		this.bot = bot;
	}

	/**
	 * 
	 * @return The ID of the second summoner spell used by this participant
	 */
	public long getSpell2Id() {
		return spell2Id;
	}

	public void setSpell2Id(long spell2Id) {
		this.spell2Id = spell2Id;
	}

	/**
	 * 
	 * @return The team ID of this participant, indicating the participant's team
	 */
	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	/**
	 * 
	 * @return The ID of the first summoner spell used by this participant
	 */
	public long getSpell1Id() {
		return spell1Id;
	}

	public void setSpell1Id(long spell1Id) {
		this.spell1Id = spell1Id;
	}

}
