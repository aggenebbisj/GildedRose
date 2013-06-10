package org.joyofcoding.objectcalisthenics;

public class SellIn {

	private int sellIn;

	public SellIn(int sellIn) {
		this.sellIn = sellIn;
	}
	
	public int getSellIn() {
		return sellIn;
	}

	public void decrease() {
		sellIn--;
	}

	public int daysLeft() {
		return sellIn;
	}
	
}