package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2855.robot.Robot;

/**
 * tells arm solenoid to pull gear arm in
 */
public class HPanelUp extends Command {

    public HPanelUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.hPanelArm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putString("Gear Arm Status", "Retracted");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.hPanelArm.HPanelUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.hPanelArm.HatchArmNull();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
