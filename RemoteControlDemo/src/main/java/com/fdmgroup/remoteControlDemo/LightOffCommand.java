package com.fdmgroup.remoteControlDemo;

public class LightOffCommand implements Command {
	Light light;
	
	// Light Constructor
	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
