import java.util.Scanner;

public class SalaryBreakUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        
        // Calculating components
        double hra = 0.15 * basicSalary; // HRA is 15% of basic salary
        double pf = 0.05 * basicSalary;  // PF is 5% of basic salary
        double ta = 0.02 * basicSalary;  // TA is 2% of basic salary
        double esi = 0.025 * basicSalary; // ESI is 2.5% of basic salary
        double pt = 200;  // PT is a fixed amount
        
        // Calculating gross and net pay
        double grossPay = basicSalary + hra + pf + ta + esi + pt;
        double netPay = grossPay - pf - pt;
        
        // Printing the output
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
        
        scanner.close();
    }
}
