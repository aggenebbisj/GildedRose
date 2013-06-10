package org.joyofcoding.objectcalisthenics;

public class Item {
	private final String name;
	private final SellIn sellIn;
	private final Quality quality;

	public Item(String name, int sellIn, int quality) {
		this(name, new SellIn(sellIn), new Quality(quality));
	}

	protected Item(String name, SellIn sellIn, Quality quality) {
		this.name = name;
		this.quality = quality;
		this.sellIn = sellIn;
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

	public void update() {
		sellIn.decrease();
		updateQuality();
		accountForExpirationDate();
	}

	protected void updateQuality() {
		quality.decrease();
	}
	
	protected void accountForExpirationDate() {
		if (isExpired()) {
			updateQuality();
		}
	}
	
	public boolean isExpired() {
		return sellIn.daysLeft() < 0;
	}

	public boolean sellWithin(int days) {
		return sellIn.daysLeft() < days;
	}
	
}