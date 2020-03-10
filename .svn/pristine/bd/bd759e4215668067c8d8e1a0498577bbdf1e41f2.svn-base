package edu.ben.labs.lab04;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controller which gives functions to buttons and action in the GUI
 * 
 * @author Jakub Jancek
 * @version 0.2
 */
public class MainController {

	// declaration tags for FXML objects
	@FXML
	private Button loginUserButton;
	@FXML
	private Button openRegistrationButton;
	@FXML
	private Button cancelButton;
	@FXML
	private Button registerUserButton;
	@FXML
	private TextField userName;
	@FXML
	private TextField intialPassword;
	@FXML
	private TextField confirmPassword;
	@FXML
	private Label passwordsNotMatching;
	@FXML
	private Label passwordsTooShort;
	@FXML
	private RadioButton upperCaseRadioButton;
	@FXML
	private RadioButton numbersRadioButton;
	@FXML
	private RadioButton symbolsRadioButton;
	@FXML
	private TextField passwordTextField;
	@FXML
	private Slider lengthSlider;
	@FXML
	private Button createPasswordButton;
	@FXML
	private Label LocationHeader;
	@FXML
	private Label UsernameHeader;
	@FXML
	private Label PasswordHeader;
	@FXML
	private Label password1;
	@FXML
	private Label password2;
	@FXML
	private Label password3;
	@FXML
	private Label password4;
	@FXML
	private Label password5;
	@FXML
	private Label password6;
	@FXML
	private Label password7;
	@FXML
	private Label password8;
	@FXML
	private Label password9;
	@FXML
	private Label password10;
	@FXML
	private TextField loginUsernameTextField;
	@FXML
	private PasswordField loginPasswordTextField;
	@FXML
	private TextField newLocationTextField;
	@FXML
	private TextField newUsernameTextField;
	@FXML
	private TextField newPasswordTextField;
	@FXML
	private TextField loginAdded;
	@FXML
	private TextField passwordAdded;
	@FXML
	private TextField usernameAdded;

	String url = "jdbc:mysql://localhost:3306/my_secure_password";
	String user = "root";
	String password = "Pageup345";

	/**
	 * Opens the Registration Page when the user selects Register
	 * 
	 * @param event
	 *            the user clicks the register button
	 * @throws Exception
	 *             the page does not open properly
	 */
	public void openRegistrationPage(ActionEvent event) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("RegisterPage.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setTitle("My Secure Passwords");
		stage.setScene(new Scene(root, 600, 400));
		stage.show();
	}

	/**
	 * Returns to the Login page after the user registers or clicks cancel
	 * 
	 * @param event
	 *            the user clicks either button on the page
	 * @throws Exception
	 *             the page does not open properly
	 */
	public void displayLogin(ActionEvent event) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setTitle("My Secure Passwords");
		stage.setScene(new Scene(root, 600, 400));
		stage.show();
	}

	/**
	 * Goes to the user password storing page once the user selects login
	 * 
	 * @param event
	 *            the user clicks the login button
	 * @throws Exception
	 */
	public void displayUserPasswords(ActionEvent event) throws Exception {

		Connection myconn = DriverManager.getConnection(url, this.user, password);

		Statement getStuffStatement = myconn.createStatement();

		String sql = "SELECT user_name, master_password, user_id FROM user";

		ResultSet rs;
		rs = getStuffStatement.executeQuery(sql);

		if (rs.next()) {
			if (rs.getString("user_name").equals(loginUsernameTextField.getText())
					&& HashPassword.checkPass(loginPasswordTextField.getText(), rs.getString("master_password"))) {

				Parent root = FXMLLoader.load(getClass().getResource("PasswordListPage.fxml"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				stage.setTitle("My Secure Passwords");
				stage.setScene(new Scene(root, 600, 400));
				stage.show();

			}

		}

	}

	/**
	 * Gets passwords from the database and puts them in the labels
	 * 
	 * @param event
	 * @throws Exception
	 */
	public void displayPasswords(ActionEvent event) throws Exception {

		// resets fields to blank string
		password1.setText("");
		password2.setText("");
		password3.setText("");
		password4.setText("");
		password5.setText("");
		password6.setText("");
		password7.setText("");
		password8.setText("");
		password9.setText("");
		password10.setText("");

		Connection myconn = DriverManager.getConnection(url, user, password);
		Statement getStuffStatement = myconn.createStatement();

		String sql = "SELECT user_name_2, password, name FROM Entry";

		ResultSet rs;
		rs = getStuffStatement.executeQuery(sql);

		// resets all fields with information pulled from the DB
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password1.setText(name + " " + username + " " + password);
		}
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password2.setText(name + " " + username + " " + password);
		}
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password3.setText(name + " " + username + " " + password);
		}
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password4.setText(name + " " + username + " " + password);
		}
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password5.setText(name + " " + username + " " + password);
		}
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password6.setText(name + " " + username + " " + password);
		}
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password7.setText(name + " " + username + " " + password);
		}
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password8.setText(name + " " + username + " " + password);
		}
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password9.setText(name + " " + username + " " + password);
		}
		if (rs.next()) {
			String name = changeLength(rs.getString("name"), 15);
			String password = changeLength(rs.getString("password"), 25);
			String username = changeLength(rs.getString("user_name_2"), 15);
			password10.setText(name + " " + username + " " + password);
		}

	}

	/**
	 * Removes unwanted passwords from the database and displays changes
	 * 
	 * @param event
	 * @throws Exception
	 */
	public void deletePasswords(ActionEvent event) throws Exception {
		Connection myconn = DriverManager.getConnection(url, this.user, password);

		Statement getStuffStatement = myconn.createStatement();

		String sql = "SELECT user_name_2, password, name, Entry_id FROM Entry";

		ResultSet rs;
		rs = getStuffStatement.executeQuery(sql);

		while (rs.next()) {
			if (rs.getString("user_name_2").equals(usernameAdded.getText())
					&& rs.getString("password").equals(passwordAdded.getText())
					&& rs.getString("name").equals(loginAdded.getText())) {
				Statement deleteStuff = myconn.createStatement();

				String deleteSql = "delete from Entry where Entry_id = " + rs.getString("Entry_id");

				deleteStuff.executeUpdate(deleteSql);
			}

		}

		displayPasswords(event);

	}

	/**
	 * Checks if registration is successful. If successful, creates user and
	 * transitions to main screen
	 * 
	 * @param event
	 * @throws Exception
	 */
	public void checkPasswords(ActionEvent event) throws Exception {

		passwordsTooShort.setVisible(false);
		passwordsNotMatching.setVisible(false);
		if (intialPassword.getText().equals(confirmPassword.getText())) {
			if (intialPassword.getLength() < 5) {
				passwordsTooShort.setVisible(true);
			} else {
				if (userName.getText().length() > 0) {
					String hashedPass = HashPassword.hashPass(confirmPassword.getText());
					String user = userName.getText();

					try {
						Connection myconn = DriverManager.getConnection(url, this.user, password);

						Statement getStuffStatement = myconn.createStatement();

						String sql = "SELECT user_name_2, password, name, Entry_id FROM Entry";

						ResultSet rs;
						rs = getStuffStatement.executeQuery(sql);

						while (rs.next()) {

							Statement deleteStuff = myconn.createStatement();

							String deleteSql = "delete from Entry where Entry_id = " + rs.getString("Entry_id");

							deleteStuff.executeUpdate(deleteSql);

						}

						Statement deleteStuff = myconn.createStatement();
						String deleteSql = "delete from user where user_id = 1";
						deleteStuff.executeUpdate(deleteSql);

						Statement myStmt = myconn.createStatement();
						String query = "insert into User " + "(user_name, master_password, user_id)" + " values ('"
								+ user + "', '" + hashedPass + "', '1')";
						myStmt.executeUpdate(query);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				displayLogin(event);
			}

		} else {
			passwordsNotMatching.setVisible(true);
		}

	}

	/**
	 * When create password button is pressed, this method is called. Takes in
	 * the current value of the slider and the boolean values for caps, numbers,
	 * and symbols. Then generates a password and stores it into the textfield
	 * 
	 * @param event
	 *            When the create password button is pressed
	 */
	public void generatePasswords(ActionEvent event) {
		int length = (int) lengthSlider.getValue();
		boolean hasCaps = upperCaseRadioButton.isSelected();
		boolean hasNumbers = numbersRadioButton.isSelected();
		boolean hasSymbols = symbolsRadioButton.isSelected();

		String password = PasswordGenerator.generatePassword(hasCaps, hasNumbers, hasSymbols, length);

		passwordTextField.setText(password);
	}

	/**
	 * Gets information from the three fields, adds them to database, and
	 * updates display
	 * 
	 * @param event
	 * @throws Exception
	 *
	 */

	public void addPassword(ActionEvent event) throws Exception {

		Connection myconn = DriverManager.getConnection(url, user, password);
		Statement myStmt = myconn.createStatement();

		String query = "insert into Entry " + "(user_name_2, password, User_User_id, name)" + " values ('"
				+ usernameAdded.getText() + "', '" + passwordAdded.getText() + "', '1', '" + loginAdded.getText()
				+ "')";
		myStmt.executeUpdate(query);

		displayPasswords(event);
	}

	/**
	 * Makes sure fields are uniform length for display in the GUI
	 * 
	 * @param lengthOfEntry
	 * @param allowedLength
	 * @return
	 */
	public String changeLength(String lengthOfEntry, int allowedLength) {

		int remainder = allowedLength - lengthOfEntry.length();

		for (int i = 0; i < remainder; i++) {
			lengthOfEntry = lengthOfEntry + " ";
		}

		return lengthOfEntry;
	}

}