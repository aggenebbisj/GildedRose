package org.joyofcoding.objectcalisthenics;

public class BackstagePasses extends Item {

	public BackstagePasses(int sellIn, int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", new SellIn(sellIn), new Quality(quality));
	}
	
	@Override
	protected void updateQuality() {
		getQuality().increase();
	}
	
	@Override
	protected void accountForExpirationDate() {
		if (sellWithin(10)) {
			updateQuality();
		}
		if (sellWithin(5)) {
			updateQuality();
		}
		if (isExpired()) {
			getQuality().dropToZero();
		}
	}

}
