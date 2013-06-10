package org.joyofcoding.objectcalisthenics;

public class Item {
	private String name;
	private int sellIn;
	private Quality quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.quality = new Quality(quality);
		this.sellIn = sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public void setQuality(int quality) {
		this.quality.setQuality(quality);
	}

	public String getName() {
		return name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public Quality getQuality() {
		return this.quality;
	}

	void updateQuality() {
		quality.decrease();

		decreaseSellIn();

		if (getSellIn() < 0) {
			quality.decrease();
		}
	}

	protected void decreaseSellIn() {
		setSellIn(getSellIn() - 1);
	}

	protected boolean sellWithin(int days) {
		return getSellIn() < days;
	}
}
