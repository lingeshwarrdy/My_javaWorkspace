import java.util.Scanner;

public class Sumofnumbers {
	public static void main(String[] args) {
		double num1,num2,sum;
		num1=num2=sum=0;
		
		num1=3.10;
		num2=1.25;
		sum=num1+num2;
		System.out.println(sum);
		
		float num3=2.5f;
		float num4=3.5f;
		
		 float sum1=num3+num4;
		System.out.println(sum1);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 st num : ");
		float num5 = sc.nextFloat();
		
		System.out.println("Enter 2nd  num : ");
		float num6 = sc.nextFloat();
		
		float Add =num5+num6;
		
		System.out.println("Addition of " +num5+ " and "+num6+" is "+Add);
		
	}

}
