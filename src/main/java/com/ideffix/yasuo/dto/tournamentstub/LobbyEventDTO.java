package com.ideffix.yasuo.dto.tournamentstub;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class LobbyEventDTO {

	private String eventType;
	private String summonerId;
	private String timestamp;

	/**
	 * 
	 * @return The type of event that was triggered
	 */
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * 
	 * @return The summoner that triggered the event
	 */
	public String getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

	/**
	 * 
	 * @return Timestamp from the event
	 */
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
