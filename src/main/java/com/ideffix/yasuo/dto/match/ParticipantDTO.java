package com.ideffix.yasuo.dto.match;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 25, 2017
 */
public class ParticipantDTO {
	
	private ParticipantStatsDTO stats;
	private int participantId;
	private List<RuneDTO> runes;
	private ParticipantTimelineDTO timeline;
	private int teamId;
	private int spell2Id;
	private List<MasteryDTO> masteries;
	private String highestAchievedSeasonTier;
	private int spell1Id;
	private int championId;

	public ParticipantStatsDTO getStats() {
		return stats;
	}

	public void setStats(ParticipantStatsDTO stats) {
		this.stats = stats;
	}

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public List<RuneDTO> getRunes() {
		return runes;
	}

	public void setRunes(List<RuneDTO> runes) {
		this.runes = runes;
	}

	public ParticipantTimelineDTO getTimeline() {
		return timeline;
	}

	public void setTimeline(ParticipantTimelineDTO timeline) {
		this.timeline = timeline;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getSpell2Id() {
		return spell2Id;
	}

	public void setSpell2Id(int spell2Id) {
		this.spell2Id = spell2Id;
	}

	public List<MasteryDTO> getMasteries() {
		return masteries;
	}

	public void setMasteries(List<MasteryDTO> masteries) {
		this.masteries = masteries;
	}

	public String getHighestAchievedSeasonTier() {
		return highestAchievedSeasonTier;
	}

	public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
		this.highestAchievedSeasonTier = highestAchievedSeasonTier;
	}

	public int getSpell1Id() {
		return spell1Id;
	}

	public void setSpell1Id(int spell1Id) {
		this.spell1Id = spell1Id;
	}

	public int getChampionId() {
		return championId;
	}

	public void setChampionId(int championId) {
		this.championId = championId;
	}

}
