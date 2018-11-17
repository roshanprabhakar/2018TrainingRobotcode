package org.usfirst.frc.team3501.robot.commands.intake;

import org.usfirst.frc.team3501.robot.Robot;
import org.usfirst.frc.team3501.robot.subsystems.Climber;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Climb extends Command {
	private final int FINAL_TIME = 4; //change this after testing
	private final int MAX_MOTOR_OUTPUT = 1; //do not change (0 - 1)
	private final int OFF = 0; //do not change (0 - 1)
	private Climber climber = Robot.getClimber();

	public Climb() {
		requires(climber);
	}

	@Override
	protected void initialize() {
	}

	// running the following two methods execute and isFinished in that order
	@Override
	protected void execute() {
		climber.setMotorValues(MAX_MOTOR_OUTPUT);
	}

	@Override
	protected boolean isFinished() {
		// code this
		if (this.timeSinceInitialized() > FINAL_TIME) { // in seconds
			return true;
		}
		return false;
	}

	@Override
	protected void end() { // change 0 to value that keeps the robot suspended in place
		climber.setMotorValues(OFF); // just stops motor like off switch
	}

	@Override
	protected void interrupted() {
		System.out.println("Interrupted");
		end();
	}
}
