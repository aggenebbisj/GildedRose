package org.joyofcoding.objectcalisthenics;

public class BackstagePasses extends Item {

	public BackstagePasses(int sellIn, int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}

	@Override
	void updateQuality() {
		decreaseSellIn();
		getQuality().increase();
		if (sellWithin(10)) {
			getQuality().increase();
		}
		if (sellWithin(5)) {
			getQuality().increase();
		}
		if (sellWithin(0)) {
			setQuality(0);
		}
	}

}
