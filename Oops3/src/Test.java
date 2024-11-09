    /*class GrandParent{
    	int a=10;
    	int b=20;
    }

	class Parent {
	    int a = 10;
	    int b = 20;
	    int x = 111;
	}
	class Child extends Parent {
	    int a = 100;
	    int b = 200;
	    int y = 222;
	    
	    void add(int a, int b) {
	        System.out.println(a + b);
	        System.out.println(this.a + this.b); // "this"  Used to call child class
	        System.out.println(super.a + super.b); //"super" Used to call Parent class
	        GrandParent gp =new GrandParent();
	        System.out.println(gp.a+gp.b);
	        System.out.println(x);
	        System.out.println(y);
	    }
	}
	
	public class Test{
	    public static void main(String[] args) {
	        Child c = new Child();
	        c.add(1000, 2000);
	    }
	}
	*/

class Parent {
    Parent(){
        this(10);
        System.out.println("Java");
    }
    Parent(int i) {
        this(10,20);
        System.out.println("Python");
    }
    Parent(int i, int j) {
        System.out.println("Angular");
    }
}
class Child extends Parent {
    Child() {
        super();
        System.out.println("React");
    }
}
public class Test{
    public static void main(String[] args) {
        new Child();
    }
}


	
