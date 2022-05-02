import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		//Load the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create connection
		String url="jdbc:mysql://localhost:3306/emp";
		String user="root";
		String password="root";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, user, password);
			if(con!=null) {
				System.out.println("Connected .....");
			}
			st=con.createStatement();
			String query="Select * from employee";
			rs=st.executeQuery(query);
			
			ResultSetMetaData rsm=rs.getMetaData();
			int c=rsm.getColumnCount();
			System.out.println("Column count "+c);
			while(rs.next()) {
				for(int i=1;i<=c;i++) {
					System.out.print(rs.getString(i)+" ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------------------------------------");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
				//OR
				//System.out.println(rs.getString("empno"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
