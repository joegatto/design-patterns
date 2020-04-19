package br.com.design.patterns.creational.factorymethod;

import br.com.design.patterns.creational.factorymethod.model.Transport;
import br.com.design.patterns.creational.factorymethod.model.Truck;

public class RoadLogistics extends Logistics {

	@Override
	public Transport createTransport() {
		return new Truck();
	}

}
