package creational.abstract_factory.products.windows;

import creational.abstract_factory.products.Label;

public class LabelWindows extends Label {
	
	public LabelWindows() {
		this.draw();
	}

	@Override
	public void draw() {
		
		System.out.println("Label for Windows.");

	}

}
