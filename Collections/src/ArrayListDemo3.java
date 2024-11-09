
import java.util.ArrayList;

public class ArrayListDemo3 {
		public static void main(String[] args) {
			ArrayList<String> courses =new ArrayList<>();
			courses.add("Java");
			courses.add("Python");
			courses.add("Angular");
			courses.add("React");
			System.out.println(courses);
			
			//Traversing
			System.out.println(" Using for loop frm java 1.0 ");
			for(int index =0;index <courses.size();index++) {
				System.out.println(courses.get(index));
				
			}
			
			System.out.println(" Using for each loop from java 1.5 ");
			for(String course:courses) {
				System.out.println(course);
			}
		}
}
