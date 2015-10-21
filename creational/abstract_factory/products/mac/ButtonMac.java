package creational.abstract_factory.products.mac;

import creational.abstract_factory.products.Button;

public class ButtonMac implements Button {

	@Override
	public void draw() {

		System.out.println("Button for Mac.");

	}

}
