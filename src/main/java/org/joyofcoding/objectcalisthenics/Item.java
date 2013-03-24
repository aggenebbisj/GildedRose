package org.joyofcoding.objectcalisthenics;

public class Item {
	private String name;
	private int sellIn;
	private int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.quality = quality;
		this.sellIn = sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public int getQuality() {
		return quality;
	}

	void updateQuality() {
		decreaseQuality();

		decreaseSellIn();

		if (getSellIn() < 0) {
			decreaseQuality();
		}
	}

	protected void decreaseSellIn() {
		setSellIn(getSellIn() - 1);
	}

	private void decreaseQuality() {
		if (getQuality() > 0) {
			setQuality(getQuality() - 1);
		}
	}

	protected void increaseQuality() {
		if (getQuality() < 50) {
			setQuality(getQuality() + 1);
		}
	}

	protected boolean sellWithin(int days) {
		return getSellIn() < days;
	}
}
