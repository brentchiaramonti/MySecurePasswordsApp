package edu.ben.labs.lab04;
/**
 * Gui class which launches the application when it is run
 * @author Jakub Jancek
 * @version 0.1
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application {
	
	/**
	 * Launches the program
	 * @param args the arguments that are passed in
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Gets the data from the FXML file and creates the scene
	 * @param primaryStage The main stage that will be displayed
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		primaryStage.setTitle("My Secure Passwords");
		primaryStage.setScene(new Scene(root, 600, 400));
		primaryStage.show();
	}

}
