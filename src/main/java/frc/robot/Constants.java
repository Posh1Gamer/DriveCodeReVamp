/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DigitalSource;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

	public static final int MOTOR_LEFT_1_ID = 0;
	public static final int MOTOR_LEFT_2_ID = 1;
	public static final int MOTOR_RIGHT_1_ID = 2;
	public static final int MOTOR_RIGHT_2_ID = 3;
	public static final int DRIVER_JOYSTICK1 = 0;
	public static final int LEFT_STICK_Y = 1;
	public static final int RIGHT_STICK_X = 5;
    public static final double leftDeadZoneDecrease = .1;
    public static final double rightDeadZoneDecrease = .1;
    public static final int BUTTON = 1;
	public static final int DRIVER_BUTTON_1 = 1;
	public static final int DRIVER_JOYSTICK2 = 0;
	public static final int INTAKE_MOTOR_ID = 1;
	public static final int INTAKE_SOLENOID_CHANNEL = 0;
	public static final int OPERATOR_JOYSTICK = 0;
	public static final int OPERATOR_BUTTON_1 = 0;
	public static final int CANNON_MOTOR_ID = 0;
	public static DigitalSource[] kEncoderPorts;
	public static double kSVolts;
	public static double kCosVolts;
	public static double kVVoltSecondPerRad;
	public static double kAVoltSecondSquaredPerRad;
	public static double kP;
	public static double kMaxVelocityRadPerSecond;
	public static double kMaxAccelerationRadPerSecSquared;
	public static double kEncoderDistancePerPulse;
    public static final double kArmOffsetRads = 0.5;
}
