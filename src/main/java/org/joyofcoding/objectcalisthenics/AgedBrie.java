package org.joyofcoding.objectcalisthenics;

public class AgedBrie extends Item {

	public AgedBrie(int sellIn, int quality) {
		super("Aged Brie", new SellIn(sellIn), new Quality(quality));
	}

	@Override
	void updateQuality() {
		getSellIn().decrease();
		getQuality().increase();
		if (isExpired()) {
			getQuality().increase();
		}
	}

}
