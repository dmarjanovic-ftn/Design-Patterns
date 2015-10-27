package structural.composite;

public abstract class Element {
	
	private String name;
	
	public Element (String name) {
		this.setName(name);
	}
	
	public abstract void printDetails();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
