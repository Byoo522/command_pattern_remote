package com.fdmgroup.remoteControlDemo;

public class RemoteControlMain {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();

		// we can dynamically change command on the remote control
		remote.setCommand(new LightOnCommand(light), 0);
		remote.setCommand(new LightOffCommand(light), 1);
		remote.setCommand(new StereoOnWithCDCommand(stereo), 2);
		remote.setCommand(new StereoOffCommand(stereo), 3);
		
		
		
		remote.buttonWasPressed(0);
		remote.buttonWasPressed(1);
		remote.buttonWasPressed(2);
		remote.buttonWasPressed(3);

	}

}
