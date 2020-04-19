package br.com.design.patterns.creational.builder.model;

public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("pan baked");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("pepperoni+salami");
	}

}
