package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

// This class is the JPanel to profileframe
public class ProfilePanel extends JPanel {

	// Labels/Messages on the panel
	private static JLabel title = new JLabel("PROFILE");
	private static JLabel homeIntro = new JLabel("Create a new profile, or edit your information. Click SAVE when finished.");
	private static JLabel name = new JLabel("Name: ");
	private static JLabel gender = new JLabel("Gender: ");
	private static JLabel username = new JLabel("Create/Change Username: ");
	private static JLabel password = new JLabel("Create/Change Password: ");
	
	// Textboxes on the panel
	public static JTextField name_textField = new JTextField();
	public static JTextField gender_textField = new JTextField();
	public static JTextField createUsername_textField = new JTextField();
	public static JPasswordField createPasswordField = new JPasswordField();
	
	// Buttons on the panel
	public static JButton saveButton = new JButton("Save"); 
	
	// Constructor
	public ProfilePanel() {
		
		// Sets the properties of the panel
		setBackground(new Color(220, 20, 60));
		setBounds(100, 100, 1650, 920);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true); 
		setLayout(null);
		
		// method
		labelElements(); 
		textElements(); 
		buttonElements(); 
		addLabels();
		addTexts();
		addButtons(); 
	}
	
	// Sets up the properties (layout) of the labels
	private void labelElements() {
		
		title.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 32));
		title.setBounds(771, 21, 143, 32); 
		
		homeIntro.setFont(new Font("Cambria", Font.PLAIN, 24));
		homeIntro.setBounds(445, 64, 759, 32); 
		
		name.setFont(new Font("Cambria", Font.PLAIN, 18));
		name.setBounds(391, 176, 64, 32);
		
		gender.setFont(new Font("Cambria", Font.PLAIN, 18));
		gender.setBounds(391, 269, 77, 32);
		
		username.setFont(new Font("Cambria", Font.PLAIN, 18));
		username.setBounds(391, 375, 219, 32);
		
		password.setFont(new Font("Cambria", Font.PLAIN, 18));
		password.setBounds(391, 487, 205, 32);
		
	}
	
	// Sets up the properties (layout) of the text boxes
	private void textElements() {
		
		name_textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		name_textField.setBounds(488, 178, 422, 32);
		name_textField.setColumns(10);

		gender_textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		gender_textField.setBounds(492, 271, 422, 32);
		gender_textField.setColumns(10);

		createUsername_textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		createUsername_textField.setBounds(652, 375, 422, 32);
		createUsername_textField.setColumns(10);
		
		createPasswordField.setFont(new Font("Cambria", Font.PLAIN, 14));
		createPasswordField.setBounds(652, 489, 422, 32);
		
	}
	
	// Sets up the properties (layout) of the buttons
	private void buttonElements() {
		
		saveButton.setFont(new Font("Cambria", Font.BOLD, 16));
		saveButton.setBounds(748, 605, 154, 39);
		
	}
	
	// adds labels to panel
	private void addLabels() {
		add(title);
		add(homeIntro); 
		add(name); 
		add(gender);
		add(username);
		add(password);
		
	}

	// adds textboxes to panel
	private void addTexts() {
		add(name_textField); 
		add(gender_textField);
		add(createUsername_textField); 
		add(createPasswordField); 
		
	}
	
	// adds buttons to panel
	private void addButtons() {
		add(saveButton); 
		
	}
	
}
