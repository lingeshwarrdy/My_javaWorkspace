import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class update_DisplayEmployeeData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/edb12634";
        String user = "root";
        String password = "root";

        String selectQuery = "SELECT * FROM employee WHERE id = ?";
        String updateQuery = null;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the employee ID to update: ");
        int id = in.nextInt();

        // Load Driver (optional in recent JDBC versions)
        Class.forName(driver);

        // Establish connection
        Connection con = DriverManager.getConnection(url, user, password);
        
        // Check if the employee exists and display current data
        PreparedStatement selectSt = con.prepareStatement(selectQuery);
        selectSt.setInt(1, id);
        ResultSet rs = selectSt.executeQuery();
        
        if (!rs.next()) {
            System.out.println("Update Failed - Employee ID not found.");
            selectSt.close();
            con.close();
            return;
        } else {
            System.out.println("Current Employee Data:");
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Email: " + rs.getString("email"));
            System.out.println("Mobile: " + rs.getLong("mobile"));
            System.out.println("Salary: " + rs.getDouble("salary"));
        }
        selectSt.close();
        
        System.out.println("\n====================================\n");

        // Prompt user to choose a field to update
        System.out.println("Choose the field to update:");
        System.out.println("1. Name");
        System.out.println("2. Email");
        System.out.println("3. Mobile");
        System.out.println("4. Salary");

        int choice = in.nextInt();
        PreparedStatement updateSt = null;

        switch (choice) {
            case 1:
                System.out.println("Enter new name: ");
                String name = in.next();
                updateQuery = "UPDATE employee SET name = ? WHERE id = ?";
                updateSt = con.prepareStatement(updateQuery);
                updateSt.setString(1, name);
                updateSt.setInt(2, id);
                break;
            case 2:
                System.out.println("Enter new email: ");
                String email = in.next();
                updateQuery = "UPDATE employee SET email = ? WHERE id = ?";
                updateSt = con.prepareStatement(updateQuery);
                updateSt.setString(1, email);
                updateSt.setInt(2, id);
                break;
            case 3:
                System.out.println("Enter new mobile: ");
                long mobile = in.nextLong();
                updateQuery = "UPDATE employee SET mobile = ? WHERE id = ?";
                updateSt = con.prepareStatement(updateQuery);
                updateSt.setLong(1, mobile);
                updateSt.setInt(2, id);
                break;
            case 4:
                System.out.println("Enter new salary: ");
                double salary = in.nextDouble();
                updateQuery = "UPDATE employee SET salary = ? WHERE id = ?";
                updateSt = con.prepareStatement(updateQuery);
                updateSt.setDouble(1, salary);
                updateSt.setInt(2, id);
                break;
            default:
                System.out.println("Invalid choice.");
                con.close();
                in.close();
                return;
        }

        // Execute the update query
        int status = updateSt.executeUpdate();
        if (status >= 1) {
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Failed - Employee ID not found.");
        }
        updateSt.close();
        
        System.out.println("\n====================================\n");

        // Display the updated data
        selectSt = con.prepareStatement(selectQuery);
        selectSt.setInt(1, id);
        rs = selectSt.executeQuery();
        
        if (rs.next()) {
            System.out.println("Updated Employee Data:\n");
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Email: " + rs.getString("email"));
            System.out.println("Mobile: " + rs.getLong("mobile"));
            System.out.println("Salary: " + rs.getDouble("salary"));
        }
        
        // Close resources
        selectSt.close();
        con.close();
        in.close();
    }
}
