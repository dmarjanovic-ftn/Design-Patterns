package creational.abstract_factory.products.gnome;

import creational.abstract_factory.products.Button;

public class ButtonGnome extends Button {
	
	public ButtonGnome() {
		this.draw();
	}

	@Override
	public void draw() {

		System.out.println("Button for GNOME.");

	}

}
