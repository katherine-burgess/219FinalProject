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
    private ChoiceBox<String> chooseUserChoiceBox;

    
    void addNewUser(Scene mainScene) {
    	applicationStage.setScene(mainScene);
    }
    
    /** 
     * This method will
     * 
     * @param event 
     */
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
    		
    		Scene returnUserScene = new Scene(new Label("Placeholder. Add widgets later"));
    		applicationStage.setScene(returnUserScene);
    	}
    	System.out.println("user chosen:" + user);
    	
    	
    }

}
