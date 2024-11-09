package com.edubridge.myapp;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class myMathTest {
	public static myMath m;
	
	
	@BeforeAll
	public static void setuUP() {
		m=new myMath();
	}
	
	@AfterAll
	public static void tearUP() {
		m=null;
	}
	@Test
	public void isEven() {
		boolean actual =m.isEven(2);
		boolean expected =true;
				
		assertEquals(expected, actual);
	}
	@Test
	public void isAuthenticate() {
		
		boolean actual =m.isAuthenticate("admin","admin123");
		boolean expected =true;		
		//assertEquals(expected, actual);
	}
			
	
	
}
