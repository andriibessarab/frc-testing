package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.utils.Controller;


/**
 *This class holds all the inputs and constants used in the robot's code.
 */
public final class RobotMap {

	/** The IDs of the Xbox controllers used for driving the robot. */
	public static final int XBOX_CONTROLLER_1_ID = 0;
	public static final int XBOX_CONTROLLER_2_ID = 1;

	/** The PWM pins number of SPARK MAX motor controllers. */
	public static final int REAR_LEFT_MOTOR_PWM_PIN = 0;
	public static final int REAR_RIGHT_MOTOR_PWM_PIN = 1;
	public static final int FRONT_LEFT_MOTOR_PWM_PIN = 2;
	public static final int FRONT_RIGHT_MOTOR_PWM_PIN = 3;

	/** The PWM pin number of the Limelight sensor.*/
	public static int LIMELIGHT_PWM_PIN; // undefined

	/** The threshold value of the controller movement below which the movement is ignored. */
	public static final double CONTROLLER_THRESHOLD = 0.2;

	/** The Xbox controller objects used for driving the robot. */
	public final static Controller mController1 = new Controller(XBOX_CONTROLLER_1_ID);
    public final static Controller mController2 = new Controller(XBOX_CONTROLLER_2_ID);

	SendableChooser<Command> trajectories = new SendableChooser();

}
