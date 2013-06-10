package org.joyofcoding.objectcalisthenics;

public class BackstagePasses extends Item {

	public BackstagePasses(int sellIn, int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", new SellIn(sellIn), new Quality(quality));
	}
	
	@Override
	void updateQuality() {
		getSellIn().decrease();
		adjustQuality();
		if (sellWithin(10)) {
			adjustQuality();
		}
		if (sellWithin(5)) {
			adjustQuality();
		}
		if (isExpired()) {
			setQuality(0);
		}
	}

	@Override
	protected void adjustQuality() {
		getQuality().increase();
	}

}
