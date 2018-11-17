package org.usfirst.frc.team3501.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

public class OI {
	private static OI oi;
	public Joystick ps4_controller;

	// Intake
	public Button runIntakeForward;
	public Button runIntakeBackward;
	public Button toggleIntakePiston;
	public Button toggleIntakeAngle;
	public static Button moveIntakeUp, moveIntakeDown;

	// Elevator
	public static Button moveElevatorToBottom;
	public static Button moveElevatorToTop;
	public static Button moveElevatorUp;
	public static Button moveElevatorDown;

	public OI() {
		ps4_controller = new Joystick(Constants.OI.PS4_CONTROLLER_PORT);

		// Intake
//    runIntakeForward =
//        new JoystickButton(ps4_controller, Constants.OI.RUN_INTAKE_PORT);
//    runIntakeForward.whenPressed(new RunIntake());stants.OI.MOVE_INTAKE_DOWN);

	}

	public static OI getOI() {
		if (oi == null)
			oi = new OI();
		return oi;
	}
}
