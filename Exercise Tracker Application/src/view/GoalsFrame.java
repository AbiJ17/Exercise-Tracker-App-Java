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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.FileImportController;
import model.Goal;
import model.User;

// Goals Screen - User can input and save their daily fitness goals, as well as look at their progress for their goals
public class GoalsFrame extends JFrame implements ActionListener {
	
	// Creates a menubar for the home screen 
	public JMenuBar menu = new JMenuBar(); 
			
	// The 3 buttons/menu items that the menu bar is going to contain 
	public static JMenuItem homeItem = new JMenuItem("HOME"); 
	public static JMenuItem helpItem = new JMenuItem("HELP"); 
	public static JMenuItem logOutItem = new JMenuItem("LOG OUT");

	// Creates a new JPanel for the frame
	private GoalsPanel goalsPanel = new GoalsPanel();
	
	// Stores the user's goals 
	public static ArrayList <Goal> goals = new ArrayList(); 
	private static Goal currentGoal; 
	
	// Constructor
	public GoalsFrame() {
		
		// Sets the properties of the frame
		setTitle("ET App - Goals Screen"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650, 920);
		setJMenuBar(menu);
		add(goalsPanel); 
		
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
		goalsPanel.saveButton.addActionListener(this);
	}
	
	// Stores the user's goals
	public static Goal getGoal() { 
		return currentGoal; 
	}

	// Sets the action events for each button
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// If user clicks the save button
		if (e.getSource() == goalsPanel.saveButton) { 
			
			// Stores the user's inputed textfields as string fields (so that it can be stored as a Goal Object)
			String dailyMins = goalsPanel.dailyMins_textField.getText(); 
			String dailyCalsBurned = goalsPanel.dailyCals_textField.getText(); 
			String weight = goalsPanel.weight_textField.getText(); 
			String height = goalsPanel.height_textField.getText(); 
			
			// If the textfields are empty, then user is told to fill in both textfields to continue via a pop-up message
			if (dailyMins.isEmpty() || dailyCalsBurned.isEmpty()|| weight.isEmpty() || height.isEmpty()) { 
				JOptionPane.showMessageDialog(goalsPanel, "Fill in the required field(s) before proceeding");
				
			// If all textfields are filled
			} else { 
				JOptionPane.showMessageDialog(goalsPanel, "Your Changes have been Saved!"); // Lets user know their info is saved via pop-up message
				
				// Saves the user's goals in a text file
				String goal = dailyMins + ", " + dailyCalsBurned + ", " + weight + ", " + height + "\n"; 
				try { 
					Files.write(Paths.get("Files/Goals"), goal.getBytes(), StandardOpenOption.APPEND); 
				FileImportController.goals.add(new Goal(dailyMins, dailyCalsBurned, weight, height)); 
				} catch (IOException error) { 
					System.out.println("error"); 
				}
				
				// For debugging purposes (stores info in a new Goal object)
				currentGoal = new Goal(dailyMins, dailyCalsBurned, weight, height); 
				System.out.println(currentGoal); 
			}
			
		}
		
	}
}
