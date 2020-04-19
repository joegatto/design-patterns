package br.com.design.patterns.creational.singleton;

public class Client {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Singleton singleton = Singleton.getInstance();
			System.out.println(singleton);
		}
	}
}
