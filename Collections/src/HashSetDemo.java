import java.util.HashSet;

/*Hash Set
 * Stored  elements based on hash code of objects
 * Duplicate elements not allowed
 * Can not access elements based on index.
 * No insertion order
 */

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<>();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		
		System.out.println(s);
		
        s.add(500);
		
		System.out.println(s);
		
		s.add(null);	
		System.out.println(s);
		boolean existed = s.contains(158);
		System.out.println(existed);
		
		System.out.println(s.isEmpty()); //to check set is empty or not  
		
		s.remove(100);
		System.out.println(s);
		
		
	}

}
