
public class MethodsDemo {
	//static methods
	public static void findSquare(int num)
	{
		int square =num*num;
		System.out.println(square);
	}
	
	//Instance Methods
	public  void findCube(int num)
	{
		int cube =num*num*num;
		System.out.println(cube);
	}
	
	public static int findMax(int num1,int num2) {
		int max =(num1>num2)?num1:num2;
		return max;
	}
	
	public static double findTotal(double num1,double num2)
	{
		
		return num1+num2;
	}
	
	public static double findAvg(double num1,double num2)
	{
		
		double total =findTotal(num1,num2);
		double Avg = total/2;
		return Avg;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int max =findMax(10,85);
		System.out.println("Max is : " +max);
		
		double Avg =findAvg(15.5,5.2);
		System.out.println("Average is : "+Avg);
		
		
		
		//Static methods
		findSquare(25);
		
		//Accessing Instance methods
		MethodsDemo m =new MethodsDemo();
		m.findCube(10);
		MethodsDemo.findSquare(25); //Access using class name
		m.findSquare(25); //Reference variable
		
		
	}

}
