package com.mixberry.test;

import org.junit.Test;

import junit.framework.TestCase;

public class TestMainApp extends TestCase {

	@Test
	public void testMainFunction(){
		
		boolean thrown;
		
		try {
			MainApp.main(null);
			thrown = false;
		  } catch (IndexOutOfBoundsException e) {
		    thrown = true;
		  }

		  assertFalse(thrown);
	}
	
	@Test
	public void testMyFunction(){
		
		String testString = "TestString";
		MainApp mainApp = new MainApp();
		String resultString = mainApp.myFirstFunction(testString);
		
		assertEquals(testString, resultString);
	}
}
