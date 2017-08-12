package com.ideffix.yasuo.dto.lolstatus;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class TranslationDTO {
	
	private String locale;
	private String content;
	private String updated_at;
	private String heading;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

}
