package com.ideffix.yasuo.dto.match;

/**
 * @author IdeFFiX
 *
 * Jul 25, 2017
 */
public class ParticipantIdentityDTO {
	
	private PlayerDTO player;
	private int participantId;

	public PlayerDTO getPlayer() {
		return player;
	}

	public void setPlayer(PlayerDTO player) {
		this.player = player;
	}

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

}
