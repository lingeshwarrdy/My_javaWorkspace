public class UniversityTest {
    public static void main(String[] args) {
        // Create Course objects
        Course course1 = new Course("CS101", "Introduction to Computer Science", 3);
        Course course2 = new Course("MATH201", "Calculus II", 4);
        Course course3 = new Course("PHYS101", "Physics I", 4);

        // Array of courses for the student
        Course[] courses = { course1, course2, course3 };

        // Create a Student object
        Student student = new Student(1001, "Alice Johnson", courses);

        // Display Student details along with their enrolled courses
        student.displayStudentDetails();
    }
}
