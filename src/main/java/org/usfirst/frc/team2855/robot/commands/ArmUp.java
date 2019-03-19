package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.RobotMap;
import org.usfirst.frc.team2855.robot.subsystems.HPanelArm;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * tells arm solenoid to push gear arm out
 */
public class ArmUp extends Command {

    private static DigitalInput hatchLimitSwitch0 = RobotMap.hatchLimitSwitch0;
    private static DigitalInput hatchLimitSwitch1 = RobotMap.hatchLimitSwitch1;
    private static DigitalInput hatchLightSwitch = RobotMap.hatchLightSwitch;

    public ArmUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.hPanelArm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putString("Panel Arm Status", "Going Up");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(HPanelArm.wasLastIn) {
                Robot.hPanelArm.HPanelUp();
            Robot.hPanelArm.HPanelStop();
        } else {
            while(hatchLightSwitch.get())
                Robot.hPanelArm.HPanelDown();
            Robot.hPanelArm.HPanelStop();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(!hatchLightSwitch.get()) {
            return true;
        } else if (!hatchLimitSwitch0.get()) {
            HPanelArm.wasLastIn = false;
            return true;
        } else if (!hatchLimitSwitch1.get()) {
            HPanelArm.wasLastIn = true;
            return true;
        } else {
            return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.hPanelArm.HPanelStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
