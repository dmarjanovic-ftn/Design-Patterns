package creational.abstract_factory.products.mac;

import creational.abstract_factory.products.Button;

public class ButtonMac extends Button {
	
	public ButtonMac() {
		this.draw();
	}

	@Override
	public void draw() {

		System.out.println("Button for Mac.");

	}

}
