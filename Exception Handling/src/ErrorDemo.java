
public class ErrorDemo {
	public void m1() {
		m2();
		System.out.println("java");
		
		
	}
	public void m2() {
		m1();
		System.out.println("Python");
		
		
	}
	public static void main(String[] args) {
		ErrorDemo d =new ErrorDemo();
		d.m1();
				
	}

}

//Exception in thread "main" java.lang.StackOverflowError