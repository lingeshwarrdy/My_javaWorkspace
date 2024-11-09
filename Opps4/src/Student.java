
public class Student {
	private int studentId;
	private String studentName;
	private String studentEmailId;	
	private long studentMobile;


	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName,String studentEmailId, long studentMobile) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmailId=studentEmailId;
		this.studentMobile = studentMobile;
		
	}
	
	//Setter and getter methods

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmailId() {
		return studentEmailId;
	}

	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	

}
