package creational.abstract_factory;

import java.util.ArrayList;

import creational.abstract_factory.creators.Creator;
import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.EditField;
import creational.abstract_factory.products.Label;
import creational.abstract_factory.products.Product;

public class Client {
	
	private ArrayList<Product> products;
	private Creator creator;
	
	public Client (Creator creator, ArrayList<Product> products) {
		this.creator = creator;
		this.setProducts(products);
	}
	
	public void createInterface() {
		
		for (Product p: products) {
			if (p.getClass() == Button.class) {
				creator.createButton();
			}
			
			if (p.getClass() == EditField.class) {
				creator.createEditField();
			}
			
			if (p.getClass() == Label.class) {
				creator.createLabel();
			}
		}
		
		System.out.println("------------------------");
	}

	public Creator getCreator() {
		return creator;
	}

	public void setCreator(Creator creator) {
		this.creator = creator;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

}
