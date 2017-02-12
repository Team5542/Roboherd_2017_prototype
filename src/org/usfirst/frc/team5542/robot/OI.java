package org.usfirst.frc.team5542.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//import edu.wpi.first.wpilibj.buttons.Button;

//import org.usfirst.frc.team5542.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	Joystick xbox = new Joystick(0);
	Joystick stick = new Joystick(1);

	// XBox Controller Layout
	Button aButton = new JoystickButton(xbox, 1);
	Button bButton = new JoystickButton(xbox, 2);
	Button xButton = new JoystickButton(xbox, 3);
	Button yButton = new JoystickButton(xbox, 4);
	Button lBumper = new JoystickButton(xbox, 5);
	Button rBumper = new JoystickButton(xbox, 6);
	Button select = new JoystickButton(xbox, 7);
	Button start = new JoystickButton(xbox, 8);
	Button lStick = new JoystickButton(xbox, 9);
	Button rStick = new JoystickButton(xbox, 10);

	// axis map
	public static final int lxAxis = 0;
	public static final int lyAxis = 1;
	public static final int rxAxis = 4;
	public static final int ryAxis = 5;
	public static final int rTrigger = 3;
	public static final int lTrigger = 2;
	public static final int dPad = 0;
	
	public Joystick getXbox(){
		return xbox;
	}
	
	public Joystick getStick() {
		return stick;
	}
	
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
