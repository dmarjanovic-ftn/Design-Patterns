package behavioral.observer;

import java.util.Observable;

public class BoilerManometer extends Observable {

	private int pressure;
	
	public BoilerManometer() {
		this.pressure = 0;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		
		this.setChanged();
		
		if (this.hasChanged()) {
			notifyObservers(this);
		}
	
	}
	
}
