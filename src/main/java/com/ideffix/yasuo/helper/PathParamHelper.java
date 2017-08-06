package com.ideffix.yasuo.helper;

/**
 * <p>
 * Created on Aug 6, 2017 
 *
 * @author IdeFFiX
 */

public class PathParamHelper {
	
	public static String buildSinglePathParam(String param, String value) {
		return param + "/" + value;
	}

	public static String buildSinglePathParam(String param, int value) {
		return param + "/" + value;
	}

}
