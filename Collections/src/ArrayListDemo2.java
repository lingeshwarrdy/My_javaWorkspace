import java.util.ArrayList;

public class ArrayListDemo2 {
		public static void main(String[] args) {
			//normal arraylist
			
		ArrayList  all =new ArrayList<>(); 
		all.add(100);
		all.add(200);
		//no type safety 
		all.add("abc");
		all.add(12.5);
		System.out.println(all);
		
		Object obj = all.get(0);
		int i =(Integer) obj;
		System.out.println(i);
		
		//Generic Syntax
		//Type safety and avoid type casting
		ArrayList<String> courses =new ArrayList<String>();
		courses.add("java");
		courses.add("Python");
		
		//Type safe
		System.out.println(courses);
		
		//No type casting
		String course = courses.get(1);
		System.out.println(course);
		}}	