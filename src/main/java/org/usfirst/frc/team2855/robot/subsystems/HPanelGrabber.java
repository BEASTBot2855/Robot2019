package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class HPanelGrabber extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final DoubleSolenoid gearDoubleSolenoid = RobotMap.gearPinchSolenoid;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void hPanelGrab() {
    	gearDoubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void hPanelRelease() {
    	gearDoubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void hatchGrabberNull() {
    	gearDoubleSolenoid.set(DoubleSolenoid.Value.kOff);
    }
}

