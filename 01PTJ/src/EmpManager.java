import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmpManager {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException {
		new EmpManager().printEmployee("South San Francisco", 7000, 10000);
	}
	
	public void printEmployee(String city, int lo, int hi) throws SQLException{
		
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(dburl,"hr","hr");
		PreparedStatement pstmt = conn.prepareStatement("SELECT\r\n"+
				"E.LAST_NAME, D.DEPARTMENT_NAME\r\n"+
				"FROM LOCATIONS L, EMPLOYEES E, DEPARTMENTS D\r\n"+
				"WHERE L.LOCATION_ID = D.LOCATION_ID AND E.DEPARTMENT_ID = D.DEPARTMENT_ID\r\n"+
				"AND E.SALARY BETWEEN ? AND ? AND L.CITY = ?");
		
		pstmt.setInt(1, lo);
		pstmt.setInt(2, hi);
		pstmt.setString(3, city);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString(1);
			String DepartmentName = rs.getString(2);
						
			System.out.println(name+"   \t"+DepartmentName);
		}
		rs.close();
		pstmt.close();
		conn.close();
		
	}

}
