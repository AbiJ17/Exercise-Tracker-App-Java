package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Activity;
import model.User;

// This class is the JPanel to goalsFrame
public class GoalsPanel extends JPanel {
	
	// Labels/Messages on the panel
	private static JLabel title = new JLabel("GOALS");
	private static JLabel goalsIntro = new JLabel("Enter or edit your daily & weekly fitness goals.");
	private static JLabel mainGoals = new JLabel("Main Goals: ");
	private static JLabel weeklyMins1 = new JLabel("I want to do at least ");
	private static JLabel weeklyMins2 = new JLabel(" minutes of activity daily");
	private static JLabel weeklyCals1 = new JLabel("I want to burn at least");
	private static JLabel weeklyCals2 = new JLabel(" calories daily");
	private static JLabel progress = new JLabel("Progress:");
	private static JLabel weight = new JLabel("Weight(kg):");
	private static JLabel height = new JLabel("Height(m):");
	private static JLabel calsReport = new JLabel ("Calories Burned Today: "); 
	private static JLabel minsReport = new JLabel ("Amount of Activity Done Today: "); 
	
	// Textboxes on the panel
	public static JTextField dailyMins_textField = new JTextField();
	public static JTextField dailyCals_textField = new JTextField();
	public static JTextField weight_textField = new JTextField();
	public static JTextField height_textField = new JTextField();
	
	// Buttons on the panel
	public static JButton saveButton = new JButton("Save"); 

	// Constructor
	public GoalsPanel() {
		
		// Sets the properties of the panel
		setBackground(new Color(147, 112, 219));
		setBounds(100, 100, 1650, 920);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true); 
		setLayout(null);
		
		// methods
		labelElements(); 
		textElements(); 
		buttonElements(); 
		addLabels();
		addTexts(); 
		addButtons(); 
		calsReport(); 
		minsReport(); 

	}

	// Sets the properties (layout) of each label in the panel
	private void labelElements() {
		title.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 32));
		title.setBounds(771, 21, 108, 32); 
		
		goalsIntro.setFont(new Font("Cambria", Font.PLAIN, 24));
		goalsIntro.setBounds(575, 73, 499, 32); 
		
		mainGoals.setFont(new Font("Cambria", Font.BOLD, 24));
		mainGoals.setBounds(350, 123, 136, 32); 
		
		weeklyMins1.setFont(new Font("Cambria", Font.PLAIN, 18));
		weeklyMins1.setBounds(437, 191, 172, 32);
		
		weeklyMins2.setFont(new Font("Cambria", Font.PLAIN, 18));
		weeklyMins2.setBounds(1016, 191, 214, 32);
		
		weeklyCals1.setFont(new Font("Cambria", Font.PLAIN, 18));
		weeklyCals1.setBounds(431, 289, 178, 32);
		
		weeklyCals2.setFont(new Font("Cambria", Font.PLAIN, 18));
		weeklyCals2.setBounds(1016, 289, 136, 32);
		
		progress.setFont(new Font("Cambria", Font.BOLD, 24));
		progress.setBounds(111, 518, 145, 32);
		
		weight.setFont(new Font("Cambria", Font.ITALIC, 18));
		weight.setBounds(512, 377, 97, 32); 
		
		height.setFont(new Font("Cambria", Font.ITALIC, 18));
		height.setBounds(881, 377, 97, 32);
		
		calsReport.setFont(new Font("Cambria", Font.ITALIC, 24));
		calsReport.setBounds(183, 573, 246, 32); 
		
		minsReport.setFont(new Font("Cambria", Font.ITALIC, 24));
		minsReport.setBounds(1229, 573, 320, 32); 
		
	}
	
	// Sets the properties (layout) of each text box in the panel
	private void textElements() {
		
		dailyMins_textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		dailyMins_textField.setBounds(619, 193, 387, 32);
		dailyMins_textField.setColumns(10);

		dailyCals_textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		dailyCals_textField.setBounds(619, 291, 387, 32);
		dailyCals_textField.setColumns(10);
		
		weight_textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		weight_textField.setBounds(629, 379, 126, 32);
		weight_textField.setColumns(10);

		height_textField.setFont(new Font("Cambria", Font.PLAIN, 14));
		height_textField.setBounds(988, 379, 126, 32);
		height_textField.setColumns(10);
	}
	
	// Sets the properties (layout) of each button in the panel
	private void buttonElements() {
		
		saveButton.setFont(new Font("Cambria", Font.BOLD, 16));
		saveButton.setBounds(748, 458, 154, 39);
		
	}
	
	// Adds Labels to Panel
	private void addLabels() { 
		
		add(title); 
		add(goalsIntro); 
		add(mainGoals); 
		add(weeklyMins1); 
		add(weeklyMins2); 
		add(weeklyCals1); 
		add(weeklyCals2); 
		add(progress);
		add(weight);
		add(height);
		add(calsReport); 
		add(minsReport); 
	}
	
	// Adds text boxes to Panel
	private void addTexts() { 
		add(dailyMins_textField);
		add(dailyCals_textField);
		add(weight_textField); 
		add(height_textField); 
		
	}
	
	// Adds Buttons to Panel
	private void addButtons() {
		add(saveButton); 
		
	}
	
	// Displays the amount of calories the user burned daily (from the last entry on the exercise log screen)
	private void calsReport() { 
		
		JLabel calsBurned = new JLabel(" " + ExerciseLogFrame.currentActivity.getCalsBurned() + " Calories"); 
		calsBurned.setFont(new Font("Cambria", Font.ITALIC, 18));
		calsBurned.setBounds(214, 641, 154, 32); 
		add(calsBurned); 
	}
	
	// Displays the amount of minutes of activity done by the user daily (from the last entry on the exercise log screen)
	private void minsReport() { 
		
		JLabel minsDone = new JLabel(" " + ExerciseLogFrame.currentActivity.getDuration() + " Minutes"); 
		minsDone.setFont(new Font("Cambria", Font.ITALIC, 18));
		minsDone.setBounds(1294, 641, 166, 32); 
		add(minsDone); 
	}

}
