
public class StudentTest {
	public static void main(String[] args) {
		
		//Object Creation or Object Instantiation
		Student s1 = new Student(101,"sai",35); // Here s1 is Reference variable
		s1.displayStudentDetails();
		s1.studentResult();
		
		System.out.println("-----------------------");
		
		Student s2 = new Student(102,"Ram",46);
		s2.displayStudentDetails();
		s2.studentResult();
		
		Student s3 = new Student(); 
		s3.displayStudentDetails();
		s3.studentResult();
	}
}

