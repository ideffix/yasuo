package com.ideffix.yasuo.dto.runes;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class RuneSlotDTO {
	
	private int runeSlotId;
	private int runeId;

	/**
	 * 
	 * @return Rune slot ID.

	 */
	public int getRuneSlotId() {
		return runeSlotId;
	}

	public void setRuneSlotId(int runeSlotId) {
		this.runeSlotId = runeSlotId;
	}

	/**
	 * 
	 * @return 	Rune ID associated with the rune slot. For static information correlating to rune IDs, please refer to the LoL Static Data API.
	 */
	public int getRuneId() {
		return runeId;
	}

	public void setRuneId(int runeId) {
		this.runeId = runeId;
	}

}
