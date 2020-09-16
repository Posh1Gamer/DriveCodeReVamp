/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.IntakeCommand;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

    private Joystick driverJoystick1 = new Joystick(Constants.DRIVER_JOYSTICK1);
    private Joystick driverJoystick2 = new Joystick(Constants.DRIVER_JOYSTICK2);
    private Joystick operatorJoystick = new Joystick(Constants.OPERATOR_JOYSTICK);

    JoystickButton driverButton1 = new JoystickButton(driverJoystick1, Constants.DRIVER_BUTTON_1);
    JoystickButton operatorButton1 = new JoystickButton(operatorJoystick, Constants.OPERATOR_BUTTON_1);

    public double GetDriver1RawAxis(int axis){
      return driverJoystick1.getRawAxis(axis);
    }
    public double GetDriver2RawAxis(int axis){
      return driverJoystick2.getRawAxis(axis);
    }
    public boolean GetDriverButtonLeft1Status(int button){
      return driverButton1.get();
    }
    public boolean GetOperatorButton1Status(int button){
      return operatorButton1.get();
    }


  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    operatorButton1.whenPressed(new IntakeCommand());
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  //public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //return m_autoCommand;
  
}
