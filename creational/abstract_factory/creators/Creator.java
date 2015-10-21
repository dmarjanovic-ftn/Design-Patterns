package creational.abstract_factory.creators;

import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.EditField;
import creational.abstract_factory.products.Label;

public interface Creator {
	
	public Button createButton();
	public EditField createEditField();
	public Label createLabel();

}
