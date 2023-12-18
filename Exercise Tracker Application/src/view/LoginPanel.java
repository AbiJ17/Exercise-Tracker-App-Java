package view;

import java.awt.*; 
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

//import controller.MenuBarController;
import model.User; 

// This class is the JPanel to LoginFrame
public class LoginPanel extends JPanel { 

	// labels on the panel
	private static JLabel titleLabel = new JLabel("Exercise Tracker Application");
	private static JLabel WelcomeLabel = new JLabel("Welcome! Please Login to Continue."); 
	private static JLabel UsernameLabel = new JLabel("Username:");
	private static JLabel PasswordLabel = new JLabel("Password: "); 
	private static JLabel newAccountLabel = new JLabel("Don't have an account yet?  Create one now!");
	
	// Buttons on the panel
	public static JButton LoginButton = new JButton("Login"); 
	public static JButton createNewAccountButton = new JButton("Create New Account");
	
	// Textboxes (the sections/boxes for user inputs) on the panel
	public static JTextField Username_textField = new JTextField();
	public static JPasswordField passwordField = new JPasswordField();

	// Constructor 
	public LoginPanel() {
		
		// Sets up the layout of the frame
		setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 1650, 920);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true); 
		setLayout(null);
		
		// methods
		loginLabels(); 
		loginFields(); 
		loginButton(); 
		newAccountButton(); 
		addComponents(); 
		addImages(); 

	}
	
		// Contains all the headers/messages in the Login Screen
		private void loginLabels() {
			
			// Title Label on top
			titleLabel.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 24));
			titleLabel.setBounds(669, 50, 312, 32); 
			
			//The Welcome Label below title
			WelcomeLabel.setFont(new Font("Cambria", Font.PLAIN, 24));
			WelcomeLabel.setBounds(630, 131, 390, 32);
			
			// Label that tells the user to enter their username
			UsernameLabel.setFont(new Font("Cambria", Font.PLAIN, 18));
			UsernameLabel.setBounds(563, 310, 118, 32);
			
			// Label that tells the user to enter their password
			PasswordLabel.setFont(new Font("Cambria", Font.PLAIN, 18));
			PasswordLabel.setBounds(563, 389, 118, 32);
			
			// Label that tells the user to create a new account (if they don't have one)
			newAccountLabel.setFont(new Font("Cambria", Font.BOLD, 24));
			newAccountLabel.setBounds(579, 618, 492, 32);
		}

		// Contains the textboxes for the login details (where user enters username & password)
		private void loginFields() {
			
			// Username textbox 
			Username_textField.setFont(new Font("Cambria", Font.PLAIN, 14));
			Username_textField.setBounds(665, 312, 422, 32);
			Username_textField.setColumns(10);
			
			// Password textbox
			passwordField.setFont(new Font("Cambria", Font.PLAIN, 14));
			passwordField.setBounds(665, 391, 422, 32);
		}
		
		// Contains the button that user clicks to login (once they have entered their username and password
		private void loginButton() {

			LoginButton.setFont(new Font("Cambria", Font.BOLD, 16));
			LoginButton.setBounds(748, 471, 154, 39);
		}
		
		// Contains button that user clicks to create new Profile 
		// (takes them to ProfileFrame to create a new account)
		private void newAccountButton() {
			
			createNewAccountButton.setFont(new Font("Cambria", Font.BOLD, 16));
			createNewAccountButton.setBounds(730, 682, 190, 39);

		}
		
		// Adds the headers, buttons and textboxes onto the Login Screen
		private void addComponents() {
			
			// Adds the headers to the Login Screen
			add(titleLabel); 
			add(WelcomeLabel); 
			add(UsernameLabel);
			add(PasswordLabel);
			add(newAccountLabel);
			
			// Adds the textboxes to the Login Screen
			add(Username_textField);
			add(passwordField); 
			
			// Adds the buttons to the Login Screen
			add(LoginButton);
			add(createNewAccountButton);
		}
		
		// Adds images onto the login screen
		// Source: ProgrammingKnowledge - Youtube: https://www.youtube.com/watch?v=tFwp589MAFk&ab_channel=ProgrammingKnowledge
		private void addImages() { 
			
			JLabel img1 = new JLabel(""); 
			Image image1 = new ImageIcon(this.getClass().getResource("/login1.png")).getImage(); 
			img1.setIcon(new ImageIcon(image1));
			img1.setBounds(114, 30, 306, 232); 
			add(img1); 
			
			JLabel img2 = new JLabel(""); 
			Image image2 = new ImageIcon(this.getClass().getResource("/login2.png")).getImage(); 
			img2.setIcon(new ImageIcon(image2));
			img2.setBounds(114, 541, 235, 225); 
			add(img2); 
			
			JLabel img3 = new JLabel(""); 
			Image image3 = new ImageIcon(this.getClass().getResource("/login3.png")).getImage(); 
			img3.setIcon(new ImageIcon(image3));
			img3.setBounds(1369, 50, 190, 177); 
			add(img3); 
			
			JLabel img4 = new JLabel(""); 
			Image image4 = new ImageIcon(this.getClass().getResource("/login4.png")).getImage(); 
			img4.setIcon(new ImageIcon(image4));
			img4.setBounds(1271, 576, 288, 177); 
			add(img4);
		}
}


