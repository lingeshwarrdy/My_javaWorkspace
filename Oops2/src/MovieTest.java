
public class MovieTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Movie m1 = new Movie(101,"Devara","Shiva");
		Movie m2 = new Movie(102,"RRR","Rajamouli");
		Movie m3 = new Movie(101,"Devara","Shiva");
		
		// Shallow Cloning(Assign one reference to another reference)
		Movie m4 =m1; 
		System.out.println("m4 :"+m4.hashCode());
		System.out.println("m1 :"+m1.hashCode());
		
		
		//Deep Cloning(create independent object)
		Movie m5=(Movie) m2.clone();
		
		System.out.println("m2 :"+m2.hashCode());
		System.out.println("m5 :"+m5.hashCode());
		
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m3.hashCode());
		
		// == Operator always meant for reference comparison
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		System.out.println(m1==m4);
		
		
		// Object class .equals is meant for Reference comparison only
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(m4));
		
		String s1 =new String ("Java");
		String s2 =new String("Java");
		
		System.out.println(s1.equals(s2));
	}

}
