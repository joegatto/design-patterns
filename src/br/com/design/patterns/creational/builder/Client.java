package br.com.design.patterns.creational.builder;

import br.com.design.patterns.creational.builder.model.HawaiianPizzaBuilder;
import br.com.design.patterns.creational.builder.model.Pizza;
import br.com.design.patterns.creational.builder.model.PizzaBuilder;
import br.com.design.patterns.creational.builder.model.SpicyPizzaBuilder;
import br.com.design.patterns.creational.builder.model.User;

public class Client {
	public static void main(String[] args) {

		// Using the Pizza approach
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyBuilder = new SpicyPizzaBuilder();

		waiter.setPizzaBuilder(hawaiianBuilder);
		waiter.constructPizza();

		Pizza hawaiianPizza = waiter.getPizza();
		System.out.println(hawaiianPizza);

		waiter.setPizzaBuilder(spicyBuilder);
		waiter.constructPizza();

		Pizza spicePizza = waiter.getPizza();
		System.out.println(spicePizza);

		// Using the User approach
		User user1 = new User.UserBuilder("João", "Gatto").age(32).phone("1234567").address("Fake address 1234")
				.build();
		System.out.println(user1);

		User user2 = new User.UserBuilder("Jack", "Reacher").age(40).phone("5655").build();
		System.out.println(user2);
		
		User user3 = new User.UserBuilder("Super", "Man").build();
		System.out.println(user3);

	}
}
