package com.rickstore;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getSerialString() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public setPrice(double price) {
		this.price = price;
	} 

	public GuitarSpec getSpec() {
		return spec;
	}
}