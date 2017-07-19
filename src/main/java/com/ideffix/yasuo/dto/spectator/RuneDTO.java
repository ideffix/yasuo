package com.ideffix.yasuo.dto.spectator;

/**
 * @author IdeFFiX
 *
 *         Jul 19, 2017
 */
public class RuneDTO {

	private int count;
	private long runeId;

	/**
	 * 
	 * @return The count of this rune used by the participant
	 */
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * 
	 * @return The ID of the rune
	 */
	public long getRuneId() {
		return runeId;
	}

	public void setRuneId(long runeId) {
		this.runeId = runeId;
	}

}
