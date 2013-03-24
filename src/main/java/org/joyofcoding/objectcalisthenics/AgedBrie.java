package org.joyofcoding.objectcalisthenics;

public class AgedBrie extends Item {

	public AgedBrie(int sellIn, int quality) {
		super("Aged Brie", sellIn, quality);
	}

	@Override
	void updateQuality() {
		decreaseSellIn();
		increaseQuality();
		if (sellWithin(0)) {
			increaseQuality();
		}
	}

}
