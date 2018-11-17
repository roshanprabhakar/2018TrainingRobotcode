package org.usfirst.frc.team3501.robot;

import org.usfirst.frc.team3501.robot.commands.intake.Climb;
import org.usfirst.frc.team3501.robot.subsystems.Climber;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {
	private static OI oi;
	private static Climber climber;
	private Command climb;

	@Override
	public void robotInit() {
		climber = Climber.getClimber();
		oi = OI.getOI();
	}

	@Override
	public void autonomousInit() {
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		climb = new Climb();
		Scheduler.getInstance().removeAll();
	}

	@Override
	public void teleopPeriodic() {
		climb.start();
		Scheduler.getInstance().run();
	}

	public static OI getOI() {
		return OI.getOI();
	}

	public static Climber getClimber() {
		return Climber.getClimber();
	}

}
