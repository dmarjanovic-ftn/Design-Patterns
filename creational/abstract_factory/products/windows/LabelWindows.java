package creational.abstract_factory.products.windows;

import creational.abstract_factory.products.Label;

public class LabelWindows implements Label {

	@Override
	public void draw() {
		
		System.out.println("Label for Windows.");

	}

}
