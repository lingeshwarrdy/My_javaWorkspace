import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(44,55,88,22,11,59,87,95,100);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Comparator.reverseOrder()); // to print reverse order
		System.out.println(list);
		
		int index =Collections.binarySearch(list, 55);  // to search element in the list
		System.out.println(index);
	}
}                                       