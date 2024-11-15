import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class updateEmployee {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        String driver, url, user, password;
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/edb12634";
        user = "root";
        password = "root";

        String updateQuery = "UPDATE employee SET name = ?, email = ?, mobile = ?, salary = ? WHERE id = ?";

        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the employee ID to update: ");
        int id = in.nextInt();
        
        System.out.println("Please enter name: ");
        String name = in.next();
        
        System.out.println("Please enter email: ");
        String email = in.next();
        
        System.out.println("Please enter mobile: ");
        long mobile = in.nextLong();
        
        System.out.println("Please enter salary: ");
        double salary = in.nextDouble();

        // Load Driver (optional in recent JDBC versions)
        Class.forName(driver);

        // Establish connection
        Connection con = DriverManager.getConnection(url, user, password);

        // Create PreparedStatement for the update query
        PreparedStatement st = con.prepareStatement(updateQuery);
        st.setString(1, name);
        st.setString(2, email);
        st.setLong(3, mobile);
        st.setDouble(4, salary);
        st.setInt(5, id);
        
        // Execute update query
        int status = st.executeUpdate();
        if (status >= 1) {
            System.out.println(" Successfully Updated...");
        } else {
            System.out.println(" Failed.. Try again.");
        }

        // Close resources
        st.close();
        con.close();
        in.close();
    }
}
