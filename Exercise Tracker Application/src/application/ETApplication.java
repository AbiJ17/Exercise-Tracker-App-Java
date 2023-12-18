/*
 * Description:  The Exercise Tracker application allows the user to input their daily exercise sessions so that they can track their progress and physical activity on a daily basis. 
 * 				 Users would need to create a new account (with a username and password) and store their information (goals and exercise sessions), so they will know how they ended up doing. 
 * 				 They will be able to log out and log back into the application to update and check their progress (they need to enter the correct login information in order to do this)s. 
 * 				 The application allows the user to set and edit daily exercise goals, so that it helps them with their progress and helps them improve from their previous exercise sessions. 
 * Features: 		  - User is able to create a new account (username and password) and they are able to save and edit their changes (profile screen). 
 * 					  - User is able to input and save details from their exercise sessions that were done for a week (exercise log screen). 
 * 					  - User is able to input and save their 2 main daily exercise goals. They can also make changes to their exercise goals and save those changes as well (goals screen). 
 * 					  - When the user inputs and saves their exercise sessions on the exercise log screen, they will be able to track their daily exercise progress (amount of calories burned
 * 								and amount of activity done daily) on the goals screen (user needs to go to exercise log screen first and then go to goals screen in order to see their progress). 
 */  
package application;

import java.awt.EventQueue;

import controller.ETAppController; 

public class ETApplication {
	
	public static void main(String[] args) { 
		new ETAppController(); 
	}

}

