package creational.abstract_factory.creators;

import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.EditField;
import creational.abstract_factory.products.Label;
import creational.abstract_factory.products.mac.ButtonMac;
import creational.abstract_factory.products.mac.EditFieldMac;
import creational.abstract_factory.products.mac.LabelMac;

public class MacCreator implements Creator {

	@Override
	public Button createButton() {
		return new ButtonMac();
	}

	@Override
	public EditField createEditField() {
		return new EditFieldMac();
	}

	@Override
	public Label createLabel() {
		return new LabelMac();
	}

}
