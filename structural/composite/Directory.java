package structural.composite;

import java.util.ArrayList;

public class Directory extends Element {

	private ArrayList<Element> elements;
	
	public Directory(String name) {
		super(name);
		elements = new ArrayList<Element>();
	}

	@Override
	public void printDetails() {
		
		System.out.println("<" + this.getName() + ">");
		for (Element e: elements) {
			e.printDetails();
		}
		System.out.println();
	}
	
	public void addElement(Element elem) {
		this.elements.add(elem);
	}
	
}
