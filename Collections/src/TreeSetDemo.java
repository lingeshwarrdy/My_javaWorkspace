import java.util.TreeSet;
/*
 * Tree Set
 * maintains order irrespective of insertion
 * Null values not allowed
 * To get elements in reverse order add {Comparator.reverseOrder() }
 */


public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> s =new TreeSet<>();
		//TreeSet<Integer> s =new TreeSet<>(Comparator.reverseOrder());
		s.add(100);
		s.add(500);
		s.add(300);
		s.add(400);
		s.add(200);
		
		System.out.println(s);
		
        s.add(500);
		
		System.out.println(s);
		
	//	s.add(null);	
		System.out.println(s);
		boolean existed = s.contains(158);
		System.out.println(existed);
		
		System.out.println(s.isEmpty()); //to check set is empty or not  
		
		s.remove(100);
		System.out.println(s);
		
		
	}

}
