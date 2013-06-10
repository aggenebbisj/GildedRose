package org.joyofcoding.objectcalisthenics;

public class SellIn {

	private int sellIn;

	public SellIn(int sellIn) {
		this.sellIn = sellIn;
	}
	
	public int getSellIn() {
		return sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public void decrease() {
		setSellIn(getSellIn() - 1);
	}
	
}