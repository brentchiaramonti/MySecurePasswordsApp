package edu.ben.labs.lab04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * This class was our backup class if the relational datebase failed to work out
 * for us. It will both read and write to our password file.
 * 
 * @author Mike
 * @version 0.1
 *
 */
public class NonRelationalDB {

	/**
	 * Reads in file and will output stored information to the GUI
	 * 
	 * @param user
	 */
	void readFile(String user) {
		String fileName = "C:\\workspace\\MySecurePasswordsApp\\src/" + user + ".txt";

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				// enter code to set text on GUI
			}
			bufferedReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Problem reading file.");
		}
	}

	/**
	 * Adds new entry to the password text document
	 * 
	 * @param user
	 * @param website
	 * @param password
	 */
	void addPassword(String user, String website, String password) {
		String fileName = "C:\\workspace\\MySecurePasswordsApp\\src/" + user + ".txt";

		try {
			FileWriter fileWriter = new FileWriter(fileName, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(website);
			bufferedWriter.newLine();
			bufferedWriter.write(password);
			bufferedWriter.newLine();

			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Problem writing file.");
		}
	}

	/**
	 * After registering, this creates a text file with the user name, then
	 * stores the master password on the first line.
	 * 
	 * @param user
	 * @param password
	 */
	void createFile(String user, String password) {
		String fileName = "C:\\workspace\\MySecurePasswordsApp\\src/" + user + ".txt";

		File f = new File(fileName);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		addPassword(user, "MasterPassword:", password);
	}

}
