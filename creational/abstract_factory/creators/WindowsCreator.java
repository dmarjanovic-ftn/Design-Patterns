package creational.abstract_factory.creators;

import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.EditField;
import creational.abstract_factory.products.Label;
import creational.abstract_factory.products.windows.ButtonWindows;
import creational.abstract_factory.products.windows.EditFieldWindows;
import creational.abstract_factory.products.windows.LabelWindows;

public class WindowsCreator implements Creator {

	@Override
	public Button createButton() {
		return new ButtonWindows();
	}

	@Override
	public EditField createEditField() {
		return new EditFieldWindows();
	}

	@Override
	public Label createLabel() {
		return new LabelWindows();
	}

}
