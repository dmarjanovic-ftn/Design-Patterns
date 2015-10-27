package behavioral.template_method;

public class App {

	public static void main(String[] args) {

		Template pattern = new Pattern1();
		
		pattern.doSomething();
		
		pattern = new Pattern2();
		
		pattern.doSomething();

	}

}
