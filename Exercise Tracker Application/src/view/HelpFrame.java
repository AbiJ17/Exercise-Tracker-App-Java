package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;

// Help screen - A page that tells the user about what each main frame/screen does
public class HelpFrame extends JFrame {
	
	// Creates a menubar for the help screen 
	public JMenuBar menu = new JMenuBar(); 
	
	// The 3 buttons/menu items that the menu bar is going to contain 
	public static JMenuItem homeItem = new JMenuItem("HOME"); 
	public static JMenuItem helpItem = new JMenuItem("HELP"); 
	public static JMenuItem logOutItem = new JMenuItem("LOG OUT"); 
	
	// Creates a new JPanel for the frame
	private HelpPanel helpPanel = new HelpPanel(); 
	
	// Constructor 
	public HelpFrame() {
		
		// Sets the properties of the frame
		setTitle("ET App - Help Screen"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650, 920);
		setJMenuBar(menu); 
		add(helpPanel);  
		
		// methods
		menuBarElements(); 
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
}
