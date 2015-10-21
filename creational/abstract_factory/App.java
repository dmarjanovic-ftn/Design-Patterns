package creational.abstract_factory;

import java.util.ArrayList;

import creational.abstract_factory.creators.GnomeCreator;
import creational.abstract_factory.creators.MacCreator;
import creational.abstract_factory.creators.WindowsCreator;
import creational.abstract_factory.products.Button;
import creational.abstract_factory.products.EditField;
import creational.abstract_factory.products.Label;
import creational.abstract_factory.products.Product;

public class App {

	/* EXAMPLE: Look&Feel Application simulation
	 * 			
	 * 		We have three products:
	 * 			- Button
	 * 			- Label
	 * 			- Edit field
	 * 
	 * 		We have three Look&Feel:
	 * 			- GNOME
	 * 			- Mac
	 * 			- Windows
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Button());
		products.add(new Button());
		products.add(new EditField());
		products.add(new Label());
		products.add(new Label());
		products.add(new EditField());
		
		Client GnomeClient = new Client(new GnomeCreator(), products);
		GnomeClient.createInterface();
		
		Client MacClient = new Client(new MacCreator(), products);
		MacClient.createInterface();
		
		Client WindowsClient = new Client(new WindowsCreator(), products);
		WindowsClient.createInterface();

	}

}
