package br.com.design.patterns.creational.factorymethod.model;

public class Truck implements Transport {

	@Override
	public void deliver() {
		System.out.println("Deliver by land in a box.");
	}

}
