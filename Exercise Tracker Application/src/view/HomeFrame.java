package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

// Home Screen - The main menu, User can access the profile, exercise log or goals screen
public class HomeFrame extends JFrame {
	
	// Creates a menubar for the home screen 
	public JMenuBar menu = new JMenuBar(); 
	
	// The 3 buttons/menu items that the menu bar is going to contain 
	public static JMenuItem homeItem = new JMenuItem("HOME"); 
	public static JMenuItem helpItem = new JMenuItem("HELP"); 
	public static JMenuItem logOutItem = new JMenuItem("LOG OUT"); 
	
	// Creates a new JPanel for the frame
	private HomePanel homePanel = new HomePanel(); 
		
	// Constructor	
	public HomeFrame() {
		
		// Sets the properties of the frame
		setTitle("ET App - Home Screen"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650, 920);
		setJMenuBar(menu);
		add(homePanel); 
		
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
