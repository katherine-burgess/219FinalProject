module CPSC219Project_WorkoutApp {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
