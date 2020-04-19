package br.com.design.patterns.creational.abstractfactory.animal;

public class Bear implements Animal {
	@Override
	public String getAnimal() {
		return "Bear";
	}

	@Override
	public String makeSound() {
		return "Growls";
	}
}
