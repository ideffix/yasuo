package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.Map;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class RealmDTO {
	
	private String lg;
	private String dd;
	private String l;
	private Map<String, String> n;
	private int profileiconmax;
	private String store;
	private String v;
	private String cdn;
	private String css;
	
	/**
	 * 
	 * @return Legacy script mode for IE6 or older.
	 */
	public String getLg() {
		return lg;
	}

	public void setLg(String lg) {
		this.lg = lg;
	}

	/**
	 * 
	 * @return Latest changed version of Dragon Magic.
	 */
	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	/**
	 * 
	 * @return Default language for this realm.
	 */
	public String getL() {
		return l;
	}

	public void setL(String l) {
		this.l = l;
	}

	/**
	 * 
	 * @return Latest changed version for each data type listed.
	 */
	public Map<String, String> getN() {
		return n;
	}

	public void setN(Map<String, String> n) {
		this.n = n;
	}

	/**
	 * 
	 * @return Special behavior number identifying the largest profile icon ID
	 *         that can be used under 500. Any profile icon that is requested
	 *         between this number and 500 should be mapped to 0.
	 */
	public int getProfileiconmax() {
		return profileiconmax;
	}

	public void setProfileiconmax(int profileiconmax) {
		this.profileiconmax = profileiconmax;
	}

	/**
	 * 
	 * @return Additional API data drawn from other sources that may be related
	 *         to Data Dragon functionality.
	 */
	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	/**
	 * 
	 * @return Current version of this file for this realm.
	 */
	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	/**
	 * 
	 * @return The base CDN URL.
	 */
	public String getCdn() {
		return cdn;
	}

	public void setCdn(String cdn) {
		this.cdn = cdn;
	}

	/**
	 * 
	 * @return Latest changed version of Dragon Magic's CSS file.
	 */
	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

}
