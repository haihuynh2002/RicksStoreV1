package com.rickstore;
import java.util.*;

interface Inventory {
	List<Guitar> inventory;

	public Inventory(List<Guitar> inventory) {
		this.inventory = inventory;
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Guitar guitar = new Guitar(serialNumber, price, spec);
		inventory.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		Iterator<Guitar> it = inventory.itorator();
		while(it.hasNext()) {
			Guitar guitar = it.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
		}
		return null;
	}

	public List<Guitar> search(GuitarSpec spec) {
		List<Guitar> matchingGuitars = new ArrayList<>();
		Itorator<Guitar> it = inventory.iterator();
		while(it.hasNext()) {
			Guitar guitar = it.next();
			if(guitar.getGuitarSpec().equals(spec)) {
				matchingGuitars.add(guitar);
				return;
			}
		}
	}
}