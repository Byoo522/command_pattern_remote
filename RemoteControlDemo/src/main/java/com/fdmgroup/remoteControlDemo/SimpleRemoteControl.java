package com.fdmgroup.remoteControlDemo;

public class SimpleRemoteControl {
	Command[] commands;  // array of commands
	

	public SimpleRemoteControl() {
		commands = new Command[4];
		
	}

	public void setCommand(Command command, int slot) {
		// set the command the remote will execute
		commands[slot] = command;
	}

	public void buttonWasPressed(int slot) {
		commands[slot].execute();
	}
}
