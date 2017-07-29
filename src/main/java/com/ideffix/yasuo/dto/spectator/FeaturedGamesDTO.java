package com.ideffix.yasuo.dto.spectator;

import java.util.List;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public class FeaturedGamesDTO {
	
	private long clientRefreshInterval;
	private List<FeaturedGameInfoDTO> gameList;

	/**
	 * 
	 * @return The suggested interval to wait before requesting FeaturedGames again
	 */
	public long getClientRefreshInterval() {
		return clientRefreshInterval;
	}

	public void setClientRefreshInterval(long clientRefreshInterval) {
		this.clientRefreshInterval = clientRefreshInterval;
	}

	/**
	 * 
	 * @return The list of featured games
	 */
	public List<FeaturedGameInfoDTO> getGameList() {
		return gameList;
	}

	public void setGameList(List<FeaturedGameInfoDTO> gameList) {
		this.gameList = gameList;
	}

}
