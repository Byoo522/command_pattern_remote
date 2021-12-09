package com.fdmgroup.remoteControlDemo;

public class LightOnCommand implements Command {

	Light light;
	
	// light constructor
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}

}
