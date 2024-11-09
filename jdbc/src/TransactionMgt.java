import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionMgt {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver, url, user,password;
		driver="com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/db12634";
		user="root";
		password="root";
		
		String query1 ="update account set balance =balance-3250 where accno=112233;";
		String query2 ="update account set balance =balance+3250 where accno=445566;";
		
		
		Class.forName(driver);
		Connection con =DriverManager.getConnection(url,user,password);
		
		//1.Disable auto commit
		con.setAutoCommit(false);
		
		Statement st =con.createStatement();
		
		//2. Add to batch
		st.addBatch(query1);
		st.addBatch(query2);
		
		//3. Execute batch
		int[] result = st.executeBatch();
		
		//4.Commit or RollBack
		
		if(result[0]==1 && result[1]==1) {
			con.commit();
			System.out.println(" Transaction is Sucessfull ");
		}
		else {
			con.rollback();
			System.out.println(" Tansaction is failed ");
		}
		
		st.close();
		con.close();
	
		
		
		
	}

}
