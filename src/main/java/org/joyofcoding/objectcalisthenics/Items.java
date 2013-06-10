package org.joyofcoding.objectcalisthenics;

import java.util.List;

public class Items {
	
	private final List<Item> items;
	
	public Items(List<Item> items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
    		item.updateQuality();
    	}
	}
}