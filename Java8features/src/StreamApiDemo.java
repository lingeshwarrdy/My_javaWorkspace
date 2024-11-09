import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo {
	public static void main(String[] args) {
		List<Double> salaries = Arrays.asList(55000.0,45000.0,350000.0,65000.0);
		
		Stream<Double> stream=salaries.stream();
		
		Predicate<Double> predicate =(value)->value >=40000;
		
		stream
			.filter(predicate)
			.forEach(System.out :: println);
		
		System.out.println(" \n-----Filter salaries <50000----- \n");
		
		salaries
			.stream()
			.filter((salary)->salary<50000)
			.forEach(System.out::println);
			
		List<String> courses =Arrays.asList("Python","Java","Angular","React");
		
		System.out.println("-----Filter courses names start with J ----- ");
		
		courses
			.stream()
			.filter((course)->course.startsWith("J"))
			.forEach(System.out::println);
		
		System.out.println("-----Filter courses Where course name length is  >= 5  -----");
		courses
		    .stream()
		    .filter((course)->course.length()>=5)
		    .forEach(System.out::println);
		
		System.out.println("\n-----------------------");
		System.out.println(salaries);
		System.out.println("------Update each salary by 2000 and dispaly updated salary");
		
		salaries
				.stream()
				.map(salary->salary+2000)
				.forEach(System.out::println);
				
				
		System.out.println("------Update each salary by 10% and dispaly updated salary");
		salaries
		.stream()
		.map(salary->salary+salary* 0.1)
		.forEach(System.out::println);
		
		System.out.println("----- Dispaly Total Salaries----");
		/*double totalsum =salaries
				.stream()
				.mapToDouble(Double::doubleValue)
				.sum();
		System.out.println(totalsum); */
		
		System.out.println(salaries);
		
		/*Double totalSalary =salaries
				.stream()
				.reduce((sal1, sal2)->sal1+sal2)
				.get();
		System.out.println(totalSalary);*/
		
		
		double totalsalary =salaries
				.stream()
				.mapToDouble((salary)->salary)
				.sum();
		System.out.println(totalsalary);
		
		System.out.println("\n--- Average salary----\n");
		
		double avgSalary =salaries
				.stream()
				.mapToDouble((salary)-> salary )
				.average()
				.getAsDouble();
				
		System.out.println(avgSalary);
		
		
		System.out.println("\n--- Mininum salary----\n");
		double minSalary =salaries
				.stream()
				.mapToDouble((salary)-> salary )
				.min()
				.getAsDouble();
		System.out.println(minSalary);
		
		System.out.println("\n--- Maximum salary----\n");
		double maxSalary =salaries
				.stream()
				.mapToDouble((salary)-> salary )
				.max()
				.getAsDouble();
		System.out.println(maxSalary);
		
		
				
				
	}

}   