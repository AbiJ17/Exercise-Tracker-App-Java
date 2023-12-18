package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.FileImportController;
import model.User;

// Profile Screen - Where the User can create a new account, or make changes to their existing account
public class ProfileFrame extends JFrame implements ActionListener {
	
	// Creates a menubar for the home screen 
	public JMenuBar menu = new JMenuBar(); 
		
	// The 3 buttons/menu items that the menu bar is going to contain 
	public static JMenuItem homeItem = new JMenuItem("HOME"); 
	public static JMenuItem helpItem = new JMenuItem("HELP"); 
	public static JMenuItem logOutItem = new JMenuItem("LOG OUT");
	
	// Stores the user's info
	public static ArrayList <User> users = new ArrayList(); 
	private static User currentUser; 

	// Creates a new JPanel for the frame
	private ProfilePanel profilePanel = new ProfilePanel();

	// Constructor
	public ProfileFrame() {
		
		// Sets the properties of the frame
		setTitle("ET App - Profile Screen"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650, 920);
		setJMenuBar(menu);
		add(profilePanel); 
		
		// methods
		menuBarElements(); 
		addButtonListener(); 
	}

	// Adds the menu items to the menu bar
	private void menuBarElements() {
		
		// adds the home button to menu bar
		homeItem.setHorizontalAlignment(SwingConstants.CENTER);
		homeItem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menu.add(homeItem);
				
		// adds the help button to menu bar
		helpItem.setHorizontalAlignment(SwingConstants.CENTER);
		helpItem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menu.add(helpItem);
				
		// adds the Log Out button to menu bar
		logOutItem.setHorizontalAlignment(SwingConstants.CENTER);
		logOutItem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menu.add(logOutItem);
	}
	
	// Makes the buttons clickable
	private void addButtonListener() {
		profilePanel.saveButton.addActionListener(this);
	}
	
	// Stores the user's info 
	// From the previous project (Post Secondary App - Group 3) 
	public static User getUser() { 
		return currentUser; 
	}

	// Sets the action events for each button
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// If user clicks the save button
		if (e.getSource() == profilePanel.saveButton) { 
			
			// Stores the user's inputed textfields as string fields (so that it can be stored as a User Object)
			String name = profilePanel.name_textField.getText(); 
			String gender = profilePanel.gender_textField.getText(); 
			String username = profilePanel.createUsername_textField.getText(); 
			String password = profilePanel.createPasswordField.getText(); 
			
			// If the textfields are empty, then user is told to fill in both textfields to continue via a pop-up message
			if (name.isEmpty() || gender.isEmpty()|| username.isEmpty() || password.isEmpty()) { 
				JOptionPane.showMessageDialog(profilePanel, "Fill in the required field(s) before proceeding");
			
			// If all textfields are filled
			} else { 
				JOptionPane.showMessageDialog(profilePanel, "Your Changes have been Saved!"); // Lets user know their info is saved via pop-up message
				
				// User's info is written into a text file - help from Aathushan K. (50%)
				String user = name + ", " + gender + ", " + username + ", " + password + "\n";  
				try { 
					Files.write(Paths.get("Files/Users"), user.getBytes(), StandardOpenOption.APPEND); 
				FileImportController.users.add(new User(name, gender, username, password)); 
				} catch (IOException error) { 
					System.out.println("error"); 
				}
				
				// Stores the user's info in a new User Object (DEBUGGING)
				currentUser = new User(name, gender, username, password); 
				System.out.println(currentUser); 
			}
			
			
		}
		
	}

}
