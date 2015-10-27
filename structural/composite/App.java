package structural.composite;

public class App {
	
	/*	
	 * 	Use this pattern when we need composition of objects in tree structure. 
	 *  e.g. Directories, subdirectories and files.
	 *  
	 *  NOTE:
	 *  	It's important to make difference between Leaf Elements and !Leaf Elements.
	 *  
	 */

	public static void main(String[] args) {
		
		Directory root = new Directory("Real Madrid C.F.");

		Directory defenders = new Directory("Defenders");
		
		defenders.addElement(new File("Sergio Ramos (C)"));
		defenders.addElement(new File("Raphael Varane"));
		defenders.addElement(new File("Marcelo"));
		
		Directory midfielders = new Directory("Midfielders");
		midfielders.addElement(new File("Alarcon Isco"));
		midfielders.addElement(new File("James Rodriguez"));
		midfielders.addElement(new File("Toni Kroos"));
		
		root.addElement(defenders);
		root.addElement(midfielders);
		root.addElement(new File("Carlo Ancelotti"));
		
		root.printDetails();
		
	}

}
