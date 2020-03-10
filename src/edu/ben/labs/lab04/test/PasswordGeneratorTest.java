package edu.ben.labs.lab04.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ben.labs.lab04.PasswordGenerator;

public class PasswordGeneratorTest {

	@Test
	public void basicTest() {
		for(int i = 0; i < 10; i++) {
			System.out.println(PasswordGenerator.generatePassword(true, true, true, 5));
		}
	}

}
