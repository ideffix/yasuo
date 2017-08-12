package com.ideffix.yasuo.helper;

import java.util.Map;

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
	
	public static String buildSinglePathParam(String param, long value) {
		return param + "/" + value;
	}
	
	public static String buildMultiplyPathParam(Map<String, String> params) {
		StringBuilder sb = new StringBuilder();
		params.forEach((k, v) -> sb.append(buildSinglePathParam(k, v) + "/"));
		return sb.substring(0, sb.length() - 1);
	}

}
