import java.util.HashSet;
import java.util.LinkedHashSet;

/* Linked Hash set
 * Stored  elements based on hash code of objects
 * Duplicate elements not allowed
 * Can not access elements based on index.
 * Insertion order will be there
 */

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> s= new LinkedHashSet<>();
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
		
		s.addFirst(123);
		//s.remove(100);
		s.addLast(232);
		System.out.println(s);
		s.removeFirst();
		System.out.println(s);
		s.removeLast();
		System.out.println(s);
		
	}

}
