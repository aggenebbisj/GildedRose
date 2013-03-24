package org.joyofcoding.objectcalisthenics;

public class AgedBrie extends Item {

	public AgedBrie(int sellIn, int quality) {
		super("Aged Brie", sellIn, quality);
	}

	@Override
	void updateQuality() {
		if (getQuality() < 50) {
			setQuality(getQuality() + 1);
		}

		setSellIn(getSellIn() - 1);

		if (getSellIn() < 0) {
			if (getQuality() < 50) {
				setQuality(getQuality() + 1);
			}
		}
	}

}
