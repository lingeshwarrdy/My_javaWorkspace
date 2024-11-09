@FunctionalInterface
interface myFunctionalInterface{
	void wish();
}

class Hello implements myFunctionalInterface{
	@Override
	public void wish(){
		System.out.println(" Hello ...everybody");
	}
}

@FunctionalInterface
interface myFunctionalInterface2{
	int findSquare(int num);
}

@FunctionalInterface
interface myFunctionalInterface3{
	int findTotal(int num,int num2);
}

@FunctionalInterface
interface myFunctionalInterface4{
	boolean isEven(int num);
}
public class LambdaExpressionsDemo {
	public static void main(String[] args) {
		
		myFunctionalInterface4 myfun4=(int num)->(num%2==0);
		boolean isEven =myfun4.isEven(10);
		System.out.println(isEven);
		
		//3.
		myFunctionalInterface3 myfun3 = (x,y)->x+y;
		System.out.println(myfun3.findTotal(12,20));
		
		//2.
		myFunctionalInterface2 myfun2 =(int num)->num*num;
		int square =myfun2.findSquare(10);
		System.out.println(square);
		
		//1.
		myFunctionalInterface myfun1 =new Hello();
		myfun1.wish();
		myFunctionalInterface Myfun2 =()->System.out.println(" Hii....");
		Myfun2.wish();
	}

}
