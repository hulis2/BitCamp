package homework;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PchSourceDao {
	
	public PchSourceDao() {
	}
	
	public void getUser(PchVO pchVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
				
		try {
			
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
			
			pStmt =	con.prepareStatement("INSERT INTO pch values(?,?,?||'.'||?||'.'||?,?,?)");
			pStmt.setString(1,pchVO.getName());
			pStmt.setString(2,pchVO.getGender());
			pStmt.setString(3,pchVO.getBirthyear());
			pStmt.setString(4,pchVO.getBirthmonth());
			pStmt.setString(5,pchVO.getBirthday());
			pStmt.setString(6,pchVO.getPhonnumber());
			pStmt.setString(7,pchVO.getAddress());
			
			int rs = pStmt.executeUpdate();
			System.out.println(rs);
			
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
