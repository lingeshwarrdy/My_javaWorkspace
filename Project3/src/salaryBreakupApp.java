import java.util.Scanner;
public class salaryBreakupApp {
	public static void main(String[]args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int employeeId =sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name : ");
		String employeeName = sc.nextLine();
		
		System.out.println("Enrer Employee Basic Salary : ");
		double basicSalary =sc.nextDouble();
		
		double hra = 0.15*basicSalary;
		double pf = 0.05*basicSalary;
		double ta = 0.02*basicSalary;
		double esi = 0.025 *basicSalary;
		double pt = 200;
		
		double grossPay = basicSalary + hra  + pf + ta + esi+ pt;
		
		double netPay = (grossPay-(pf+pt));
		
		System.out.println("\nSalary Breakdown:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("TA: " + ta);
        System.out.println("ESI: " + esi);
        System.out.println("PT: " + pt);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Net Pay: " + netPay);
	}
	

}
