package behavioral.state;

import behavioral.state.states.StateA;
import behavioral.state.states.StateB;
import behavioral.state.states.StateC;

public class App {

	public static void main(String[] args) {
		
		Context context = new Context(new StateA());
		context.request();
		
		context.setState(new StateB());
		context.request();
		
		context.setState(new StateA());
		context.request();
		
		context.setState(new StateC());
		context.request();

	}

}
