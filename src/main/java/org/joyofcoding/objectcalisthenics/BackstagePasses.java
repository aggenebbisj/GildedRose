package org.joyofcoding.objectcalisthenics;

public class BackstagePasses extends Item {

	public BackstagePasses(int sellIn, int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", new SellIn(sellIn), new Quality(quality));
	}
	
	@Override
	void updateQuality() {
		getSellIn().decrease();
		getQuality().increase();
		if (sellWithin(10)) {
			getQuality().increase();
		}
		if (sellWithin(5)) {
			getQuality().increase();
		}
		if (isExpired()) {
			setQuality(0);
		}
	}

}
