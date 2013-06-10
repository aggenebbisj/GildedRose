package org.joyofcoding.objectcalisthenics.assertions;

import static org.fest.assertions.api.Assertions.extractProperty;

import java.util.ArrayList;
import java.util.List;

import org.fest.assertions.api.AbstractIterableAssert;
import org.fest.assertions.api.Assertions;
import org.joyofcoding.objectcalisthenics.Item;

public class ItemsAssert extends
		AbstractIterableAssert<ItemsAssert, Iterable<Item>, Item> {

	
	protected ItemsAssert(Iterable<Item> actual) {
		super(actual, ItemsAssert.class);
	}

	public static ItemsAssert assertThat(Iterable<Item> actual) {
		return new ItemsAssert(actual);
	}

	public ItemsAssert containsOnlyItemNames(String... names) {
		isNotNull();

		Iterable<String> actualItemNames = extractProperty("name", String.class)
				.from(actual);
		
		Assertions
				.assertThat(actualItemNames)
				.containsOnly(names);

		return this;
	}
	
	public ItemsAssert containsOnlyItemQualities(Integer... qualities) {
		isNotNull();
		
		List<Integer> actualItemQualities = new ArrayList<>();
		for (Item item : actual) {
			actualItemQualities.add(item.getQuality().getQuality());
		}
        Assertions.assertThat(actualItemQualities).containsOnly(qualities);
        
		return this;
	}
	
	public ItemsAssert containsOnlyItemSellIns(Integer... sellIns) {
		isNotNull();
		
		List<Integer> actualItemSellIns = new ArrayList<>();
		for (Item item : actual) {
			actualItemSellIns.add(item.getSellIn().getSellIn());
		}
		Assertions.assertThat(actualItemSellIns).containsOnly(sellIns);
		
		return this;
	}

}
