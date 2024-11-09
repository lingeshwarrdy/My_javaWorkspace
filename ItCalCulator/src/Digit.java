
public class Digit {

	 public static int NoOfDigits(int num) {
	        int count = 0;
	        while (num != 0) {
	            int temp = num % 10;
	           count++;
	            num = num / 10;
	        }
	        return count;
	    }	
	 public static void main(String[] args) {
		
		 int Count=NoOfDigits(1025);
		 
		 System.out.println(Count);
		
	}
}

