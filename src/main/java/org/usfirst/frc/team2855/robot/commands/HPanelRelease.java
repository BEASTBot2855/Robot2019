package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * tells gear solenoid to release gear
 */
public class HPanelRelease extends Command {

    public HPanelRelease() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.hPanelGrabber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putString("Gear Status", "Released");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.hPanelGrabber.hPanelRelease();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.hPanelGrabber.hatchGrabberNull();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
