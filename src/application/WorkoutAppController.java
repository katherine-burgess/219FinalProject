package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WorkoutAppController {
	Stage applicationStage;
	
    @FXML
    private ChoiceBox<String> chooseUserChoiceBox;

    
    /** 
     * This method will
     * 
     * @param event 
     */
    @FXML
    void chooseUser(ActionEvent event) {
    	// Get the input from the user 
    	String user = chooseUserChoiceBox.getValue();
    	
    	// Change the scene to add a new user to the ChoiceBox
    	if (user.equals("Add a User") ) {
    		Scene addUserScene = new Scene(new Label("Placeholder. Add widgets later"));
    		applicationStage.setScene(addUserScene); // places the new scene on the stage
    	}
    	System.out.println("user chosen:" + user);
    	
    	
    }

}
