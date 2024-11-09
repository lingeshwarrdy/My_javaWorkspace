
class MyClac{
	public static int findMax(int a,int b) {
		return (a>b)?a:b;
	}
	public static long findMax(long a,long b) {
		return (a>b)?a:b;
	}
	public static double findMax(double a,double b) {
		return (a>b)?a:b;
	}
	
	/*public static void sum(int a,int b) {
		System.out.println("Java");
	} */
	/// Variable length argument method or Var Arg Method
	public static void sum(int ... a) {
		int total =0;
		for(int x:a) {
			total+=x;
		}
		System.out.println("total");
	}
	
}




public class OverloadingDemo {
	public static void main(String[] args) {
		
		MyClac.sum();
		
		MyClac.sum(10);
		MyClac.sum(10,20);
		MyClac.sum(10,20, 0);
		MyClac.sum(new int[] {11,12,13,14,15,16});
		
		int maxInt =MyClac.findMax(100,200);
		System.out.println(maxInt);
		
		long maxLong =MyClac.findMax(9879779456l,4865945555l);
		System.out.println(maxLong);
		
		double maxDouble =MyClac.findMax(4879.0, 58496.2);
		System.out.println(maxDouble);
	
		
	}

}
