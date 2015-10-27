package behavioral.memento;

public class App {
	
	/*
	 * 	Memento Pattern is used in Web Browsers in Cookies. 
	 *  Idea behind this pattern is - save object of some class without knowing what are you saving.
	 *  
	 */

	public static void main(String[] args) {
		
		SomeClass obj = new SomeClass("Sergio", "Ramos", 4);
		
		obj.printObject();
		
		Memento m = obj.createMemento();
		
		obj.setName("Alarcon");
		obj.setSurname("Isco");
		
		obj.printObject();
		
		obj.setNumber(22);
		
		obj.printObject();
		
		obj.restoreObject(m);
		obj.printObject();

	}

}
