package org.joyofcoding.objectcalisthenics;

public class Sulfuras extends Item {

	public Sulfuras(int sellIn, int quality) {
		super("Sulfuras, Hand of Ragnaros", sellIn, quality);
	}

	@Override
	void updateQuality() {
		// Sulfuras does not decrease in value and never has to be sold.
	}

}
