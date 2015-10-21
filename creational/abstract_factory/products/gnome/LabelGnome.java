package creational.abstract_factory.products.gnome;

import creational.abstract_factory.products.Label;

public class LabelGnome extends Label {

	public LabelGnome() {
		this.draw();
	}
	
	@Override
	public void draw() {
		
		System.out.println("Label for GNOME.");

	}

}
