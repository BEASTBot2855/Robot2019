/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2855.robot;

import org.usfirst.frc.team2855.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
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
	
	
	public Joystick attack3 = new Joystick(0);
	public Joystick extreme3dpro = new Joystick(1);
	public Joystick xbox = new Joystick(2);
	
	public JoystickButton rampUp;
	public JoystickButton rampDown;
	public JoystickButton panelUp;
	public JoystickButton panelDown;
	public JoystickButton panelGrab;
	public JoystickButton panelRelease;
	
	public JoystickButton armOut;
	public JoystickButton armUp;
	public JoystickButton armIn;

	public OI() {

		// extreme3dpro
		rampUp = new JoystickButton(extreme3dpro, 6);
		rampUp.whileHeld(new RampUp());

		rampDown = new JoystickButton(extreme3dpro, 4);
		rampDown.whileHeld(new RampDown());

		panelUp = new JoystickButton(extreme3dpro, 5);
		panelUp.whileHeld(new HPanelUp());

		panelDown = new JoystickButton(extreme3dpro, 3);
		panelDown.whileHeld(new HPanelDown());

		panelRelease = new JoystickButton(extreme3dpro, 1);
		panelRelease.whileHeld(new HPanelRelease());

		// panelGrab = new JoystickButton(attack3, 3);
		// panelGrab.whileHeld(new HPanelGrab());

		// attack3
		rampUp = new JoystickButton(attack3, 4);
		rampUp.whileHeld(new RampUp());

		rampDown = new JoystickButton(attack3, 5);
		rampDown.whileHeld(new RampDown());

		panelUp = new JoystickButton(attack3, 3);
		panelUp.whileHeld(new HPanelUp());

		panelDown = new JoystickButton(attack3, 2);
		panelDown.whileHeld(new HPanelDown());
		
		panelRelease = new JoystickButton(attack3, 1);
		panelRelease.whileHeld(new HPanelRelease());

		// xbox

		armIn = new JoystickButton(xbox, 2);
		armIn.whenPressed(new ArmIn());

		armUp = new JoystickButton(xbox, 1);
		armUp.whenPressed(new ArmUp());

		armOut = new JoystickButton(xbox, 4);
		armOut.whenPressed(new ArmOut());
	}
	
	public Joystick getattack3() {return attack3;}
	
	public Joystick getextreme3dpro() {return extreme3dpro;}
	
	public Joystick getxbox() {return xbox;}
	
}
