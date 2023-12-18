package model;

import java.util.ArrayList;

// Goal Class - Creates goal objects that contains the user's exercise goals
public class Goal {
	
	// fields
	// Contains the user's main daily goals
	private User user; 
	private String dailyMins; 
	private String dailyCalsBurned; 
	private String height; 
	private String weight; 

	// Constructor
	public Goal(String dailyMins, String dailyCalsBurned, String height, String weight) {
		super();
		this.dailyMins = dailyMins;
		this.dailyCalsBurned = dailyCalsBurned;
		this.height = height; 
		this.weight = weight; 
	}

	// getters and setters
	public String getDailyMins() {
		return dailyMins;
	}

	public void setDailyMins(String dailyMins) {
		this.dailyMins = dailyMins;
	}

	public String getDailyCalsBurned() {
		return dailyCalsBurned;
	}

	public void setDailyCalsBurned(String dailyCalsBurned) {
		this.dailyCalsBurned = dailyCalsBurned;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	// toString method
	@Override
	public String toString() {
		return "Goal [dailyMins=" + dailyMins + ", dailyCalsBurned=" + dailyCalsBurned + ", height=" + height
				+ ", weight=" + weight + "]";
	}
	
}
