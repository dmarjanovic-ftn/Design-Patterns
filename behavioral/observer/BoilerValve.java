package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class BoilerValve implements Observer {
	
	static int MAX_PRESSURE = 15;

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		BoilerManometer boiler = (BoilerManometer) arg;
		
		if (boiler.getPressure() > MAX_PRESSURE) {
			System.out.println("Valve opened!");
		}
	}

}
