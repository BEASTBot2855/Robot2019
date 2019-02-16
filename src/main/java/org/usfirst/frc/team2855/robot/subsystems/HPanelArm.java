package org.usfirst.frc.team2855.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class HPanelArm extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private static WPI_TalonSRX hatchSpx = RobotMap.hatchSpx;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        hatchSpx.set(ControlMode.Position, 10.0);
    }
    
    public void HPanelUp() {
    	HPanelMove(1.0);
    }
    
    public void HPanelDown() {
        HPanelMove(-1.0);
    }

    public void HPanelStop() {
        HPanelMove(0.0);
    }

    private void HPanelMove(double value) {
        hatchSpx.set(value);
    }
}

