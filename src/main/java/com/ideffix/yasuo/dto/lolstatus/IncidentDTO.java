package com.ideffix.yasuo.dto.lolstatus;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class IncidentDTO {
	
	private boolean active;
	private String created_at;
	private long id;
	private List<MessageDTO> updates;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<MessageDTO> getUpdates() {
		return updates;
	}

	public void setUpdates(List<MessageDTO> updates) {
		this.updates = updates;
	}

}
