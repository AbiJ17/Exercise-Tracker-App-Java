package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.User;

// This class is the JPanel to the homeframe
public class HomePanel extends JPanel {
	
	// Labels on the panel
	private static JLabel title = new JLabel("HOME PAGE");
	private static JLabel homeIntro = new JLabel("Welcome!");
	
	// Buttons on the panel
	public static JButton profileButton = new JButton("PROFILE"); 
	public static JButton exerciseLogButton = new JButton("EXERCISE LOG"); 
	public static JButton goalsButton = new JButton("GOALS"); 
	
	// Constructor
	public HomePanel() {
		
		// Sets the properties of the panel
		setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 1650, 920);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true); 
		setLayout(null);
		
		// Methods
		labelElements(); 
		buttonElements(); 
		addLabels(); 
		addButtons(); 
		addImage(); 
	}
	
	// Sets the properties (layout) of the labels
	private void labelElements() { 
		title.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 36));
		title.setBounds(721, 46, 207, 59); 
		
		homeIntro.setFont(new Font("Cambria", Font.PLAIN, 26));
		homeIntro.setBounds(763, 116, 124, 32); 
	}
	
	// Sets the properties (layout) of the buttons
	private void buttonElements() { 
		
		profileButton.setFont(new Font("Cambria", Font.BOLD, 20));
		profileButton.setBounds(671, 227, 308, 88);
		profileButton.setBackground(new Color(220, 20, 60));
		
		exerciseLogButton.setFont(new Font("Cambria", Font.BOLD, 20));
		exerciseLogButton.setBounds(671, 417, 308, 88);
		exerciseLogButton.setBackground(new Color(255, 215, 0));
		
		goalsButton.setFont(new Font("Cambria", Font.BOLD, 20));
		goalsButton.setBounds(671, 600, 308, 88);
		goalsButton.setBackground(new Color(147, 112, 219));
		
	}
	
	// Adds the labels to the panel
	private void addLabels() { 
		add(homeIntro);
		add(title); 
	}
	
	// Adds the buttons to the panel
	private void addButtons() { 
		add(profileButton); 
		add(exerciseLogButton); 
		add(goalsButton); 
		
	}
	
	// Adds image to the panel
	private void addImage() { 
		
		JLabel logo = new JLabel(""); 
		Image image = new ImageIcon(this.getClass().getResource("/Menu logo.png")).getImage(); 
		logo.setIcon(new ImageIcon(image));
		logo.setBounds(100, 5, 425, 270); 
		add(logo); 
		
		
	}

}
