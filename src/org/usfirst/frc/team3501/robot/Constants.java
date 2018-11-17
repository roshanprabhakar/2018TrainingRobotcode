package org.usfirst.frc.team3501.robot;

import edu.wpi.first.wpilibj.SPI;


public class Constants {
  public static class OI {

    // CONTROLLERS
    public final static int PS4_CONTROLLER_PORT = 3;

    // Buttons
    public static final int SQUARE_BUTTON_PORT = 1;
    public static final int X_BUTTON_PORT = 2;
    public static final int CIRCLE_BUTTON_PORT = 3;
    public static final int TRIANGLE_BUTTON_PORT = 4;
    public static final int L1_BUTTON_PORT = 5;
    public static final int R1_BUTTON_PORT = 6;
    public static final int L2_BUTTON_PORT = 7;
    public static final int R2_BUTTON_PORT = 8;
    public static final int PS_SHARE_BUTTON = 9;
    public static final int OPTIONS_BUTTON = 10;
    public static final int L3_BUTTON = 11;
    public static final int R3_BUTTON = 12;
    public static final int PS_BUTTON_PORT = 13;

    // Intake
    public static int RUN_INTAKE_PORT = SQUARE_BUTTON_PORT;
    public static int REVERSE_INTAKE_PORT = CIRCLE_BUTTON_PORT;
    public static int TOGGLE_INTAKE_ANGLE = PS_SHARE_BUTTON;
    public static int INTAKE_PISTON_PORT = L2_BUTTON_PORT;
    public static int MOVE_INTAKE_UP = TRIANGLE_BUTTON_PORT;
    public static int MOVE_INTAKE_DOWN = X_BUTTON_PORT;

    // Elevator
    public static final int ELEVATOR_TO_TOP = R3_BUTTON;
    public static final int ELEVATOR_TO_BOTTOM = L3_BUTTON;
    public static final int MOVE_ELEVATOR_UP = R1_BUTTON_PORT;
    public static final int MOVE_ELEVATOR_DOWN = L1_BUTTON_PORT;
  }

  public static class Elevator {
    // LIFT MOTOR CONTROLLERS
    public static final int ELEVATOR_MOTOR = 9;
    public static final int ELEVATOR_ENCODER_TALON = 2;

    // HALL EFFECT LIMIT SENSORS
    public static final int TOP_LIMIT_SWITCH = 1;
    public static final int BOTTOM_LIMIT_SWITCH = 0;

  }

  public static class DriveTrain {
    // MOTOR CONTROLLERS
    public static final int FRONT_LEFT = 5;
    public static final int FRONT_RIGHT = 7;
    public static final int REAR_LEFT = 4;
    public static final int REAR_RIGHT = 1;
    public static final SPI.Port GYRO_PORT = SPI.Port.kOnboardCS0;
  }

  public static class Intake {
    // MOTOR CONTROLLERS
    public static final int INTAKE_PORT = 6;
    public static final int INTAKE_PISTON_PORT = 0;
    public static final int INTAKE_PISTON_PORT_TWO = 7;

    public static final int INTAKE_ANGLE_PORT = 8;
    public static final int INTAKE_ANGLE_ENCODER_PORT = 8;
  }

  public static class Auton {
    public static final double SCALE_FACTOR_TESTING = 1;
    public static final boolean AUTON_DEBUGGING = false;
    public static final boolean INCLUDE_TIME_STAMP = false;
  }

  public static enum Direction {
    LEFT, RIGHT, DOWN, UP, FORWARD, BACKWARD;
  }

}
