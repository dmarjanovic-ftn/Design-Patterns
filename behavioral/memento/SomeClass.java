package behavioral.memento;

public class SomeClass {

	private String name;
	private String surname;
	private int number;
	
	public SomeClass(String name, String surname, int number) {
		this.name = name;
		this.surname = surname;
		this.number = number;
	}
	
	public Memento createMemento() {
		
		Memento m = new Memento();
		
		m.setName(this.name);
		m.setSurname(this.surname);
		m.setNumber(this.number);
		
		return m;
	}
	
	public void restoreObject(Memento m) {
		this.name = m.getName();
		this.surname = m.getSurname();
		this.number = m.getNumber();
	}
	
	public void printObject() {
		System.out.println(this.name);
		System.out.println(this.surname);
		System.out.println(this.number);
		System.out.println();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
