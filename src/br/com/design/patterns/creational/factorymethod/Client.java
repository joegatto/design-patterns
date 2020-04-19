package br.com.design.patterns.creational.factorymethod;

public class Client {
	public static void main(String[] args) throws Exception {
		Logistics logistics = null;
		String type = "Sea";

		if ("Road".equalsIgnoreCase(type)) {
			logistics = new RoadLogistics();
		} else if ("Sea".equalsIgnoreCase(type)) {
			logistics = new SeaLogistics();
		} else {
			throw new Exception("Error! Unknown logistics.");
		}

		logistics.planDelivery();
	}
}
