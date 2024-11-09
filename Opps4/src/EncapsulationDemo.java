
public class EncapsulationDemo {
	public static void main(String[] args) {
		Student s1 = new Student(1001,"sai","sai@gmail.com",68548655l);
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentEmailId());
		System.out.println(s1.getStudentMobile());
		
		System.out.println("-------------------------------\n");
		Student s2 = new Student();
		s2.setStudentId(1002);
		s2.setStudentName("Ram");
		s2.setStudentEmailId("ram@gmail.com");
		s2.setStudentMobile(8956235689l);
		System.out.println(s2.getStudentId());
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentEmailId());
		System.out.println(s2.getStudentMobile());
	}

}
