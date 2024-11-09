@FunctionalInterface
public interface Printer {
	
	//public static final String VERSIONNO="v1.0.0";
	String VERSION_NO="v1.0.0";
	
	 //public abstract void printjob();
	
	 void printjob();
	 
	 
	 default void tshirtPrintJob() {
		 System.out.println(" T-Shirt Printing Job.");
	 }
	 
	 default void coffeeCupPrintJob() {
		 System.out.println(" Coffee Cup Printing Job.");
	 }
	 
	 static void threeDPrintJob() {
		 System.out.println(" 3D Printing Job ");
	 }
}
