package com.ideffix.yasuo.api.lolstatus;

import com.ideffix.yasuo.dto.lolstatus.ShardStatusDTO;

/**
 * <p>
 * Created on Jul 29, 2017 
 *
 * @author IdeFFiX
 */

public interface LolStatusApi {
	
	/**
	 * 
	 * @return Get League of Legends status for the given shard
	 */
	ShardStatusDTO getLolStatus();

}
