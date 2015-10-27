package behavioral.command.commands;

import behavioral.command.Command;

public class Command2 implements Command {

	@Override
	public void execute() {
		System.out.println("Command 2 executed!");
	}

	@Override
	public void unexecute() {
		System.out.println("Command 2 unexecuted!");
	}

}
