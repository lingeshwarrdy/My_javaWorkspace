import java.util.Scanner;

public class conditionalOperators {

	public static void main(String[] args) {

		int x, y,z,max,min;
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		
		x=Sc.nextInt();
		
		System.out.println("Enter Second number : ");
		y=Sc.nextInt();
		
		System.out.println("Enter Third number : ");
		z=Sc.nextInt();
		
		
		
		min= (x<y&&x<z ?x:(y<z?x:z));
		max =(x>y&&x>z ?x:(y>z?x:z));
		
		System.out.println("Max of "+x+ " and "+y+ " and "+z+" is "+max);
		
		System.out.println("Min of "+x+ " and "+y+ " and "+z+" is "+min);
	}

}
