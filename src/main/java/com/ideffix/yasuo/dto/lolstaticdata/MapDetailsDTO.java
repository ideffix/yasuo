package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class MapDetailsDTO {
	
	private String mapName;
	private ImageDTO image;
	private long mapId;
	private List<Long> unpurchasableItemList;

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}

	public long getMapId() {
		return mapId;
	}

	public void setMapId(long mapId) {
		this.mapId = mapId;
	}

	public List<Long> getUnpurchasableItemList() {
		return unpurchasableItemList;
	}

	public void setUnpurchasableItemList(List<Long> unpurchasableItemList) {
		this.unpurchasableItemList = unpurchasableItemList;
	}

}
