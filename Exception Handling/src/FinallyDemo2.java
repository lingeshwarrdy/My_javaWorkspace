
public class FinallyDemo2 {
	public static void main(String[] args) {
		
		try {
			//System.exit(0);
			System.out.println("Risky code");
			
		} catch (Exception e) {
			System.out.println("Handling code");  //Will execute  only when exception is raised
			//System.exit(0);
		}
		finally {
			System.out.println("clean up code..");
		}
		
		
	}

}
