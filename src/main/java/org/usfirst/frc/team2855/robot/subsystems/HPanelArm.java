package org.usfirst.frc.team2855.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class HPanelArm extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private static WPI_TalonSRX hatchSpx = RobotMap.hatchSpx;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
        hatchSpx.set(ControlMode.Position, 10.0);
    }

    public void init() {
        // int pidLoopIdx = 0;
        // int timeoutMs = 30;
        // double kF = 0.0;
        // double kP = 0.0;
        // double kI = 0.0;
        // double kD = 0.0;
        // hatchSpx.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, pidLoopIdx, timeoutMs);
        // hatchSpx.setSensorPhase(true);
        // hatchSpx.setInverted(false);
        // hatchSpx.configNominalOutputForward(0, timeoutMs);
        // hatchSpx.configNominalOutputReverse(0, timeoutMs);
        // hatchSpx.configPeakOutputForward(1, timeoutMs);
        // hatchSpx.configPeakOutputReverse(-1, timeoutMs);
        // hatchSpx.configAllowableClosedloopError(pidLoopIdx, 0, timeoutMs);
        // hatchSpx.config_kF(pidLoopIdx, kF, timeoutMs);
        // hatchSpx.config_kP(pidLoopIdx, kP, timeoutMs);
        // hatchSpx.config_kI(pidLoopIdx, kI, timeoutMs);
        // hatchSpx.config_kD(pidLoopIdx, kD, timeoutMs);
        // int absolutePosition = hatchSpx.getSensorCollection().getPulseWidthPosition() & 0xfff * -1;
        // hatchSpx.setSelectedSensorPosition(absolutePosition, pidLoopIdx, timeoutMs);
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
        SmartDashboard.putNumber("Hatch Encoder", hatchSpx.getSelectedSensorPosition());
    }
}
