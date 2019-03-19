package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class Test1 extends InstantCommand {

	private static DigitalInput hatchLimitSwitch0 = RobotMap.hatchLimitSwitch0;
	private static DigitalInput hatchLimitSwitch1 = RobotMap.hatchLimitSwitch1;
	private static DigitalInput hatchLightSwitch = RobotMap.hatchLightSwitch;

	public Test1() {}
	
	protected void initialize() { System.out.println("-----Test1 has run-----"); }

	public static void testLimitSwitch() {
		SmartDashboard.putBoolean("Limit Switch 0", hatchLimitSwitch0.get());
		SmartDashboard.putBoolean("Limit Switch 1", hatchLimitSwitch1.get());
		SmartDashboard.putBoolean("Light Switch", hatchLightSwitch.get());
	}
	
}
