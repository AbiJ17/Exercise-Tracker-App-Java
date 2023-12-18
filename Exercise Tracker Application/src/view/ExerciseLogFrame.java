package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.FileImportController;
import model.Activity;
import model.User;

// Exercise Log Screen - The user can input and save information from their daily workout sessions in this frame. 
public class ExerciseLogFrame extends JFrame implements ActionListener {
	
	// Creates a menubar for the home screen 
	public JMenuBar menu = new JMenuBar(); 
				
	// The 3 buttons/menu items that the menu bar is going to contain 
	public static JMenuItem homeItem = new JMenuItem("HOME"); 
	public static JMenuItem helpItem = new JMenuItem("HELP"); 
	public static JMenuItem logOutItem = new JMenuItem("LOG OUT");
	
	// Creates a new JPanel for the frame
	private ExerciseLogPanel elPanel = new ExerciseLogPanel();
	
	// Stores the user's activties
	public static ArrayList <Activity> activities = new ArrayList(); 
	public static Activity currentActivity; 

	// Constructor
	public ExerciseLogFrame() {
		
		// Sets the properties of the frame
		setTitle("ET App - Exercise Log Screen Screen"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650, 920);
		setJMenuBar(menu);
		add(elPanel); 
		
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
	@SuppressWarnings("static-access")
	private void addButtonListener() {
		elPanel.saveButton.addActionListener(this);
		elPanel.resetButton.addActionListener(this);
	}
	
	// Stores the user's activties (entries for exercise log)
	public static Activity getActivity() { 
		return currentActivity; 
	}

	// Sets the action events for each button
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// If user clicks the save button
		if (e.getSource() == elPanel.saveButton) { 
			
			// flag - determines if the user's exercise sessions were saved
			boolean saved = false; 
			
			// Loops through the JTextField arrays
			for (int i = 0; i < elPanel.hrField.length; i++) { 
				
				// Stores the user's inputed textfields as string fields (so that it can be stored as a Activity Object)
				String date = elPanel.dateField[i].getText(); 
				String activity = elPanel.activityField[i].getText(); 
				String duration = elPanel.durationField[i].getText(); 
				String calsBurned = elPanel.cbField[i].getText(); 
				String heartRate = elPanel.hrField[i].getText();  
			
				// If the text fields are blank, then a pop-up message lets user know that they need to fill in all the fields
				if (date.isEmpty() || activity.isEmpty() || duration.isEmpty() || calsBurned.isEmpty() || heartRate.isEmpty()) { 
					JOptionPane.showMessageDialog(elPanel, "Please fill in all the fields.");  
					break;
					
				// If all the text fields are full 
				} else { 
					
					// User's activity info is written into a text file
					String session = date + ", " + activity + ", " + duration + ", " + calsBurned + ", " + heartRate + "\n"; 
				
					try { 
						Files.write(Paths.get("Files/Activity"), session.getBytes(), StandardOpenOption.APPEND); 
						FileImportController.activities.add(new Activity(date, activity, duration, calsBurned, heartRate)); 
					} catch (IOException error) { 
						System.out.println("error"); 
					}
				
					// Stores the activity's info in a new Activity Object (DEBUGGING)
					currentActivity = new Activity(date, activity, duration, calsBurned, heartRate); 
					System.out.println(currentActivity); 	 
					saved = true;                  // set flag to true, since user's info was saved
				}
			}
			
			// If user's info was saved, then display a pop-up message letting them know
			if (saved == true) { 
				JOptionPane.showMessageDialog(elPanel, "Your Changes have been Saved!");  // Lets user know their info is saved via pop-up message
			}
			
		// If user clicks the reset button
		} else if (e.getSource() == elPanel.resetButton) { 
			
			// Pop-up message telling the user that the input in the text boxes have cleared
			JOptionPane.showMessageDialog(elPanel, "All Text fields have been cleared."); 
			
			// Clears all the textfields (makes them blank) 
			// date text fields
			for (int i = 0; i < elPanel.dateField.length; i++) {
				elPanel.dateField[i].setText("");
			}
			
			// activity text fields
			for (int i = 0; i < elPanel.activityField.length; i++) {
				elPanel.activityField[i].setText("");
			}
			
			// calories burned text fields
			for (int i = 0; i < elPanel.cbField.length; i++) {
				elPanel.cbField[i].setText("");
			}
			
			// duration text fields
			for (int i = 0; i < elPanel.durationField.length; i++) {
				elPanel.durationField[i].setText("");
			}
			
			// heart rate text fields
			for (int i = 0; i < elPanel.hrField.length; i++) {
				elPanel.hrField[i].setText("");
			}	

		}
		
	}

}
