package creational.abstract_factory.products.mac;

import creational.abstract_factory.products.EditField;

public class EditFieldMac extends EditField {
	
	public EditFieldMac() {
		this.draw();
	}

	@Override
	public void draw() {

		System.out.println("EditField for Mac.");

	}

}
