package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
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
   
    
   // currently returns to the main interface when it should go back to the most recent scene
   // Returning user main interface 
   void userWorkoutLog(Scene mainScene) {
	   applicationStage.setScene(mainScene);
	   
	   
	   applicationStage.setTitle("Log" + chooseUserChoiceBox.getValue() + "Workout Stats");
	   
	   // main container
	   VBox workoutStatsContainer = new VBox();
	  
	   
	   HBox workoutTypeContainer = new HBox();
	   Label workoutTypeLabel = new Label("Workout Type: ");
	   ChoiceBox<String> workoutTypeChoiceBox = new ChoiceBox<String>();
	   workoutTypeChoiceBox.getItems().add("Cardio");
	   workoutTypeChoiceBox.getItems().add("Weight Training");
	   
	   workoutTypeContainer.getChildren().addAll(workoutTypeLabel, workoutTypeChoiceBox);
	   
	   workoutStatsContainer.getChildren().addAll(workoutTypeContainer);
	   
	   
   }
   
   void userGoalLog(Scene logWorkoutScene) {
	   
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
    		//Scene logWorkoutScene = new applicationStage.getScene();
    		VBox returnUserContainer = new VBox();
    		
    		returnUserContainer.setStyle("-fx-background-color: gainsboro;");
    		
    		// Title changes based on the user that is entered
    		applicationStage.setTitle(user);
    		
    		
    		Label returnUserLabel = new Label("Welcome " + user + " !"); // this will change will change based on what user is chosen
    		VBox.setMargin(returnUserLabel, new Insets(10,10,10,10));
    		Label activityLabel = new Label("How were you active today?");
    		VBox.setMargin(activityLabel, new Insets(10,10,10,10));
    		HBox workoutContainer = new HBox();
    		
    		Label logWorkoutLabel = new Label("Log your new workout");
    		HBox.setMargin(logWorkoutLabel, new Insets(10,10,10,10));
    		Button doneButton = new Button("Enter Here");
    		HBox.setMargin(doneButton, new Insets(10,10,10,10));
    		doneButton.setOnAction(doneEvent -> userWorkoutLog(mainScene));
    		workoutContainer.getChildren().addAll(logWorkoutLabel, doneButton);
    		
    		HBox workoutGoalsContainer = new HBox();
    		Label logGoalsLabel = new Label("Log your workout goals");
    		HBox.setMargin(logGoalsLabel, new Insets(10,10,10,10));
    		Button goalsButton = new Button("Enter Goals Here");
    		HBox.setMargin(goalsButton, new Insets(10,10,10,10));
    		goalsButton.setOnAction(goalsEvent -> userGoalLog(mainScene));
    		
    		workoutGoalsContainer.getChildren().addAll(logGoalsLabel, goalsButton);
    		
    		
    		returnUserContainer.getChildren().addAll(returnUserLabel, activityLabel, workoutContainer, workoutGoalsContainer);
    		Scene returnUserScene = new Scene(returnUserContainer);
    		applicationStage.setScene(returnUserScene);
    	}
    	
    	
    	
    }

}
