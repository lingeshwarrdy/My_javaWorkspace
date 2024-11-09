package com.edubridge.myapp;

public class myMath {
	public myMath() {
		System.out.println("myMath object is Created");
	}
	
	String uname ="admin";
	String password ="admin123";
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	
	public boolean isAuthenticate(String uname,String password) {
		if(uname.equals(uname)&&password.equals(password)) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
