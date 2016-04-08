package org.firstinspires.frc._4739;

import org.firstinspires.frc.framework.abstraction.MatchPhaseRoutine;
import org.firstinspires.frc._4739.JoyConfig;

/**
 * Code for the school musical.
 * @author FRC 4739 Thunderbolts Robotics
 */
public class Teleop extends MatchPhaseRoutine {
	private static final double DRIVE_SPEED_MULTIPLIER = 0.1;

	public void start() {
		//Kill auto
		new Disabled().start();
	}

	public void tick() {
		Hardware.TankDrive.left(JoyConfig.Joy1.getLeftYAxis() * DRIVE_SPEED_MULTIPLIER);
		Hardware.TankDrive.right(JoyConfig.Joy1.getRightYAxis() * DRIVE_SPEED_MULTIPLIER);
		if(JoyConfig.Joy1.getRightYAxis() > 0.1 || JoyConfig.Joy1.getRightYAxis() < -0.1){
			Hardware.FrontArm.drive(1);
		}else if(JoyConfig.Joy1.getLeftYAxis() > 0.1 || JoyConfig.Joy1.getLeftYAxis() < -0.1){
			Hardware.FrontArm.drive(1);
		}else{
			Hardware.FrontArm.drive(0);
		}
	}
}
