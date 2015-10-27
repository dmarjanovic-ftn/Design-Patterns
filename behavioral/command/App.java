package behavioral.command;

import behavioral.command.commands.Command1;
import behavioral.command.commands.Command2;
import behavioral.command.commands.Command3;

public class App {
	
	/*
	 * 	Classical example of usage this pattern is UNDO - REDO. 
	 */

	public static void main(String[] args) {
		
		Invoker invoker = new Invoker();

		invoker.addCommand(new Command1());
		invoker.addCommand(new Command2());
		invoker.addCommand(new Command3());
		invoker.addCommand(new Command3());
		invoker.addCommand(new Command2());
		// 1 2 3 3 2
		
		invoker.undoCommand();
		invoker.undoCommand();
		// 1 2 3		3 2
		
		invoker.redoCommand();
		// 1 2 3 3	  	2
		
	}

}
