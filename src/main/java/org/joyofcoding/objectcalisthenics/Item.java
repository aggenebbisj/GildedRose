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

	protected Item(String name, SellIn sellIn, Quality quality) {
		this.name = name;
		this.quality = quality;
		this.sellIn = sellIn;
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
		sellIn.decrease();
		quality.decrease();
		if (isExpired()) {
			quality.decrease();
		}
	}

	protected boolean isExpired() {
		return sellWithin(0);
	}

	protected boolean sellWithin(int days) {
		return sellIn.sellWithin(days);
	}
}
