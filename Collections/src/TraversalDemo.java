import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;



public class TraversalDemo {
	public static void main(String[] args) {
		ArrayList<Double> salaries =new ArrayList<Double>();
		salaries.add(55000.00);
		salaries.add(35000.00);
		salaries.add(65000.00);
		salaries.add(85000.00);
		salaries.add(25000.00);
		
		System.out.println(salaries);
		
		System.out.println(" Using For loop");
		
		for(int index =0;index < salaries.size();index++) {
			System.out.println(salaries);
		}
		
		System.out.println(" Using ListIterator from 1.2");
		ListIterator<Double>itr =salaries.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(" Using ListIterator from 1.5");
		for(Double salary :salaries) {
			System.out.println(salary);
		}
		
		System.out.println(" Using foreach() from v1.8 with Method References");
		salaries.forEach(System.out ::println);
		
		System.out.println(" Using foreach() from v1.8 with Lambda Expressions");
		salaries.forEach((salary) ->System.out.println(salary));
	}

}
