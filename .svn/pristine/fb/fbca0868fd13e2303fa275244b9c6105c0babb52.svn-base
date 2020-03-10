package edu.ben.labs.lab04;
/**
 * Uses BCrypt code to hash the password. allow checks for password correctness
 * @author Raza Mohammed
 * @version 0.1
 *
 */
public class HashPassword {
	//hash the given password
	//return string of hashed password for storage
	public static String hashPass(String password){
		String hashedPass = BCrypt.hashpw(password, BCrypt.gensalt());
		return hashedPass;
	}
	/**
	 * check if the given password matches the stored hashed password
	 * @param password
	 * @param hashedPass
	 * @return
	 */
	public static boolean checkPass(String password, String hashedPass){
		if (BCrypt.checkpw(password, hashedPass)){
			return true;
		}else{
			return false;
		}
	}
}
