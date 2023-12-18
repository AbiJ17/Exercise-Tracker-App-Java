package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Activity;
import model.Goal;
import model.User;

// Class that reads all User, Activity, and Goal object data from the text files
public class FileImportController {
	
	// fields
	// Arrays that store the data for each user (login info), their activities (for exerciselogframe) and their goals (for goalsframe)
	public static ArrayList <User> users = new ArrayList(); 
	public static ArrayList <Activity> activities = new ArrayList(); 
	public static ArrayList <Goal> goals = new ArrayList(); 
	
	// Constructor
	public FileImportController() { 
		userFileImport(); 
		activityFileImport(); 
		goalFileImport(); 
	} 

	// This method reads/scans all the users from the txt file  - with help from Aathushan K. (50%)
	public void userFileImport(){
		{
			
			// Creates a new string array which stores the parameters of the user object
			String [] usersDetails = new String [4]; 

			try {

				// Inputs the data of the users from the txt file
				File user = new File("Files/Users");

				// Creates a new scanner to scan through the file
				Scanner myReader = new Scanner(user); 
				
				// Continues reading the file while there are more rows of data
				while (myReader.hasNextLine()) {

					String info = myReader.nextLine(); 
					usersDetails = info.split(","); 
					
					// create parameters
					String name = usersDetails[0];
					String gender = usersDetails[1];
					String username = usersDetails[2]; 
					String password = usersDetails[3]; 	
					
					// Adds users into the text file
					users.add(new User(name, gender, username, password));
				}
				// Closes the reader
				myReader.close();
				
				// If the file isn't found
			} catch (FileNotFoundException error) {

				// Provide an error message
				System.out.println("File not found, please check again: " + error);

			} // End try-catch block

		}
	}
	
	// This method reads/scans all the user's activities from the txt file
	public void activityFileImport() { 
		{
		
		// Creates a new string array which stores the parameters of the activity object
		String [] activityDetails = new String [5]; 

		try {

			// Inputs the data of the users from the txt file
			File act = new File("Files/Activity");

			// Creates a new scanner to scan through the file
			Scanner myReader = new Scanner(act); 
			
			// Continues inputting the file while there are more rows of data
			while (myReader.hasNextLine()) {

				String info = myReader.nextLine(); 
				activityDetails = info.split(","); 
				
				// create parameters
				String date = activityDetails[1];
				String activity = activityDetails[2];
				String duration = activityDetails[3]; 
				String calsBurned = activityDetails[4]; 	
				String heartRate = activityDetails[5]; 
				
				// Adds activities into the text file
				activities.add(new Activity(date, activity, duration, calsBurned, heartRate));
			}
			// Closes the reader
			myReader.close();

			// If the file isn't found
		} catch (FileNotFoundException error) {

			// Provide an error message
			System.out.println("File not found, please check again: " + error);

		} // End try-catch block

		}
		
	}
	
	// This method reads/scans all the user's goals from the txt file
	public void goalFileImport() { 
		
		{
			// Creates a new string array which stores the parameters of the goal object
			String [] goalDetails = new String [4]; 

			try {

				// Inputs the data of the users from the txt file
				File goal = new File("Files/Goals");

				// Creates a new scanner to scan through the file
				Scanner myReader = new Scanner(goal); 
				
				// Continues inputting the file while there are more rows of data
				while (myReader.hasNextLine()) {

					String info = myReader.nextLine(); 
					goalDetails = info.split(","); 
					
					// create parameters
					String dailyMins = goalDetails[0];
					String dailyCalsBurned = goalDetails[1];
					String height = goalDetails[2]; 
					String weight = goalDetails[3]; 	
					
					// Adds goals into the text file
					goals.add(new Goal(dailyMins, dailyCalsBurned, height, weight));
				}
				// Closes the reader
				myReader.close();

				// If the file isn't found
			} catch (FileNotFoundException error) {

				// Provide an error message
				System.out.println("File not found, please check again: " + error);

			} // End try-catch block

			}
		
	}

}
