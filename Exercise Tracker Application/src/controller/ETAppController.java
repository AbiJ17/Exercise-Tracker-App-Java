package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.ExerciseLogFrame;
import view.ExerciseLogPanel;
import view.GoalsFrame;
import view.HelpFrame;
import view.HomeFrame;
import view.HomePanel;
import view.LoginFrame;
import view.ProfileFrame;
import view.ProfilePanel;

// Contains the starting frame (frame that first shows up when the application runs)
// Contains the events that occur when the user clicks one of the buttons in the HomeFrame (main menu)
public class ETAppController implements ActionListener {

	// fields - creates a new frame for each screen
	public static LoginFrame loginFrame;
	public static HomeFrame homeFrame;
	public static HomePanel homePanel; 
	public static HelpFrame helpFrame; 
	public static GoalsFrame goalsFrame;
	public static ExerciseLogFrame elFrame;
	public static ProfileFrame profileFrame; 
	
	// Constructor
	public ETAppController() { 
		loginFrame = new LoginFrame();  // Creates a new loginFrame (first screen that shows up when user runs the application)
		loginFrame.setVisible(true);
		
		// methods
		addHomeButtonsListener(); 
		addItemListeners(); 
	}
	
	// Makes the buttons in the homeframe clickable
	@SuppressWarnings("static-access")
	private void addHomeButtonsListener() { 
		homePanel.profileButton.addActionListener(this); 
		homePanel.exerciseLogButton.addActionListener(this); 
		homePanel.goalsButton.addActionListener(this);
		
	}
	
	// Makes the menu items on each frame clickable
	@SuppressWarnings("static-access")
	private void addItemListeners() {
		
		// Homeframe menu bar
		homeFrame.helpItem.addActionListener(this);
		homeFrame.homeItem.addActionListener(this);
		homeFrame.logOutItem.addActionListener(this);
		
		// Helpframe menu bar
		helpFrame.helpItem.addActionListener(this);
		helpFrame.homeItem.addActionListener(this);
		helpFrame.logOutItem.addActionListener(this);
		
		// Goalsframe menu bar
		goalsFrame.helpItem.addActionListener(this);
		goalsFrame.homeItem.addActionListener(this);
		goalsFrame.logOutItem.addActionListener(this);
		
		// ExerciseLogframe menu bar
		elFrame.helpItem.addActionListener(this);
		elFrame.homeItem.addActionListener(this);
		elFrame.logOutItem.addActionListener(this);
		
		// Profileframe menu bar
		profileFrame.helpItem.addActionListener(this);
		profileFrame.homeItem.addActionListener(this);
		profileFrame.logOutItem.addActionListener(this);
	}
	
	// Sets the action events for each button in the Homeframe, and the menu items on the menu bar in each frame
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// FOR HOME FRAME BUTTONS
		// If user clicks the profile button
		if (e.getSource() == homePanel.profileButton) { 
			
			JOptionPane.showMessageDialog(homePanel, "Directing you to the Profile Screen");    // Displays pop-up message telling user they're being directed to profileframe
			profileFrame = new ProfileFrame();               // Creates and opens a new profileframe
			profileFrame.setVisible(true); 
			homeFrame.setVisible(false);                     // Closes homeframe
		
		// If user clicks the exercise log button
		} else if (e.getSource() == homePanel.exerciseLogButton) { 
			
			JOptionPane.showMessageDialog(homePanel, "Directing you to the Exercise Log Screen");  // Displays pop-up message telling user they're being directed to exerciseLogFrame
			elFrame = new ExerciseLogFrame();        // Creates and opens a new exerciseLogFrame
			elFrame.setVisible(true);
			homeFrame.setVisible(false);             // Closes homeframe
		 
		// If user clicks the goals button
		} else if (e.getSource() == homePanel.goalsButton) { 
			
			JOptionPane.showMessageDialog(homePanel, "Directing you to the Goals Screen");  // Displays pop-up message telling user they're being directed to goalsFrame
			goalsFrame = new GoalsFrame();           // Creates and opens a new goalsframe
			goalsFrame.setVisible(true);
			homeFrame.setVisible(false);             // Closes homeframe
			
		// FOR MENU BAR ITEMS
		// For the homeframe menubar 
		// If user clicks help menu item
		} else if (e.getSource() == homeFrame.helpItem) { 
			
			helpFrame = new HelpFrame();  // Creates and opens a new helpframe
			helpFrame.setVisible(true);
			homeFrame.dispose();         // Closes homeframe
			
		// If user clicks home menu item
		} else if (e.getSource() == homeFrame.homeItem) { 
			
			homeFrame = new HomeFrame();   // Creates and opens a new homeframe
			homeFrame.setVisible(true);
		
		// If user clicks log out menu item
		} else if (e.getSource() == homeFrame.logOutItem) { 
			
			loginFrame = new LoginFrame();  // Creates and opens a new loginFrame
			loginFrame.setVisible(true);
			homeFrame.dispose();         // Closes homeframe
			
		// For the helpframe menubar
		// If user clicks help menu item
		 } else if (e.getSource() == helpFrame.helpItem) { 
			
			helpFrame = new HelpFrame();   // Creates and opens a new helpframe
			helpFrame.setVisible(true);
			
		// If user clicks home menu item
		} else if (e.getSource() == helpFrame.homeItem) { 
			
			homeFrame = new HomeFrame();  // Creates and opens a new homeframe
			homeFrame.setVisible(true);
			helpFrame.dispose();     // Closes helpframe
			
		// If user clicks log out menu item
		} else if (e.getSource() == helpFrame.logOutItem) { 
			
			loginFrame = new LoginFrame();  // Creates and opens a new loginframe
			loginFrame.setVisible(true);
			helpFrame.dispose();    // Closes helpframe
		
		// For the goalsFrame menubar
		// If user clicks help menu item
		} else if (e.getSource() == goalsFrame.helpItem) { 
			
			helpFrame = new HelpFrame();    // Creates and opens a new helpframe
			helpFrame.setVisible(true);
			goalsFrame.setVisible(false);   // Closes goalsframe
			
		// If user clicks home menu item
		} else if (e.getSource() == goalsFrame.homeItem) { 
			
			homeFrame = new HomeFrame();   // Creates and opens a new homeframe
			homeFrame.setVisible(true);
			goalsFrame.setVisible(false);  // Closes goalsframe
			
		// If user clicks log out menu item
		} else if (e.getSource() == goalsFrame.logOutItem) { 
			
			loginFrame = new LoginFrame();  // Creates and opens a new loginframe
			loginFrame.setVisible(true);
			goalsFrame.setVisible(false);   // Closes goalsframe
		
		// For the exerciseLogframe menubar
		// If user clicks help menu item
		} else if (e.getSource() == elFrame.helpItem) { 
			
			helpFrame = new HelpFrame();   // Creates and opens a new helpframe
			helpFrame.setVisible(true);
			elFrame.setVisible(false);    // Closes exerciseLogframe
			
		// If user clicks home menu item
		} else if (e.getSource() == elFrame.homeItem) { 
			
			homeFrame = new HomeFrame();  // Creates and opens a new homeframe
			homeFrame.setVisible(true);
			JOptionPane.showMessageDialog(homePanel, "Go to Goals Screen next");    // Tells user which screen to go to next
			elFrame.setVisible(false);    // Closes exerciseLogframe
			
		// If user clicks log out menu item
		} else if (e.getSource() == elFrame.logOutItem) { 
			
			loginFrame = new LoginFrame();   // Creates and opens a new loginframe
			loginFrame.setVisible(true); 
			elFrame.setVisible(false);     // Closes exerciseLogframe
		
		// For the profileframe menubar
		// If user clicks help menu item
		} else if (e.getSource() == profileFrame.helpItem) { 
			
			helpFrame = new HelpFrame();    // Creates and opens a new helpframe
			helpFrame.setVisible(true);
			profileFrame.setVisible(false);   // Closes profileframe
			
		// If user clicks home menu item
		} else if (e.getSource() == profileFrame.homeItem) { 
			homeFrame = new HomeFrame();   // Creates and opens a new homeframe
			homeFrame.setVisible(true);
			// Tells user which screen to go to next
			JOptionPane.showMessageDialog(homePanel, "Go to Exercise Log Screen next, and save information before going to Goals screen (or else Goals screen won't show up)");    
			profileFrame.setVisible(false);  // Closes profileframe
			
		// If user clicks log out menu item
		} else if (e.getSource() == profileFrame.logOutItem) { 
			
			loginFrame = new LoginFrame();     // Creates and opens a new loginframe
			loginFrame.setVisible(true);
			profileFrame.setVisible(false);   // Closes profileframe
		}
	
	}
}
