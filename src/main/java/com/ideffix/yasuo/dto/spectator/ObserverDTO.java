package com.ideffix.yasuo.dto.spectator;

/**
 * @author IdeFFiX
 *
 *         Jul 19, 2017
 */
public class ObserverDTO {

	private String encryptionKey;

	/**
	 * 
	 * @return Key used to decrypt the spectator grid game data for playback
	 */
	public String getEncryptionKey() {
		return encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

}
