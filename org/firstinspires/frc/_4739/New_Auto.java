package org.firstinspires.frc._4739;

import org.firstinspires.frc.framework.abstraction.MatchPhaseRoutine;

public class New_Auto extends MatchPhaseRoutine 
{

	
	private int[] actionTimes = 
	{
	
		5, 6, 7, 8, 9
	
	}
	
	private static final float MATCH_TIME_INCREMENT = 1/20;
	
	private float currentMatchSeconds;
	
	public void start()
	{
	
		currentMatchSeconds = 0;
	
	}
	
	public void tick()
	{
	
		if (currentMatchSeconds < actionTimes[0]) {
		
			Hardware.TankDrive.left(1);
			Hardware.TankDrive.right(1);
		
		} else if (currentMatchSeconds < actionTimes[1]) {
		
			Hardware.Forklift.drive(1);
			Hardware.TankDrive.left(0);
			Hardware.TankDrive.right(0);
		
		} 
		else if (currentMatchSeconds < actionTimes[2]) {
		
			Hardware.Forklift.drive(0);
			Hardware.TankDrive.left(-1);
			Hardware.TankDrive.right(-1);
		
		}
		else if (currentMatchSeconds < actionTimes[3]) {
		
			Hardware.TankDrive.left(-1);
			Hardware.TankDrive.right(1);
		
		}
		else if (currentMatchSeconds < actionTimes[4]) {
		
			Hardware.Forklift.drive(-1);
			Hardware.TankDrive.left(0);
			Hardware.TankDrive.right(0);
		
		} else {
		
			Hardware.Forklift.drive(0);		
		
		}
	
		currentMatchSeconds += MATCH_TIME_INCREMENT;
	
	}
}
