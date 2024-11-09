// Define Employee class
class Employee {
    String name;
    double salary;
    
    // Method to calculate income tax based on salary
    public double calculateTax() {
        double tax = 0;
        if (salary <= 250000) {
            tax = 0;
        } else if (salary <= 500000) {
            tax = (salary - 250000) * 0.05;
        } else if (salary <= 1000000) {
            tax = (salary - 500000) * 0.2 + 250000 * 0.05;
        } else {
            tax = (salary - 1000000) * 0.3 + 500000 * 0.2 + 250000 * 0.05;
        }
        return tax;
    }
    
    // Method to display the employee's details and tax information
    public void displayTaxDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Income Tax: " + calculateTax());
    }
}

// Main class to run the program
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();
        
        // Directly assign values to name and salary
        emp.name = "John Doe";   // Example name
        emp.salary = 750000;     // Example salary
        
        // Display tax details
        emp.displayTaxDetails();
    }
}
