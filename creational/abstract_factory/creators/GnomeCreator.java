package creational.abstract_factory.creators;

import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.EditField;
import creational.abstract_factory.products.Label;
import creational.abstract_factory.products.gnome.ButtonGnome;
import creational.abstract_factory.products.gnome.EditFieldGnome;
import creational.abstract_factory.products.gnome.LabelGnome;

public class GnomeCreator implements Creator {

	@Override
	public Button createButton() {
		return new ButtonGnome();
	}

	@Override
	public EditField createEditField() {
		return new EditFieldGnome();
	}

	@Override
	public Label createLabel() {
		return new LabelGnome();
	}

}
