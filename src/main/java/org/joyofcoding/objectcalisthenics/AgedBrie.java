package org.joyofcoding.objectcalisthenics;

public class AgedBrie extends Item {

	public AgedBrie(int sellIn, int quality) {
		super("Aged Brie", sellIn, quality);
	}

	@Override
	void updateQuality() {
		increaseQuality();

		decreaseSellIn();

		if (getSellIn() < 0) {
			increaseQuality();
		}
	}

}
