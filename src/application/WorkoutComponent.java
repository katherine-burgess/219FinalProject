package application;

import java.util.ArrayList;

/**
 * This class 
 * 
 * @author CS219-user
 *
 */
public class WorkoutComponent {
	
	// instance variables 
	private ArrayList<String> workoutType;
	private long duration;
	private String intensity;
	private int caloriesBurned;
	
	
	WorkoutComponent(long dur, String intensity, int calories){
		duration = dur;
		this.intensity = intensity;
		caloriesBurned = calories;
	}
	
	public void getWorkoutType() {
		
	}
	
	
	public void setWorkout() {
	}
	
	// will get the workout stats from the controller 
	public String getWorkout() {
		return null;
	}
}
