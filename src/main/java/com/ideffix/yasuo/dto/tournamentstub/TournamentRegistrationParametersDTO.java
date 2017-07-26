package com.ideffix.yasuo.dto.tournamentstub;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class TournamentRegistrationParametersDTO {
	
	private int providerId;
	private String name;

	/**
	 * 
	 * @return The provider ID to specify the regional registered provider data to associate this tournament.
	 */
	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	/**
	 * 
	 * @return 	The optional name of the tournament.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
