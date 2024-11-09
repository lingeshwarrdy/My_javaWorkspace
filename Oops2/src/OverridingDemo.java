
 class  Parent{
	 //final key word does not allow overriding in child class	
	public final void study() { 
		System.out.println("Medicine ");
	}
	public void prorperty() {
		System.out.println("100 acre land +100 kg gold +100 cr cash");
	}
	public void marry() {
		System.out.println("Arranged Marriage");
	}

}
class child extends Parent {
	//@Override
	public void marry() {
		super.marry();
		System.out.println("Love Marriage");
	}
	
}
public class OverridingDemo{
	public static void main(String[] args) {
		System.out.println("Parent : ");
		Parent p = new Parent();
		p.study();
		p.prorperty();
		p.marry();
		
		System.out.println("----------------------\n");
		System.out.println("Child : ");
		child c =new child();
		c.study();
		c.prorperty();
		c.marry();
	}
}