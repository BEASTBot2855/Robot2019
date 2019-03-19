/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2855.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// Drivetrain
	public static WPI_TalonSRX driverightBottom;
	public static WPI_TalonSRX driverightTop;
	public static SpeedControllerGroup driveSpeedControllerGroupRight;
	public static WPI_TalonSRX driveleftTop;
	public static WPI_TalonSRX driveleftBottom;
	public static SpeedControllerGroup driveSpeedControllerGroupLeft;
	public static DifferentialDrive driveDifferentialDrive1;

	// 2019 Ramp
	public static Solenoid lRampSolenoid;
	public static Solenoid rRampSolenoid;
	public static WPI_TalonSRX lRampSrx;
	public static WPI_TalonSRX rRampSrx;

	// 2019 Hatch Panel
	public static Solenoid hatchSolenoid;
	public static WPI_TalonSRX hatchSpx;
	public static DigitalInput hatchLimitSwitch0;
	public static DigitalInput hatchLimitSwitch1;
	public static DigitalInput hatchLightSwitch;

	// Misc.
	public static Preferences preferences;
	public static CameraServer camera;

	
	public static void init() {
		
		// Drivetrain
		driverightBottom = new WPI_TalonSRX(2);
		driverightTop = new WPI_TalonSRX(1);
		driveSpeedControllerGroupRight = new SpeedControllerGroup(driverightTop, new SpeedController[] {driverightBottom});
		driveleftTop = new WPI_TalonSRX(3);
		driveleftBottom = new WPI_TalonSRX(4);
		driveSpeedControllerGroupLeft = new SpeedControllerGroup(driveleftTop, new SpeedController[] {driveleftBottom});
		driveDifferentialDrive1 = new DifferentialDrive(driveSpeedControllerGroupLeft, driveSpeedControllerGroupRight);
		driveDifferentialDrive1.setSafetyEnabled(true);
		driveDifferentialDrive1.setExpiration(0.1);
		driveDifferentialDrive1.setMaxOutput(1.0);
	
		// 2019 Ramp		
		lRampSolenoid = new Solenoid(0, 0);
		rRampSolenoid = new Solenoid(0, 1);
		lRampSrx = new WPI_TalonSRX(6);
		rRampSrx = new WPI_TalonSRX(5);

		// 2019 Hatch Panel
		hatchSolenoid = new Solenoid(7);
		hatchSpx = new WPI_TalonSRX(7);
		hatchLimitSwitch0 = new DigitalInput(0);
		hatchLimitSwitch1 = new DigitalInput(1);
		hatchLightSwitch = new DigitalInput(2);

		CameraServer.getInstance().startAutomaticCapture();
		
		preferences = Preferences.getInstance();
		
	}
	
}
