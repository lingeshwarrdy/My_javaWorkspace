package com.edubridge.myapp;


//static import
import  static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
	private static Calc c;                    // create object for a class one time to use it in multiple methods
	//@BeforeEach
	@BeforeAll   // Before all is used only for static methods
	public static void setuUP() {
		c=new Calc();
	}
	//@AfterEach
	@AfterAll
	public static void tearUP() {
		c=null;
	}
	@Test
	public void testFindSquare() {
	//	Calc c =new Calc();
		int actual =c.findSquare(10);
		int expected =100;
		
		assertEquals(expected, actual);
	}
	@Test
	public void testFindCube() {
		//Calc c =new Calc();
		assertEquals(1000, c.findCube(10));
	}

}
