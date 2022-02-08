package jw04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserInitParamDao {
	
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPasswd;
	
	public UserInitParamDao() {
	}
	
	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}

	public void setJddbURL(String jddbURL) {
		this.jdbcURL = jddbURL;
	}

	public void setJddbUser(String jddbUser) {
		this.jdbcUser = jddbUser;
	}

	public void setJddbPasswd(String jddbPasswd) {
		this.jdbcPasswd = jddbPasswd;
	}

	public void getUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPasswd);
			
			pStmt =	con.prepareStatement("SELECT id, pwd FROM users WHERE id=? AND pwd=?");
			pStmt.setString(1,userVO.getId());
			pStmt.setString(2,userVO.getPwd());
			
			rs = pStmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("db에서 확인 한 id,pwd ==> : "+userVO.getId()+" : "+userVO.getPwd());
				userVO.setActive(true);
			}else {
				System.out.println("db에 <"+userVO.getId()+">에 해당하는 자료가 없습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
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
