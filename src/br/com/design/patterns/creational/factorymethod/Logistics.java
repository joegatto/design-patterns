package br.com.design.patterns.creational.factorymethod;

import br.com.design.patterns.creational.factorymethod.model.Transport;

public abstract class Logistics {

	public void planDelivery() {
		Transport transport = createTransport();
		transport.deliver();
	}

	abstract protected Transport createTransport();
}
