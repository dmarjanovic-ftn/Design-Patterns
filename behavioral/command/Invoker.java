package behavioral.command;

import java.util.Stack;

public class Invoker {
	
	private Stack<Command> undoStack;
	private Stack<Command> redoStack;
	
	public Invoker() {
		undoStack = new Stack<Command>();
		redoStack = new Stack<Command>();
	}
	
	public void addCommand(Command c) {
		c.execute();
		undoStack.push(c);
	}
	
	public void undoCommand() {
		Command c = undoStack.pop();
		c.unexecute();
		redoStack.push(c);
	}
	
	public void redoCommand() {
		Command c = redoStack.pop();
		c.execute();
		undoStack.push(c);
	}

}
