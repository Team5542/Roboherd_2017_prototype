package org.usfirst.frc.team5542.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static int lfMotor = 11;
	public static int rfMotor = 10;
	public static int lbMotor = 9;
	public static int rbMotor = 8;
	
	//gyro
	public static int gyro = 1;
	
	//limit switch
	public static int limit = 0;
	
	//encoder
	public static int enc1 = 2;
	public static int enc2 = 3;
	
	//solenoid (controlled over the PCM)
	public static int solenoid = 0;
	
	// Throwing motors
	public static int ltMotor = 13;
	public static int rtMotor = 12;
	
	//camera 1 motors
	public static int panServo2 = 3;
	public static int tiltservo2 = 4;
	
	//Lift motors
	public static int liftMotor = 14;
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
