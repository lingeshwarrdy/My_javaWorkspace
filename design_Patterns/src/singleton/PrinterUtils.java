package singleton;

public class PrinterUtils {
	private static PrinterUtils instance;
	
	
	//private constructor is used to stop creating object using new
	
	private PrinterUtils() {}
	
	public static PrinterUtils getInstance() {
		if(instance == null) {
			instance =new PrinterUtils();
		}
		
		return instance;
	}
	
	public void printJob()	{
		System.out.println("print...");
	}
		
	
}
