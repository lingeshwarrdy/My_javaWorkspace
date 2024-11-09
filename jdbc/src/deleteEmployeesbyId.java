import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deleteEmployeesbyId {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        String driver, url, user, password;
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/edb12634";
        user = "root";
        password = "root";

        String deleteQuery = "DELETE FROM employee WHERE id = ?";

        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the employee ID to delete: ");
        int id = in.nextInt();

        // Load Driver (optional in recent JDBC versions)
        Class.forName(driver);

        // Establish connection
        Connection con = DriverManager.getConnection(url, user, password);

        // Create PreparedStatement for the delete query
        PreparedStatement st = con.prepareStatement(deleteQuery);
        st.setInt(1, id);

        // Execute delete query
        int status = st.executeUpdate();
        if (status >= 1) {
            System.out.println(" Successfully Deleted... ");
        } else {
            System.out.println(" Failed !... Try again. ");
        }

        // Close resources
        st.close();
        con.close();
        in.close();
    }
}
