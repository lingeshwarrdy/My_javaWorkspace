
public class ControlFlowStatements {
	
	public static boolean isEven(int num)
	{
		boolean status =false;
		
		if(num%2==0)
		{
			status=true;
		}
		return status ;
	}
	
	public static void findEvenOrOdd(int num) {
		
		if(isEven(num)) {
			System.out.println(num+" is Even Number");
		}
		else {
			System.out.println(num +"is Odd Number");
		}
	}
	public static void main(String[] args) {
		
		findEvenOrOdd(22);
		findEvenOrOdd(23);
		
	}

}
