package model;

import java.util.ArrayList;

// Activity class - Creates activity objects that stores the details from the user's workout sessions
public class Activity {
	
	// fields
	// Contains fields for an activity that the user inputs in the exercise log 
	private String date;  
	private String activity;
	public static String duration;  
	public static String calsBurned; 
	private String heartRate;
	
	// Constructor
	public Activity(String date, String activity, String duration, String calsBurned, String heartRate) {
		super();
		this.date = date;
		this.activity = activity;
		this.duration = duration;
		this.calsBurned = calsBurned;
		this.heartRate = heartRate;
	}

	// Getters and Setters
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCalsBurned() {
		return calsBurned;
	}

	public void setCalsBurned(String calsBurned) {
		this.calsBurned = calsBurned;
	}

	public String getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}

	// toString method
	@Override
	public String toString() {
		return "Activity [date=" + date + ", activity=" + activity + ", duration=" + duration + ", calsBurned="
				+ calsBurned + ", heartRate=" + heartRate + "]";
	}
	
	
	
}
