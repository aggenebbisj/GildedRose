package org.joyofcoding.objectcalisthenics;

public class Sulfuras extends Item {

	public Sulfuras(int sellIn, int quality) {
		super("Sulfuras, Hand of Ragnaros", new SellIn(sellIn), new Quality(quality));
	}

	@Override
	public
	void update() {
		// Sulfuras does not decrease in value and never has to be sold.
	}

}
