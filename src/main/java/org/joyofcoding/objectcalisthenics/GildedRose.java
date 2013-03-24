package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
		GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
	}

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new AgedBrie(2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Sulfuras(0, 80));
		items.add(new BackstagePasses(15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));
        return items;
    }

    public void updateQuality(List<Item> list) {
    	for (Item item : list) {
    		item.updateQuality();
    	}
    }

}
