/*

class Parent{
    public void study() {
        System.out.println("Medicine");
    }
}
class Child extends Parent{
    public void study() {
        System.out.println("Acting");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.study();
        
        Child c = new Child();
        c.study();
        
        Parent p2 = new Child();
        p2.study();
        
        //Child c2 = (Child) new Parent();
    }
}
*/
class Parent{
    public static void study() {
        System.out.println("Medicine");
    }
}
class Child extends Parent{
    //Method Hiding
    public static void study() {
        System.out.println("Acting");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Parent p2 = new Child();
        p2.study();
        
        //Child c2 = (Child) new Parent();
    }
}