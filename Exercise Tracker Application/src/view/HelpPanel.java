package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

// This class is the JPanel to the helpframe
public class HelpPanel extends JPanel {
	
	// Labels/messages on the panel
	private static JLabel helpIntro = new JLabel("Help Page");
	private static JLabel homeFrame = new JLabel("The Main Menu of the Application."); 
	private static JLabel homeFrame2 = new JLabel("You can access your profile, exercise log, and fitness goals.");
	private static JLabel profileFrame = new JLabel("This is where you create a new account, or edit info in your profile.");
	private static JLabel profileFrame2 = new JLabel("This is necessary in order to login to the application.");
	private static JLabel exerciseLogFrame = new JLabel("You can enter or make changes to info from your fitness sessions.");
	private static JLabel goalsFrame = new JLabel("You can enter or make changes to your fitness goals.");
	
	// Buttons on the panel (not functionable --> will act as the sub-headings) 
	private static JButton home = new JButton("HOME"); 
	private static JButton profile = new JButton("PROFILE"); 
	private static JButton exerciseLog = new JButton("EXERCISE LOG"); 
	private static JButton goals = new JButton("GOALS"); 
	
	// Constructor
	public HelpPanel() {
		
		// Sets the properties of the panel
		setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 1650, 920);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true); 
		setLayout(null);
		
		// methods
		labelElements(); 
		buttonElements(); 
		addLabels(); 
		addButtons();
	}
	
	// Sets the properties of the labels on the panel
	private void labelElements() { 
		
		helpIntro.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 32));
		helpIntro.setBounds(740, 50, 169, 42); 
		
		homeFrame.setFont(new Font("Cambria", Font.PLAIN, 18));
		homeFrame.setBounds(222, 380, 292, 32); 
		
		homeFrame2.setFont(new Font("Cambria", Font.PLAIN, 18));
		homeFrame2.setBounds(111, 423, 490, 32); 
		
		profileFrame.setFont(new Font("Cambria", Font.PLAIN, 18));
		profileFrame.setBounds(1034, 380, 560, 32); 
		
		profileFrame2.setFont(new Font("Cambria", Font.PLAIN, 18));
		profileFrame2.setBounds(1077, 423, 426, 32); 
		
		exerciseLogFrame.setFont(new Font("Cambria", Font.PLAIN, 18));
		exerciseLogFrame.setBounds(111, 793, 540, 32); 
		
		goalsFrame.setFont(new Font("Cambria", Font.PLAIN, 18));
		goalsFrame.setBounds(1077, 793, 433, 32); 
	}
	
	// Sets the properties of the buttons on the panel
	private void buttonElements() { 
		
		home.setFont(new Font("Cambria", Font.BOLD, 20));
		home.setBounds(204, 227, 308, 88);
		home.setBackground(new Color(154, 205, 50));
		
		profile.setFont(new Font("Cambria", Font.BOLD, 20));
		profile.setBounds(1140, 227, 308, 88);
		profile.setBackground(new Color(220, 20, 60));
		
		exerciseLog.setFont(new Font("Cambria", Font.BOLD, 20));
		exerciseLog.setBounds(206, 600, 308, 88);
		exerciseLog.setBackground(new Color(255, 215, 0));
		
		goals.setFont(new Font("Cambria", Font.BOLD, 20));
		goals.setBounds(1140, 600, 308, 88);
		goals.setBackground(new Color(147, 112, 219));
	}
	
	// Adds the labels to the panel
	private void addLabels() { 
		add(helpIntro); 
		add(homeFrame); 
		add(homeFrame2); 
		add(profileFrame); 
		add(profileFrame2); 
		add(exerciseLogFrame); 
		add(goalsFrame); 
		
	}
	
	// Adds the buttons to the panel
	private void addButtons() { 
		add(home); 
		add(profile); 
		add(exerciseLog); 
		add(goals); 
	}

}
