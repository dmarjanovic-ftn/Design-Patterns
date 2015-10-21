package creational.abstract_factory.products.mac;

import creational.abstract_factory.products.Label;

public class LabelMac implements Label {

	@Override
	public void draw() {
		
		System.out.println("Label for Mac.");

	}

}
