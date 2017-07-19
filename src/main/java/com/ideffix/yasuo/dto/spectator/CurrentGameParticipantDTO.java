package com.ideffix.yasuo.dto.spectator;

import java.util.List;

/**
 * @author IdeFFiX
 *
 *         Jul 19, 2017
 */
public class CurrentGameParticipantDTO {

	private long profileIconId;
	private long championId;
	private String summonerName;
	private List<RuneDTO> runes;
	private boolean bot;
	private long teamId;
	private long spell2Id;
	private List<MasteryDTO> masteries;
	private long spell1Id;
	private long summonerId;

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
	 * @return The runes used by this participant
	 */
	public List<RuneDTO> getRunes() {
		return runes;
	}

	public void setRunes(List<RuneDTO> runes) {
		this.runes = runes;
	}

	/**
	 * 
	 * @return Flag indicating whether or not this participant is a bot
	 */
	public boolean isBot() {
		return bot;
	}

	public void setBot(boolean bot) {
		this.bot = bot;
	}

	/**
	 * 
	 * @return The team ID of this participant, indicating the participant's
	 *         team
	 */
	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
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
	 * @return The masteries used by this participant
	 */
	public List<MasteryDTO> getMasteries() {
		return masteries;
	}

	public void setMasteries(List<MasteryDTO> masteries) {
		this.masteries = masteries;
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

	/**
	 * 
	 * @return
	 */
	public long getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}

}
