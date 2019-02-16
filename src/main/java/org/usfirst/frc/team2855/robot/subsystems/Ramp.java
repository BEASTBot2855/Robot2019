package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

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

	public void moveRamp(boolean upDown) {
		lRampSolenoid.set(true);
		rRampSolenoid.set(true);
		if (upDown) {
			lRampSrx.set(1.0);
			rRampSrx.set(1.0);
		} else {
			lRampSrx.set(-1.0);
			rRampSrx.set(-1.0);
		}

	}

	public void stopRamp() {
		lRampSolenoid.set(false);
		rRampSolenoid.set(false);
		lRampSrx.set(0);
		rRampSrx.set(0);

	}

}
