package structural.composite;

public class File extends Element {

	public File(String name) {
		super(name);
	}

	@Override
	public void printDetails() {
		System.out.println(this.getName());
	}

}
