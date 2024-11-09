
public class MyMath {
	 public static int reverseDigits(int num) {
	        int reverse = 0;
	        int lastDigit;
	        
	        while (num!=0) {
	            lastDigit = num % 10;
	            reverse = reverse * 10 + lastDigit;
	            num = num / 10;
	        }
	        
	        return reverse;
	    }
	 public static int sumOfDigits(int num) {
	        int sum = 0;
	        while (num > 0) {
	            int temp = num % 10;
	            sum = sum + temp;
	            num = num / 10;
	        }
	        return sum;
	    }
	 public static int NoOfDigits(int num) {
	        int count = 0;
	        while (num != 0) {
	            int temp = num% 10;
	           count++;
	            num= num/ 10;
	        }
	        return count;
	    }	

}
