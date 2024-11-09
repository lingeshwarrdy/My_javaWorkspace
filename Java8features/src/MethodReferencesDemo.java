
@FunctionalInterface
interface Greet{
	void wish();
}
public class MethodReferencesDemo {
	public static void sayHello() {
		System.out.println(" Hello Every body !..");
	}
	public void sayHi(){
		System.out.println("hi.. Everyone!");
	}
	public static void main(String[] args) {
		Greet g = ()->MethodReferencesDemo.sayHello();
		g.wish();
		
		//Method references to call static methods
		Greet g2 = MethodReferencesDemo :: sayHello;
		g2.wish();
		
		//calling instance methods
		MethodReferencesDemo d=new MethodReferencesDemo();
		Greet g3 =()->d.sayHi();
		g3.wish();
		           
		Greet g4 = d :: sayHi;
		g4.wish();
		
	}

}
