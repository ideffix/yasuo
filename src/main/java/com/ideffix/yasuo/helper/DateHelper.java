package com.ideffix.yasuo.helper;

/**
 * <p>
 * Created on Aug 6, 2017 
 *
 * @author IdeFFiX
 */

public class DateHelper {

	public static String formatTimeBetween(long requestStartTime, long requestStopTime) {
		long timeBetween = requestStopTime - requestStartTime;
		return timeBetween / 1000 + "." + timeBetween % 1000 + "s";
	}

}
