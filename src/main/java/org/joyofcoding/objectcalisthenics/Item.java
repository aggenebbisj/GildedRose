package org.joyofcoding.objectcalisthenics;

public class Item {
	private String name;
	private SellIn sellIn;
	private Quality quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.quality = new Quality(quality);
		this.sellIn = new SellIn(sellIn);
	}

	public void setSellIn(int sellIn) {
		this.sellIn.setSellIn(sellIn);
	}

	public void setQuality(int quality) {
		this.quality.setQuality(quality);
	}

	public String getName() {
		return name;
	}

	public SellIn getSellIn() {
		return sellIn;
	}

	public Quality getQuality() {
		return quality;
	}

	void updateQuality() {
		quality.decrease();

		sellIn.decrease();

		if (sellIn.getSellIn() < 0) {
			quality.decrease();
		}
	}

	protected boolean sellWithin(int days) {
		return sellIn.getSellIn() < days;
	}
}
