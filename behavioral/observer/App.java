package behavioral.observer;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Observer Pattren Example\n");
		
		Random r = new Random();
		
		BoilerManometer boiler = new BoilerManometer();
		
		boiler.addObserver(new BoilerDisplay());
		boiler.addObserver(new BoilerValve());
		
		for (int i = 0; i < 5; ++i) {
			boiler.setPressure(r.nextInt(40));
		}

	}

}
