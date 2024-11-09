package com.edubridge.myapp;


import  static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SimpleInterestTest {
	
	private static InterestCalc c;                    // create object for a class one time to use it in multiple methods
	
	@BeforeAll   
	public static void setuUP() {
		c=new InterestCalc();
	}
	
	@Test
	public void testSIWithSmallAmount() {
	 double actual =c.si(10000,12,1);
	int expected =1200;
	assertEquals(expected, actual);
	}
	
	@Test
	public void testSIWithBigAmount() {
	 double actual =c.si(1000000,12,1);
	int expected =120000;
	assertEquals(expected, actual);
	}
}
