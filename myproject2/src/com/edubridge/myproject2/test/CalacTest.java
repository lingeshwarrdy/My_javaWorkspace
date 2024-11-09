package com.edubridge.myproject2.test;

import java.util.Scanner;

import com.edubridge.myproject1.util.Calc;
import com.edubridgemyproject3.util.InterestCalc;




public class CalacTest {
	public static void main(String[] args) {
		int square =Calc.findSquare(10);
		int cube =Calc.findCube(10);
		
		System.out.println(square);
		System.out.println(cube);
		
		
      
		double simpleInterest = InterestCalc.calculateSimpleInterest(58666.0,2.2,5);
		System.out.println(simpleInterest);
	}

}
  