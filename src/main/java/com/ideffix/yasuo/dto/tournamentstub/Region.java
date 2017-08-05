package com.ideffix.yasuo.dto.tournamentstub;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public enum Region {
	
	BR("BR1"), 
	EUNE("EUN1"), 
	EUW("EUW1"), 
	JP("JP1"), 
	KR("KR"),
	LAN("LA1"), 
	LAS("LA2"), 
	NA("NA1"), 
	OCE("OC1"), 
	PBE("PBE1"), 
	RU("RU"), 
	TR("TR1");
	
	private String httpPath;
	
	private Region(String httpPath) {
		this.httpPath = httpPath;
	}

	public String getHttpPath() {
		return httpPath;
	}

}
