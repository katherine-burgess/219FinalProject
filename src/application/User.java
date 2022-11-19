package application;

public class User {
	
	// Instance variables
	private String name;
	private double weight;
	private double height;
	
	
	// constructor that will take the user's name and set the instance variable
	User(String nameUser){
		try {
			name = nameUser;
		} catch (NullPointerException npe) {
		}
	}
	
	User(String name, double weight, double height){
		this.name = name;
		this.weight = weight;
		this.height = height;
		
	}
	
	public String setName(String nameAsString) {
		String errorMessage = " ";
		boolean validName = true;
		
		for (char n : nameAsString.toCharArray()) {
			if (!Character.isAlphabetic(n)) {
				validName = false;
				errorMessage = String.format("Your username must use only letters", n);
			}
		}
				
		return errorMessage;
		
	}
	// This method will call the WorkoutComponent() to get the stats from the user
	
	// This method will call the GoalComponent() to get the goals 
}