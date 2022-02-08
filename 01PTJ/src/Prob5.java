import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prob5 {

	public static void main(String[] args) throws Exception {
		printEmployeeList("south","it");
	}
	
	private static void printEmployeeList(String cityName, String deptName) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(dburl,"hr","hr");
		PreparedStatement pstmt = conn.prepareStatement("SELECT\r\n"+
				"L.CITY, D.department_name, E.FIRST_NAME, E.SALARY\r\n"+
				"FROM locations L, departments D, employees E\r\n"+
				"WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID AND D.location_ID = L.location_ID \r\n"
				+ "AND LOWER(L.CITY) like LOWER(?)\r\n"+
				"AND LOWER(D.department_name) like LOWER(?)");
		
		pstmt.setString(1,"%"+cityName+"%");
		pstmt.setString(2,"%"+deptName+"%");
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String city = rs.getString(1);
			String departmentName = rs.getString(2);
			String firstName = rs.getString(3);
			String salary = rs.getString(4);
						
			System.out.println(city+"\t"+departmentName+"\t"+firstName+"\t"+salary);
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
}
