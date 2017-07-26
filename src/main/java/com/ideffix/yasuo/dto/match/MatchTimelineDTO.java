package com.ideffix.yasuo.dto.match;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 26, 2017
 */
public class MatchTimelineDTO {
	
	private List<MatchFrameDTO> frames;
	private long frameInterval;

	public List<MatchFrameDTO> getFrames() {
		return frames;
	}

	public void setFrames(List<MatchFrameDTO> frames) {
		this.frames = frames;
	}

	public long getFrameInterval() {
		return frameInterval;
	}

	public void setFrameInterval(long frameInterval) {
		this.frameInterval = frameInterval;
	}

}
