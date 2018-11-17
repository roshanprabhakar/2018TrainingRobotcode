package org.usfirst.frc.team3501.robot.subsystems;

import org.usfirst.frc.team3501.robot.MathLib;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
	static Climber climber;
	private WPI_TalonSRX ClimberTalon;

	private Climber() {
		// MOTOR CONTROLLERS
		this.ClimberTalon = new WPI_TalonSRX(2); // port number on electrical board

	}

	public static Climber getClimber() {
		if (climber == null) {
			climber = new Climber();
		}
		return climber;
	}

	public void setMotorValues(double motorSpeed) { // rpm
		motorSpeed = MathLib.restrictToRange(motorSpeed, -1.0, 1.0);

		ClimberTalon.set(ControlMode.PercentOutput, motorSpeed);
	}

	public void stop() {
		setMotorValues(0);
	}

	@Override
	protected void initDefaultCommand() {
	}

}
