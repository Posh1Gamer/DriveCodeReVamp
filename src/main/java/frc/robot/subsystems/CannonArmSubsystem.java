/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class CannonArmSubsystem extends SubsystemBase {
  /**
   * Creates a new CannonArmSubsystem.
   */
        TalonSRX cannonMotor = new TalonSRX(Constants.CANNON_MOTOR_ID);
        //create limit switch and set port
        DigitalInput CannonLimit = new DigitalInput(Constants.CANNON_LIMIT_ID);
       
        public CannonArmSubsystem() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
}
