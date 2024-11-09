import java.util.Scanner;

// Class to handle the calculations
class ReportCalculator {

    // Method to calculate total marks
    public int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate average marks
    public double calculateAverage(int[] marks) {
        int total = calculateTotal(marks);
        return total / (double) marks.length;
    }

    // Method to find the highest mark
    public int findHighest(int[] marks) {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    // Method to find the lowest mark
    public int findLowest(int[] marks) {
        int lowest = marks[0];
        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }
}
