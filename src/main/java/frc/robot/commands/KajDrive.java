/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class KajDrive extends CommandBase {
  /**
   * Creates a new KajDrive.
   */
  public KajDrive() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.driveTrain);
  }

// Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double driveOut = 0.0;
    double steerOut = 0.0;
    boolean isQuickTurn = Robot.m_oi.GetButtonStatus(Constants.BUTTON_1);

    double leftStickY = Robot.m_oi.GetDriver1RawAxis(Constants.LEFT_STICK_Y);
    double rightStickX = Robot.m_oi.GetDriver2RawAxis(Constants.RIGHT_STICK_X);
    if(leftStickY > 0) {
      driveOut = leftStickY + Constants.leftDeadZoneDecrease;
    }
    else if(leftStickY < 0){
      driveOut = leftStickY - Constants.leftDeadZoneDecrease;
    }

    if(rightStickX > 0) {
      steerOut = rightStickX + Constants.rightDeadZoneDecrease;
    }
    else if(rightStickX < 0){
      steerOut = rightStickX - Constants.rightDeadZoneDecrease;
    }

    Robot.driveTrain.curvatureDrive(driveOut, steerOut, isQuickTurn);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
