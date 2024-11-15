class Employee{
	int employeeId;
	String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	@Override
	public void finalize() {
		System.out.println("finalize()");
	}
	
}
public class FinalizeMethodDemo {
	public static void main(String[] args) {
		Employee e1 =new Employee(1001, "Sai");
		Employee e2 =new Employee(1002, "Ram");
		
		System.out.println(e1);
		System.out.println(e2);
		
		e1=e2; //1.Assigning one reference to another reference (is eligible for garbage collection)
		
		System.out.println("--------------------");
		System.out.println(e1);
		System.out.println(e2);
		
		// Anonymous object
		new Employee (1003,"Java"); //2.anonymous object are eligible for garbage collection  
		
		Employee e3 = new Employee(1004, "Code");
		e3=null; //3.Nullifying the reference (is eligible for garbage collection)
		
		// Request JVM to call Garbage collector 
		System.gc();
	}

}
