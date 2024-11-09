
import java.util.ArrayList;

public class ArrayListDemo4 {
		public static void main(String[] args) {
			ArrayList<String> courses =new ArrayList<>();
			courses.add("Java");
			courses.add("Python");
			courses.add("Angular");
			courses.add("React");
			System.out.println(courses);
			
			courses.add(2,"Hibernate");
			System.out.println(courses);
			
			courses.remove(2);
			System.out.println(courses);
			courses.remove(1);
			System.out.println(courses);
		}
}
