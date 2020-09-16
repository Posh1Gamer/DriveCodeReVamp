/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  private TalonSRX intakeMotor = new TalonSRX(Constants.INTAKE_MOTOR_ID);
  private Solenoid intakeSolenoid = new Solenoid(Constants.INTAKE_SOLENOID_CHANNEL);

  /**
   * Creates a new Intake.
   */
  public Intake() {
  }

  @Override
  public void periodic() {
  }
    public void startIntake() {
      intakeMotor.set(ControlMode.PercentOutput, 1);
      intakeSolenoid.set(true);
    }
    public void stopIntake() {
      intakeMotor.set(ControlMode.PercentOutput, 0);
      intakeSolenoid.set(false);
    }
  
    // This method will be called once per scheduler run
  }
