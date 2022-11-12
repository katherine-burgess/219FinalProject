package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
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
   void returningUser(Scene mainScene) {
	   
   }
    
    @FXML
    void chooseUser(ActionEvent event) {
    	Scene mainScene = applicationStage.getScene();   
    	
    	// Get the input from the user 
    	String user = chooseUserChoiceBox.getValue();
    	
    	// Change the scene to add a new user to the ChoiceBox
    	if (user.equals("Add a User") ) {
    		HBox newUserContainer = new HBox();
    		Label newUserLabel = new Label("Add a New User");
    		TextField newUserTextfield = new TextField();
    		
    		
    		Button doneButton = new Button("Done");
    		doneButton.setOnAction(doneEvent -> addNewUser(mainScene));
    		
    		
    		newUserContainer.getChildren().addAll(newUserLabel, newUserTextfield, doneButton);
    		Scene addUserScene = new Scene(newUserContainer);
    		applicationStage.setScene(addUserScene); // places the new scene on the stage
    		
    	} else {
    		applicationStage.setTitle("Joe");
    		
    		HBox returnUserContainer = new HBox();
    		Label returnUserLabel = new Label("Welcome Joe"); // this will change will change based on what user is chosen
    		
    		
    		Scene returnUserScene = new Scene(new Label("Placeholder. Add widgets later"));
    		applicationStage.setScene(returnUserScene);
    	}
    	System.out.println("user chosen:" + user);
    	
    	
    }

}
