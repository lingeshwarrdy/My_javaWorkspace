import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		int num1,num2,sum,num3,num4,sum1;
		num1 =num2=sum=0;
		
		//Reassign values;
		num1=510;
		num2=250;
		sum =num1+num2;
		System.out.println("Sum of numbers is : "+sum);
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter the first number : ");
		num3 = sc.nextInt();
		
		System.out.println("Please enter second number : ");
		num4 =sc.nextInt();
		
		sum1=num3+num4;
		
		System.out.println("Sum of "+ num3+" and "+num4+ " is = "+sum1);
		
		
		
	}

}
