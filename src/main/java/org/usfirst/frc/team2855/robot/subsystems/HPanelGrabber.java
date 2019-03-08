package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class HPanelGrabber extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final Solenoid hatchSolenoid = RobotMap.hatchSolenoid;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void hPanelGrab() {
    	hatchSolenoid.set(false);
    }
    
    public void hPanelRelease() {
    	hatchSolenoid.set(true);
    }
    
}

