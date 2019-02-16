package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class HPanelArm extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private final DoubleSolenoid armDoubleSolenoid = RobotMap.gearInOutSolenoid;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void HPanelUp() {
    	armDoubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    public void HPanelDown() {
    	armDoubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    public void HatchArmNull() {
    	armDoubleSolenoid.set(DoubleSolenoid.Value.kOff);
    }

}

