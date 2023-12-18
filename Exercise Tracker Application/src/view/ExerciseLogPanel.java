package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;

// This class is the JPanel to exerciseLogFrame
public class ExerciseLogPanel extends JPanel {
	
	// Labels on the panel
	private static JLabel title = new JLabel("EXERCISE LOG");
	private static JLabel elIntro = new JLabel("Enter or edit details from your daily fitness sessions.");
	private static JLabel date = new JLabel("Date");
	private static JLabel activity = new JLabel("Activity");
	private static JLabel caloriesBurned = new JLabel("Calories Burned");
	private static JLabel duration = new JLabel("Duration(mins)");
	private static JLabel hr = new JLabel("Heart Rate"); 
	
	// Textboxes on the panel
	public static JTextField[] dateField = new JTextField[7];
	public static JTextField[] activityField = new JTextField[7];
	public static JTextField[] cbField = new JTextField[7];
	public static JTextField[] durationField = new JTextField[7];
	public static JTextField[] hrField = new JTextField[7];
	
	// Buttons on the panel
	public static JButton saveButton = new JButton("Save"); 
	public static JButton resetButton = new JButton("Reset"); 

	// Constructor
	public ExerciseLogPanel() {
		
		// Sets the properties of the panel
		setBackground(new Color(255, 215, 0));
		setBounds(100, 100, 1650, 920);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true); 
		setLayout(null);
		
		// methods
		labelElements();  
		buttonElements(); 
		addLabels();
		addButtons(); 
		addTexts(); 

	}
	
	// Sets the properties (layout) of the labels
	private void labelElements() { 
		title.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 32));
		title.setBounds(720, 21, 209, 32); 
		
		elIntro.setFont(new Font("Cambria", Font.PLAIN, 24));
		elIntro.setBounds(557, 73, 535, 32); 
		
		date.setFont(new Font("Cambria", Font.BOLD, 18));
		date.setBounds(178, 137, 51, 32); 
		
		activity.setFont(new Font("Cambria", Font.BOLD, 18));
		activity.setBounds(427, 137, 71, 32);
		
		caloriesBurned.setFont(new Font("Cambria", Font.BOLD, 18));
		caloriesBurned.setBounds(1142, 137, 136, 32);
		
		duration.setFont(new Font("Cambria", Font.BOLD, 18));
		duration.setBounds(751, 137, 136, 32);
		
		hr.setFont(new Font("Cambria", Font.BOLD, 18));
		hr.setBounds(1466, 137, 98, 32);
	}
	
	// Sets the properties (layout) of the buttons
	private void buttonElements() { 
		saveButton.setFont(new Font("Cambria", Font.BOLD, 16));
		saveButton.setBounds(1053, 837, 154, 39);
		
		resetButton.setFont(new Font("Cambria", Font.BOLD, 16));
		resetButton.setBounds(399, 837, 154, 39);
	}
	
	// Adds the labels to the panel
	private void addLabels() { 
		add(title); 
		add(elIntro); 
		add(date); 
		add(activity);
		add(caloriesBurned);
		add(duration); 
		add(hr); 
		
	}
	
	// Adds the buttons to the panel
	private void addButtons() { 
		add(saveButton); 
		add(resetButton); 
	}
	
	// Adds and sets the properties of the textbox arrays to the panel
	// The JTextFields loops through 7 times, since there are 7 fields in each column
	private void addTexts() { 
	
		// for the date text fields
		for (int i = 0; i < 7; i++) {
			
			dateField[i] = new JTextField(""); 
			dateField[i].setBounds(125, 200 + i * 70, 150, 80);
			add(dateField[i]); 
		}
		
		// for the activity text fields
		for (int i = 0; i < 7; i++) {
			
			activityField[i] = new JTextField(""); 
			activityField[i].setBounds(390, 200 + i * 70, 150, 80);
			add(activityField[i]); 
		}
		
		// for the duration text fields
		for (int i = 0; i < 7; i++) {
			
			durationField[i] = new JTextField(""); 
			durationField[i].setBounds(740, 200 + i * 70, 150, 80);
			add(durationField[i]); 
		}
		
		// for the calories burned text fields
		for (int i = 0; i < 7; i++) {
			
			cbField[i] = new JTextField(""); 
			cbField[i].setBounds(1135, 200 + i * 70, 150, 80);
			add(cbField[i]); 
		}
		
		// for the heart rate text fields
		for (int i = 0; i < 7; i++) {
			
			hrField[i] = new JTextField(""); 
			hrField[i].setBounds(1440, 200 + i * 70, 150, 80);
			add(hrField[i]); 
		}
		
	}
	
	// getters and setters for the text boxes 
	public static JTextField[] getDateField() {
        return dateField;
    }

    public static JTextField[] getActivityField() {
        return activityField;
    }
    
    public static JTextField[] getDurationField() {
        return durationField;
    }

    public static JTextField[] getCbField() {
        return cbField;
    }
    
    public static JTextField[] getHrField() {
        return hrField;
    }
	
}
