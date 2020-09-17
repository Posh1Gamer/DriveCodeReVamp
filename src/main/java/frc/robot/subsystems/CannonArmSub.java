/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.controller.ProfiledPIDController;
import edu.wpi.first.wpilibj.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj2.command.ProfiledPIDSubsystem;
import frc.robot.Constants;

public class CannonArmSub extends ProfiledPIDSubsystem {{
  /**
   * Creates a new CannonArmSub.
   */
   //create talon and set port
        TalonSRX cannonMotor = new TalonSRX(Constants.CANNON_MOTOR_ID);
        //create limit switch and set port
        DigitalInput CannonLimit = new DigitalInput(Constants.CANNON_LIMIT_ID);

        //set motor controller default settings
        cannonMotor.configFactoryDefault();

        //zeroes encoder output
        cannonMotor.setSelectedSensorPosition(0, 0, 0);
        // configures encoder
        cannonMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);

        //inverts motor outputs
        cannonMotor.setInverted(true);
        //inverts ecoder inputs
        cannonMotor.setSensorPhase(true);

        //sets %output range
        cannonMotor.configNominalOutputForward(0, Constants.CANNON_TIMEOUT);
        cannonMotor.configNominalOutputReverse(0, Constants.CANNON_TIMEOUT);
        cannonMotor.configPeakOutputForward(1, Constants.CANNON_TIMEOUT);
        cannonMotor.configPeakOutputReverse(-1, Constants.CANNON_TIMEOUT);

        //selects which PID value configuration to use
        cannonMotor.selectProfileSlot(Constants.CANNON_SLOT_IDX, Constants.CANNON_LOOP_IDX);
        cannonMotor.config_kF(Constants.CANNON_SLOT_IDX, Constants.CANNON_F, Constants.CANNON_TIMEOUT);
        cannonMotor.config_kP(Constants.CANNON_SLOT_IDX, Constants.CANNON_P, Constants.CANNON_TIMEOUT);
        cannonMotor.config_kI(Constants.CANNON_SLOT_IDX, Constants.CANNON_I, Constants.CANNON_TIMEOUT);
        cannonMotor.config_kD(Constants.CANNON_SLOT_IDX, Constants.CANNON_D, Constants.CANNON_TIMEOUT);

        //set max speed(velocity)
        cannonMotor.configMotionCruiseVelocity(Constants.CANNON_CRUISE_VELOCITY);
        //set max acceleration
        cannonMotor.configMotionAcceleration(Constants.CANNON_ACCELERATION);
        //set cannon SCurve
        cannonMotor.configMotionSCurveStrength(Constants.CANNON_S_CURVE);
      }

  public CannonArmSub() {
    super(
        // The ProfiledPIDController used by the subsystem
        new ProfiledPIDController(0, 0, 0,
                                  // The motion profile constraints
                                  new TrapezoidProfile.Constraints(0, 0)));
  }

  @Override
  public void useOutput(double output, TrapezoidProfile.State setpoint) {
    // Use the output (and optionally the setpoint) here
  }

  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    return 0;
  }
}
