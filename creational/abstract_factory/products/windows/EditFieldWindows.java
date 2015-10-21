package creational.abstract_factory.products.windows;

import creational.abstract_factory.products.EditField;

public class EditFieldWindows extends EditField {
	
	public EditFieldWindows() {
		this.draw();
	}

	@Override
	public void draw() {

		System.out.println("EditField for Windows.");

	}

}
