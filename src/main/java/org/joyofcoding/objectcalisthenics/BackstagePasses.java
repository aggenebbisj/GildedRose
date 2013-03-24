package org.joyofcoding.objectcalisthenics;

public class BackstagePasses extends Item {

	public BackstagePasses(int sellIn, int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}

	@Override
	void updateQuality() {
		decreaseSellIn();
		increaseQuality();

		if (getSellIn() < 10) {
			increaseQuality();
		}

		if (getSellIn() < 5) {
			increaseQuality();
		}

		if (getSellIn() < 0) {
			setQuality(0);
		}
	}

}
