package br.com.design.patterns.creational.factorymethod;

import br.com.design.patterns.creational.factorymethod.model.Ship;
import br.com.design.patterns.creational.factorymethod.model.Transport;

public class SeaLogistics extends Logistics {

	@Override
	public Transport createTransport() {
		return new Ship();
	}

}
