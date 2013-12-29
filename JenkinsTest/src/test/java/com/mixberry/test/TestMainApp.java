package com.mixberry.test;

import org.junit.Test;

import junit.framework.TestCase;

public class TestMainApp extends TestCase {

	@Test
	public void test(){
		assertEquals(true, true);
	}
	
	@Test
	public void testMyFunction(){
		
		String testString = "TestString";
		MainApp mainApp = new MainApp();
		String resultString = mainApp.myFirstFunction(testString);
		
		assertEquals(testString, resultString);
		
		assertNotSame(testString, resultString);
	}
}
