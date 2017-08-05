package com.ideffix.yasuo.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>
 * Created on Jul 30, 2017
 *
 * @author IdeFFiX
 */

public class LolProperties {
	
	private static LolProperties lolProperties = null;

	private String apiKey;

	private LolProperties() {
		init();
	}

	private void init() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("src/main/resources/lol.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			apiKey = prop.getProperty("apiKey");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static LolProperties getInstance() {
		if (lolProperties == null) {
			lolProperties = new LolProperties();
		}
		return lolProperties;
	}

	public String getApiKey() {
		return apiKey;
	}

}
