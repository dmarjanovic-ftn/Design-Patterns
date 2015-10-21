package creational.abstract_factory.products.windows;

import creational.abstract_factory.products.Button;

public class ButtonWindows extends Button {
	
	public ButtonWindows() {
		this.draw();
	}

	@Override
	public void draw() {

		System.out.println("Button for Windows.");

	}

}
