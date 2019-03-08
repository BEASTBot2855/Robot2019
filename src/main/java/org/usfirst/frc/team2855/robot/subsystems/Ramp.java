package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Timer;

public class Ramp extends Subsystem {

	private final Solenoid lRampSolenoid;
	private final Solenoid rRampSolenoid;
	private final WPI_TalonSRX lRampSrx;
	private final WPI_TalonSRX rRampSrx;

	public Ramp() {
		lRampSolenoid = RobotMap.lRampSolenoid;
		rRampSolenoid = RobotMap.rRampSolenoid;
		lRampSrx = RobotMap.lRampSrx;
		rRampSrx = RobotMap.rRampSrx;
	}

	public void initDefaultCommand() {
	}

	public void periodic() {
	}

	public void moveRamp(boolean moveUp) {
		lRampSolenoid.set(true);
		rRampSolenoid.set(true);
		Timer.delay(.5);
		if (moveUp) {
			lRampSrx.set(-.5);
			rRampSrx.set(.5);
		} else {
			lRampSrx.set(.25);
			rRampSrx.set(-.25);
		}

	}

	public void stopRamp() {
		lRampSrx.set(0);
		rRampSrx.set(0);
		Timer.delay(.5);
		lRampSolenoid.set(false);
		rRampSolenoid.set(false);

	}

}
