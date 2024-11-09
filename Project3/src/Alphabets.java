
public class Alphabets {
	
	public static void printMulTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num +" * "+ i+ " = "+(num*i));
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		printMulTable(2);
	}
	}