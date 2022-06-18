package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inserting values in MySql DB");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "jdbc_example";
		String driver = "com.mysql.cj.jdbc.Driver";
		System.out.println(url+db);
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url + db, "root", "root");
			//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_example", "root", "root");
			
			System.out.println(conn);
			
			try {
				Statement st = conn.createStatement();
				String sql = "INSERT employee (id,name,salary) VALUES(" + 2 + ","
						+ "'Deepaki Kumar'," + "1000)";
				System.out.println(sql);
				int val = st.executeUpdate(sql);
				System.out.println("1 row affected");				
			}
			catch(SQLException s){
				System.out.println("Sql statement! not executed " + s.getMessage());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				

	}

}
