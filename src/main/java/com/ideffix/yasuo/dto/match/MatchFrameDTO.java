package com.ideffix.yasuo.dto.match;

import java.util.List;
import java.util.Map;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class MatchFrameDTO {
	
	private long timestamp;
	private Map<Integer, MatchParticipantFrameDTO> participantFrames;
	private List<MatchEventDTO> events;

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Map<Integer, MatchParticipantFrameDTO> getParticipantFrames() {
		return participantFrames;
	}

	public void setParticipantFrames(Map<Integer, MatchParticipantFrameDTO> participantFrames) {
		this.participantFrames = participantFrames;
	}

	public List<MatchEventDTO> getEvents() {
		return events;
	}

	public void setEvents(List<MatchEventDTO> events) {
		this.events = events;
	}

}
