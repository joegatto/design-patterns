package br.com.design.patterns.creational.abstractfactory;

import br.com.design.patterns.creational.abstractfactory.color.Black;
import br.com.design.patterns.creational.abstractfactory.color.Brown;
import br.com.design.patterns.creational.abstractfactory.color.Color;
import br.com.design.patterns.creational.abstractfactory.color.White;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String type) {
		if ("White".equalsIgnoreCase(type)) {
			return new White();
		} else if ("Black".equalsIgnoreCase(type)) {
			return new Black();
		} else if ("Brown".equalsIgnoreCase(type)) {
			return new Brown();
		}
		return null;
	}

}
