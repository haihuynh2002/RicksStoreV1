package com.rickstore;

public class InventoryTestDrive {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initInventory(inventory);

		GuitarSpec spec = new GuitarSpec("New Model", 8, Builder.BUILDER_01,
							Type.TYPE_01, Wood.WOOD_01);
		List<Guitar> matchingGuitars = inventory.search(spec);
		System.out.println("Matching guitar list: ");
		if(!matchingGuitars.isEmpty()) {
			matchingGuitars.forEach(System.out::println);
		}
		System.out.println("Sorry! There is not any suitable guitar for you.")
	}
	
	public static initInventory(Inventory inventory) {
	}

}