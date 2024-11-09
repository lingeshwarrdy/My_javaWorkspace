
public class Student {
	// Instance Variables
	int studentId ;
	String studentName ;
	double studentMarks ;
	
	//Static variable (in static variable memory allocation done only once)
	static String studentBatchCode= "2024-12634 ";
	
	//Constructor (name should be class name)
		public Student(int studentId,String studentName,double studentMarks) //local variables
		{
		System.out.println("  Parameterized Constructor... ");
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentMarks=studentMarks;
		
	}
		public Student()
		{
			System.out.println("no-argument constructor / zero-argument constructor"); 
		}
	
	
	
	//Instance Methods
	public void studentResult()
	{
		if(studentMarks >40) {
			System.out.println("Student Result : Pass ");
		}
		else {
			System.out.println("Student Result : Fail ");
		}
	}
	
	public void displayStudentDetails()
	{
		System.out.println("StudentId :"+studentId);
		System.out.println("StudentName :"+studentName);
		System.out.println("StudentMarks : "+studentMarks);
		System.out.println("StudentBatch : "+studentBatchCode);
		
	}

}