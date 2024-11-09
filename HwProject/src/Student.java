public class Student {
    private int studentID;
    private String studentName;
    private Course[] enrolledCourses;

    public Student(int studentID, String studentName, Course[] enrolledCourses) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.enrolledCourses = enrolledCourses;
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("---------------");
        System.out.println(" Student ID: " + studentID);
        System.out.println(" Student Name: " + studentName);

        System.out.println("\nEnrolled Courses:");
        System.out.println("-----------------");
        for (Course course : enrolledCourses) {
            course.displayCourseDetails();
            System.out.println();
        }
    }
}
