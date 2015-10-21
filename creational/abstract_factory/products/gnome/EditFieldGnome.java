package creational.abstract_factory.products.gnome;

import creational.abstract_factory.products.EditField;

public class EditFieldGnome extends EditField {

	public EditFieldGnome() {
		this.draw();
	}
	
	@Override
	public void draw() {

		System.out.println("EditField for GNOME.");
		
	}

}
