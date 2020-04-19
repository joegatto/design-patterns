package br.com.design.patterns.creational.abstractfactory;

import br.com.design.patterns.creational.abstractfactory.animal.Animal;
import br.com.design.patterns.creational.abstractfactory.color.Color;

public class Client {
	public static void main(String[] args) {
		AnimalFactory animalFactory = (AnimalFactory) FactoryProvider.getFactory("Animal");
		ColorFactory colorFactory = (ColorFactory) FactoryProvider.getFactory("Color");

		Animal dog = animalFactory.create("Dog");
		System.out.println(dog.makeSound());

		Animal duck = animalFactory.create("Duck");
		System.out.println(duck.makeSound());

		Color white = colorFactory.create("White");
		System.out.println(white.getColor());

		Color black = colorFactory.create("Black");
		System.out.println(black.getColor());

	}
}
