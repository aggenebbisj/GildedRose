package org.joyofcoding.objectcalisthenics;

public class BackstagePasses extends Item {

	public BackstagePasses(int sellIn, int quality) {
		super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}

	@Override
	void updateQuality() {
		if (getQuality() < 50) {
			setQuality(getQuality() + 1);

			if (getSellIn() < 11) {
				if (getQuality() < 50) {
					setQuality(getQuality() + 1);
				}
			}

			if (getSellIn() < 6) {
				if (getQuality() < 50) {
					setQuality(getQuality() + 1);
				}
			}
		}

		setSellIn(getSellIn() - 1);

		if (getSellIn() < 0) {
			setQuality(getQuality() - getQuality());
		}
	}
}
