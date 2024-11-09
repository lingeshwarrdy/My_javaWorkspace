import java.util.Scanner;

public class Prime_Number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		int num =sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num  +" is prime number. ");
		}
		else {
			System.out.println(num +" is not Prime number. ");
		}
	}

	private static boolean isPrime(int num) {
		for(int i =2;i<=num/2; i++) {
			if(num % i ==0) {
				return false;
			}
		}
		
		return true;
	}
}