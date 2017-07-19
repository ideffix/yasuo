package com.ideffix.yasuo.dto.champion;

/**
 * @author IdeFFiX
 *
 *         Jul 19, 2017
 */
public class ChampionDTO {

	private boolean rankedPlayEnabled;
	private boolean botEnabled;
	private boolean botMmEnabled;
	private boolean active;
	private boolean freeToPlay;
	private long id;

	/**
	 * 
	 * @return Ranked play enabled flag.
	 */
	public boolean isRankedPlayEnabled() {
		return rankedPlayEnabled;
	}

	public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
		this.rankedPlayEnabled = rankedPlayEnabled;
	}

	/**
	 * 
	 * @return Bot enabled flag (for custom games).
	 */
	public boolean isBotEnabled() {
		return botEnabled;
	}

	public void setBotEnabled(boolean botEnabled) {
		this.botEnabled = botEnabled;
	}

	/**
	 * 
	 * @return 	Bot Match Made enabled flag (for Co-op vs. AI games).
	 */
	public boolean isBotMmEnabled() {
		return botMmEnabled;
	}

	public void setBotMmEnabled(boolean botMmEnabled) {
		this.botMmEnabled = botMmEnabled;
	}

	/**
	 * 
	 * @return Indicates if the champion is active.
	 */
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * 
	 * @return Indicates if the champion is free to play. Free to play champions are rotated periodically.
	 */
	public boolean isFreeToPlay() {
		return freeToPlay;
	}

	public void setFreeToPlay(boolean freeToPlay) {
		this.freeToPlay = freeToPlay;
	}

	/**
	 * 
	 * @return Champion ID. For static information correlating to champion IDs, please refer to the LoL Static Data API.
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
