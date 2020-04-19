package br.com.design.patterns.creational.abstractfactory.animal;

public class Dog implements Animal {
	@Override
	public String getAnimal() {
		return "Dog";
	}

	@Override
	public String makeSound() {
		return "Bark";
	}
}
