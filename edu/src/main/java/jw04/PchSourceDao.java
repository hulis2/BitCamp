package jw04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PchSourceDao {
	
	//String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//String dbuser ="scott";
	//String dbpwd = "tiger";
	
	public PchSourceDao() {
	}
	
	public void getUser(PchVO pchVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
				
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			
			//con = OracleConnectionPool.getInstance().getConnection();
			
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
			
			pStmt =	con.prepareStatement("INSERT INTO test values(?,?,?||.?||.?,?,?)");
			pStmt.setString(1,pchVO.getName());
			pStmt.setString(2,pchVO.getGender());
			pStmt.setString(3,pchVO.getBirthyear());
			pStmt.setString(4,pchVO.getBirthmonth());
			pStmt.setString(5,pchVO.getBirthday());
			pStmt.setString(4,pchVO.getPhonnumber());
			pStmt.setString(5,pchVO.getAddress());
			
			int rs = pStmt.executeUpdate();
			
			if(rs == 1) {
				pchVO.setActive(true);
			}else {
				pchVO.setActive(false);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pStmt != null) {
				try {
					pStmt.close();
				}catch(Exception e1) {	}
			}
			if(pStmt != null) {
				try {
					pStmt.close();
				}catch(Exception e2) {	}
			}
			if(con != null) {
				try {
					con.close();
				}catch(Exception e3) {	}
			}
		}
	}
}
