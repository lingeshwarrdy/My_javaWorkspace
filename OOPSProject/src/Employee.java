
public class Employee {
	int employeeId;
	String employeeName;
	long employeeMobile;
	Address  employeeAddress;  //Entity Reference  it is called composition

	public Employee(int employeeId, String employeeName, long employeeMobile, Address employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMobile = employeeMobile;
		this.employeeAddress = employeeAddress;
	}
	
	public void displayEmployee()
	{
		System.out.println("EmployeeId is : "+employeeId);
		System.out.println("EmployeeName is : "+employeeName);
		System.out.println("EmployeeMobile No is  : "+employeeMobile);
		employeeAddress.displayAddress();
		
	}

}

  