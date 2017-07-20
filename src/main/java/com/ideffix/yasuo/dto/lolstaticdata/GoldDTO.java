package com.ideffix.yasuo.dto.lolstaticdata;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class GoldDTO {
	
	private int sell;
	private int total;
	private int base;
	private boolean purchasable;

	public int getSell() {
		return sell;
	}

	public void setSell(int sell) {
		this.sell = sell;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public boolean isPurchasable() {
		return purchasable;
	}

	public void setPurchasable(boolean purchasable) {
		this.purchasable = purchasable;
	}

}
