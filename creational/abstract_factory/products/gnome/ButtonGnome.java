package creational.abstract_factory.products.gnome;

import creational.abstract_factory.products.Button;

public class ButtonGnome implements Button {

	@Override
	public void draw() {

		System.out.println("Button for GNOME.");

	}

}
