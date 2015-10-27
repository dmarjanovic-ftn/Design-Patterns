package behavioral.command.commands;

import behavioral.command.Command;

public class Command1 implements Command {

	@Override
	public void execute() {
		System.out.println("Command 1 executed!");
	}

	@Override
	public void unexecute() {
		System.out.println("Command 1 unexecuted!");
	}

}
