import java.util.Scanner;

public class conditionalOperator {
	public static void main(String[] args) {
		
		int x, y,max,min;
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		
		x=Sc.nextInt();
		
		System.out.println("Enter Second number : ");
		y=Sc.nextInt();
		
		
		
		max= (x>y)? x:y ;
		min =(x<y)? x:y;
		
		System.out.println("Max of "+x+ " and "+y+ " is "+max);
		
		System.out.println("Min of "+x+ " and "+y+ " is "+min);
		
	}

}
