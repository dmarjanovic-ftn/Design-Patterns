package creational.abstract_factory.products.windows;

import creational.abstract_factory.products.Button;

public class ButtonWindows implements Button {

	@Override
	public void draw() {

		System.out.println("Button for Windows.");

	}

}
