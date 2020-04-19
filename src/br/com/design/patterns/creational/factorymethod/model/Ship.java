package br.com.design.patterns.creational.factorymethod.model;

public class Ship implements Transport {

	@Override
	public void deliver() {
		System.out.println("Deliver by sea in a container.");
	}
	
}
