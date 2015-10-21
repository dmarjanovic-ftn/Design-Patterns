package creational.abstract_factory.products.windows;

import creational.abstract_factory.products.EditField;

public class EditFieldWindows implements EditField {

	@Override
	public void draw() {

		System.out.println("EditField for Windows.");

	}

}
