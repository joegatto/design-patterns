package br.com.design.patterns.creational.abstractfactory;

import br.com.design.patterns.creational.abstractfactory.animal.Animal;
import br.com.design.patterns.creational.abstractfactory.animal.Bear;
import br.com.design.patterns.creational.abstractfactory.animal.Dog;
import br.com.design.patterns.creational.abstractfactory.animal.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {
		if ("Dog".equalsIgnoreCase(animalType)) {
			return new Dog();
		} else if ("Bear".equalsIgnoreCase(animalType)) {
			return new Bear();
		} else if ("Duck".equalsIgnoreCase(animalType)) {
			return new Duck();
		}
		return null;
	}

}
