import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodDemo {
	public static void main(String[] args) {
		List<String> courses =Arrays.asList("Java","Python","Angular");
		
		Consumer<String> consumer = (value)->System.out.println(value);
		System.out.println("---------passing consumer object---------");
		courses.forEach(consumer);
		
		System.out.println("---------passing lambda Expression---------");
		courses.forEach((value)->System.out.println(value));//another syntax
		
		System.out.println("---------passing Method References---------"); 
		courses.forEach(System.out:: println);//using method reference
		
		System.out.println("---------Salaries---------");
		
		
		List<Double> salaries = Arrays.asList(55000.00,458000.00,350000.00,65000.00);
		
		Consumer<Double> consumers = (value)->System.out.println(value);
		System.out.println("---------passing consumer object---------");
		salaries.forEach(consumers);
		System.out.println("---------passing lambda Expression---------");
		salaries.forEach((value)->System.out.println(value));
		System.out.println("---------passing Method References---------");
		salaries.forEach(System.out:: println);
		List<Double>filteredsalaries =new ArrayList<Double>();
			
		/*salaries.forEach(salary->{
			if(salary>40000.0)
			{
				filteredsalaries.add(salary);
			}
		});
		
		
		System.out.println(filteredsalaries);
		
		*/
		
		for(Double salary :salaries) {
			if(salary>40000) {
				filteredsalaries.add(salary);
			
			}
		}
		System.out.println(filteredsalaries);
		
		
		
	}

}
