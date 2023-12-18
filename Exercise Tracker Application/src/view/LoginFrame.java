package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.FileImportController;
import model.User;

// Login screen - First frame that shows when user runs application, user needs to enter the correct login or create a new account to continue
public class LoginFrame extends JFrame implements ActionListener {

	// Creates a new JPanel for the frame
	private LoginPanel loginPanel = new LoginPanel ();
	
	// Stores the user's login info
	public static ArrayList <User> users = new ArrayList(); 

	// Constructor
	public LoginFrame() {
		
		// sets the properties of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650, 920);
		setTitle("Exercise Tracker Application"); 
		add(loginPanel);
		
		// methods
		addButtonListeners(); 

	}
	
	// Makes the buttons on the frame clickable
	private void addButtonListeners() { 
		loginPanel.LoginButton.addActionListener(this); 
		loginPanel.createNewAccountButton.addActionListener(this);
	}
	
	// Sets the action events for each button
	public void actionPerformed(ActionEvent e) {
		
		// If user clicks the login button 
		if (e.getSource() == loginPanel.LoginButton) {
			
			// Stores the user's input for both username and password
			String username = loginPanel.Username_textField.getText();  
			String password = loginPanel.passwordField.getText(); 
			
			// If the textfields are empty, then user is told to fill in both textfields to continue via a pop-up message
			if (username.isEmpty() || password.isEmpty()) { 
				JOptionPane.showMessageDialog(loginPanel, "Please fill in both fields.");
			}
			
			// If the inputed username and password match the User's data, then login is successful (goes to Home page)
			// If not, then user will be prompted to enter their login again. 
			else if (username.equals(User.username) && (password.equals(User.password))) { 
				JOptionPane.showMessageDialog(loginPanel, "Login Successful!");    // message indicating that login is successful pops up
				
				HomeFrame homeFrame = new HomeFrame();		 // creates a new object that takes the user to the home page when their login is successful
				homeFrame.setVisible(true);			// Makes home screen visible to user 
				dispose();                    // Closes the Login Screen 
				
			} else { 
				JOptionPane.showMessageDialog(loginPanel, "Invalid Login. Try Again.");   // error message pops up
				loginPanel.passwordField.setText("");          // Clears the password textfield 
				loginPanel.Username_textField.setText("");     // Clears the username textfield
			}
			
			
			// Read user's username and password from the text file
			boolean login = false; 
			
			if (username.isEmpty() || password.isEmpty()) { 
				JOptionPane.showMessageDialog(loginPanel, "Please fill in both fields.");
			}
			
			for (User user : FileImportController.users) { 
				String fileUsername = user.getUsername(); 
				String filePassword = user.getPassword(); 
				
				if (username.equals(fileUsername) && (password.equals(filePassword))) { 
					login = true; 
					break; 
				} 
			}
			
			if (login = true) { 
				JOptionPane.showMessageDialog(loginPanel, "Login Successful!");    // message indicating that login is successful pops up
				HomeFrame homeframe = new HomeFrame();     // takes the user to the home page when their login is successful
				homeframe.setVisible(true);           // Makes home screen visible to user 
				dispose();                    // Closes the Login Screen 
			} else { 
				JOptionPane.showMessageDialog(loginPanel, "Invalid Login. Try Again.");   // error message pops up
				loginPanel.Username_textField.setText("");     // Clears the username textfield
				loginPanel.passwordField.setText("");          // Clears the password textfield 
			}
			
			
		// If user clicks the Create New Account button
		} else if (e.getSource() == loginPanel.createNewAccountButton) { 
			
			// Tells user that they're being directed to the Profile Screen. 
			JOptionPane.showMessageDialog(loginPanel, "Directing you to the Profile Screen");
		 
			dispose();     // Closes the Login Screen
			ProfileFrame profileFrame = new ProfileFrame();     // Creates and opens a new profileframe
			profileFrame.setVisible(true);
		}
	}

}
