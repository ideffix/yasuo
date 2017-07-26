package com.ideffix.yasuo.dto.tournamentstub;

import java.util.Set;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class SummonerIdParamsDTO {
	
	private Set<Long> participants;

	/**
	 * 
	 * @return The tournament participants
	 */
	public Set<Long> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<Long> participants) {
		this.participants = participants;
	}

}
