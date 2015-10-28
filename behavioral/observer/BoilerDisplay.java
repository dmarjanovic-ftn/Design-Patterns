package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class BoilerDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		System.out.println("Pressure changed to " + ((BoilerManometer) arg).getPressure() + "!");
		
	}

}
