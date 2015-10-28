package behavioral.state;

import behavioral.state.states.State;

public class Context {

	private State state;
	
	public Context(State state) {
		this.state = state;
	}
	
	public void request() {
		state.doSomething();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
}
