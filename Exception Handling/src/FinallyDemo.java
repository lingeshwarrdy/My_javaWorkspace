
public class FinallyDemo {
	public static void main(String[] args) {
		String s =null;
		System.out.println("Hello...");
		try {
			//System.exit(0);
			System.out.println(s.charAt(0));
			
		} catch (NullPointerException e) {
			System.out.println("Nothing");
			//System.exit(0);
		}
		finally {
			System.out.println("Bye..");
		}
		System.out.println("Ok...");
		
	}

}

//System.exit(0); will terminates the program