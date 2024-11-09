import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class updateEmployeewithonefield {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/edb12634";
        String user = "root";
        String password = "root";

        String checkQuery = "SELECT * FROM employee WHERE id = ?";
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the employee ID to update: ");
        int id = in.nextInt();

        // Load Driver (optional in recent JDBC versions)
        Class.forName(driver);

        // Establish connection
        Connection con = DriverManager.getConnection(url, user, password);
        
        // Check if the employee exists
        PreparedStatement checkSt = con.prepareStatement(checkQuery);
        checkSt.setInt(1, id);
        ResultSet rs = checkSt.executeQuery();
        
        if (!rs.next()) {
            System.out.println("Update Failed - Employee ID not found.");
            checkSt.close();
            con.close();
            return;
        }
        checkSt.close();

        System.out.println("Choose the field to update:");
        System.out.println("1. Name");
        System.out.println("2. Email");
        System.out.println("3. Mobile");
        System.out.println("4. Salary");

        int choice = in.nextInt();
        String updateQuery = null;
        PreparedStatement st = null;

        switch (choice) {
            case 1:
                System.out.println("Enter new name: ");
                String name = in.next();
                updateQuery = "UPDATE employee SET name = ? WHERE id = ?";
                st = con.prepareStatement(updateQuery);
                st.setString(1, name);
                st.setInt(2, id);
                break;
            case 2:
                System.out.println("Enter new email: ");
                String email = in.next();
                updateQuery = "UPDATE employee SET email = ? WHERE id = ?";
                st = con.prepareStatement(updateQuery);
                st.setString(1, email);
                st.setInt(2, id);
                break;
            case 3:
                System.out.println("Enter new mobile: ");
                long mobile = in.nextLong();
                updateQuery = "UPDATE employee SET mobile = ? WHERE id = ?";
                st = con.prepareStatement(updateQuery);
                st.setLong(1, mobile);
                st.setInt(2, id);
                break;
            case 4:
                System.out.println("Enter new salary: ");
                double salary = in.nextDouble();
                updateQuery = "UPDATE employee SET salary = ? WHERE id = ?";
                st = con.prepareStatement(updateQuery);
                st.setDouble(1, salary);
                st.setInt(2, id);
                break;
            default:
                System.out.println("Invalid choice.");
                con.close();
                in.close();
                return;
        }

        // Execute the update query
        int status = st.executeUpdate();
        if (status >= 1) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed - Employee ID not found.");
        }

        // Close resources
        st.close();
        con.close();
        in.close();
    }
}
