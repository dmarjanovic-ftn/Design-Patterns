package behavioral.command.commands;

import behavioral.command.Command;

public class Command3 implements Command {

	@Override
	public void execute() {
		System.out.println("Command 3 executed!");
	}

	@Override
	public void unexecute() {
		System.out.println("Command 3 unexecuted!");
	}

}
