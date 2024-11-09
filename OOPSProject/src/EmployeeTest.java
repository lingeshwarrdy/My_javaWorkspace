
public class EmployeeTest {
	public static void main(String[] args) {
		Address employeeAddress =new Address("Hyderabad","TG","India");
		Employee emp =new Employee(1001,"Sai",8309550152l,employeeAddress);
		emp.displayEmployee();

		
	}
	
}
