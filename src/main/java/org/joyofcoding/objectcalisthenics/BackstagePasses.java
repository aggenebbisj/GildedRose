package org.joyofcoding.objectcalisthenics;

public class BackstagePasses extends Item {

	public BackstagePasses(int sellIn, int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}

	@Override
	void updateQuality() {
		decreaseSellIn();
		increaseQuality();
		if (sellWithin(10)) {
			increaseQuality();
		}
		if (sellWithin(5)) {
			increaseQuality();
		}
		if (sellWithin(0)) {
			setQuality(0);
		}
	}

}
