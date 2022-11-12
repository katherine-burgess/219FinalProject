package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WorkoutAppController {
	Stage applicationStage;
	
	@FXML
	private Label inspirationQuoteLabel;
	
    @FXML
    private ChoiceBox<String> chooseUserChoiceBox;

    
    // Take user input and add to ChoiceBox
    void addNewUser(Scene mainScene) {
    	applicationStage.setScene(mainScene);
    	
    	// Adding the new user to the ChoiceBox	
    	// chooseUserChoiceBox.getItems().add("placeholder");       // https://jenkov.com/tutorials/javafx/choicebox.html
    }
    
   // Returning user main interface 
   void userWorkoutLog(Scene mainScene) {
	   
   }
   
   void userGoalLog(Scene mainScene) {
	   
   }
    
    @FXML
    void chooseUser(ActionEvent event) {
    	Scene mainScene = applicationStage.getScene();   
    	
    	// Get the input from the user 
    	String user = chooseUserChoiceBox.getValue();
    	
    	// Change the scene to add a new user to the ChoiceBox
    	if (user.equals("Add a User") ) {
    		applicationStage.setTitle("Get Fit");
    		
    		HBox newUserContainer = new HBox();
    		Label newUserLabel = new Label("Add a New User");
    		TextField newUserTextfield = new TextField();
    		
    		
    		Button doneButton = new Button("Done");
    		doneButton.setOnAction(doneEvent -> addNewUser(mainScene));
    		
    		
    		newUserContainer.getChildren().addAll(newUserLabel, newUserTextfield, doneButton);
    		Scene addUserScene = new Scene(newUserContainer);
    		applicationStage.setScene(addUserScene); // places the new scene on the stage
    		
    	} else {
    		// Any returning users already in the ChoiceBox
    		applicationStage.setTitle("Joe");
    		
    		VBox returnUserContainer = new VBox();
    		Label returnUserLabel = new Label("Welcome Joe"); // this will change will change based on what user is chosen
    		Label activityLabel = new Label("How were you active today?");
    		
    		HBox workoutContainer = new HBox();
    		Label logWorkoutLabel = new Label("Log your new workout");
    		Button doneButton = new Button("Enter Here");
    		doneButton.setOnAction(doneEvent -> userWorkoutLog(mainScene));
    		workoutContainer.getChildren().addAll(logWorkoutLabel, doneButton);
    		
    		HBox workoutGoalsContainer = new HBox();
    		Label logGoalsLabel = new Label("Log your workout goals");
    		Button goalsButton = new Button("Enter Goals Here");
    		goalsButton.setOnAction(goalsEvent -> userGoalLog(mainScene));
    		// display the workout goals on the returning users scene
    		workoutGoalsContainer.getChildren().addAll(logGoalsLabel, goalsButton);
    		
    		
    		returnUserContainer.getChildren().addAll(returnUserLabel, activityLabel, workoutContainer, workoutGoalsContainer);
    		Scene returnUserScene = new Scene(returnUserContainer);
    		applicationStage.setScene(returnUserScene);
    	}
    	
    	
    	
    }

}
