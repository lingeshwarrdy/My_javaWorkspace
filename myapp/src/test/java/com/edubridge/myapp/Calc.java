package com.edubridge.myapp;

public class Calc {
	
	public Calc() {
		System.out.println("Calc object is Created");
	}
	public int findSquare(int num) {
		return num*num;
	}
	public int findCube(int num) {
		return num*num*num;
	}

}



/*@Test
public void isAuthenticate() {
actual = m.isAuthenticate("wrongUser", "password123");
expected = false;
assertEquals(expected, actual);
}

@Test
public void isAuthenticate() {
// Invalid password
actual = m.isAuthenticate("admin", "wrongPassword");
expected = false;
assertEquals(expected, actual);
}

@Test
public void isAuthenticate() {
// Both username and password are invalid
actual = m.isAuthenticate("wrongUser", "wrongPassword");
expected = false;
assertEquals(expected, actual);
}
*/

