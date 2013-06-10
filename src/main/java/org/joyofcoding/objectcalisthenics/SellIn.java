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

	public boolean sellWithin(int days) {
		return sellIn < days;
	}

	public int daysLeft() {
		return sellIn;
	}
	
}