package creational.abstract_factory.products.gnome;

import creational.abstract_factory.products.Label;

public class LabelGnome implements Label {

	@Override
	public void draw() {
		
		System.out.println("Label for Gnome.");

	}

}
