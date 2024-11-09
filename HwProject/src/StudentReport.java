import java.util.Scanner;

public class StudentReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[6];  // Array to store marks of 6 subjects

        // Input marks for 6 subjects
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Create an instance of ReportCalculator to use its methods
        ReportCalculator calculator = new ReportCalculator();

        // Calculate total, average, highest, and lowest marks
        int total = calculator.calculateTotal(marks);
        double average = calculator.calculateAverage(marks);
        int highest = calculator.findHighest(marks);
        int lowest = calculator.findLowest(marks);

        // Print the report
        System.out.println("\nStudent Report:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);


    }
}
