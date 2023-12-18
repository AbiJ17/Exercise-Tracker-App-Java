package model;

// User class - Creates user objects that contains the user's login information (username and password), 
// name, gender, age, height and weight (for the user's profile)
public class User {
	
	// fields
	
	// Contains user's name and gender (profileframe)
	public String name; 
	private String gender; 
	
	// Contains login information (login and profile frames)
	public static String username; 
	public static String password; 
	
	// Constructor
	public User (String name, String gender, String username, String password) {
		super(); 
		this.name = name;
		this.gender = gender;
		this.username = username;
		this.password = password; 
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
