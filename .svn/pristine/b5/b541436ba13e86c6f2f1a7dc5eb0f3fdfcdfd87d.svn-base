package edu.ben.labs.lab04.test;
import static org.junit.Assert.*;
import org.junit.Test;
import edu.ben.labs.lab04.*;

/**
 * @author razak
 *
 */
public class HashPasswordTest {
	//set up passwords for later use.
	String p1 = "stop";
	String p2 = "pots";
	String p3 = "stop123";
	String p4 = "pots123";
	String p5 = "12345";
	String p6 = "-12345";
	String p7 = "!@#$%";
	String p8 = "loooooooooooooooooooooooooooooooooooooongpass";
	String p9 = "s";
	//test same unicode value of char
	@Test
	public void testHashPass() {
		String hashedp1 = HashPassword.hashPass(p1);
		String hashedp2 = HashPassword.hashPass(p2);
		assertFalse(hashedp1.equals(hashedp2));
	}
	//test same unicode value of char including numbers
	@Test
	public void testHashPass2(){
		String hashedp3 = HashPassword.hashPass(p3);
		String hashedp4 = HashPassword.hashPass(p4);
		assertFalse(hashedp3.equals(hashedp4));
	}
	//test number passwords
	@Test
	public void testHashPass3(){
		String hashedp5 = HashPassword.hashPass(p5);
		String hashedp6 = HashPassword.hashPass(p6);
		assertFalse(hashedp5.equals(hashedp6));
	}
	// test long hashed passwords and short hashed passwords
	@Test
	public void testHashPass4(){
		String hashedp7 = HashPassword.hashPass(p7);
		String hashedp8 = HashPassword.hashPass(p8);
		assertFalse(hashedp7.equals(hashedp8));
	}
	//test the same password hashes to a different string.
	@Test
	public void testHashPass5(){
		String hashedp1 = HashPassword.hashPass(p1);
		String hashedp2 = HashPassword.hashPass(p1);
		assertFalse(hashedp1.equals(hashedp2));
	}
	// test a number password and a letter password
	@Test
	public void testHashPass6(){
		String hashedp1 = HashPassword.hashPass(p1);
		String hashedp5 = HashPassword.hashPass(p5);
		assertFalse(hashedp1.equals(hashedp5));
	}
	
	//test checkpw method
	@Test
	public void testCheckPw(){
		String hashedp1 = HashPassword.hashPass(p1);
		boolean check = HashPassword.checkPass(p1, hashedp1);
		assertTrue(check);
	}
	//test incorrect password check
	@Test
	public void testCheckPw2(){
		String hashedp3 = HashPassword.hashPass(p3);
		boolean check = HashPassword.checkPass(p4, hashedp3);
		assertFalse(check);
	}
	//test checkpw
	@Test
	public void testCheckPw3(){
		String hashedp5 = HashPassword.hashPass(p5);
		assertTrue(HashPassword.checkPass(p5, hashedp5));
	}
	//test incorrect pw
	@Test
	public void testCheckPw4(){
		String hashedp1 = HashPassword.hashPass(p1);
		assertFalse(HashPassword.checkPass(p2, hashedp1));
	}

}
