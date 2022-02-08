package homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class UserDAO {
	
	public UserDAO() {
	}
	
	public UserVO findUser(String name) {
		
		UserVO userVO = new UserVO();
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
				
		try {
			
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
		
			pStmt =	con.prepareStatement("SELECT * FROM uservo WHERE name=?");
			pStmt.setString(1,name);
		
			rs = pStmt.executeQuery();
			rs.next();
			
			userVO.setName(rs.getString(1));
			userVO.setGender(rs.getString(2));
			userVO.setBirthday(rs.getString(3));
			userVO.setPhonnumber(rs.getString(4));
			userVO.setAddress(rs.getString(5));
			userVO.setActive(true);
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pStmt != null) {
				try {pStmt.close();}catch(Exception e1) { }
			}
			if(con != null) {
				try {con.close();}catch(Exception e2) {	}
			}
			if(rs != null) {
				try {rs.close();}catch(Exception e2) {	}
			}
		}
			return userVO;
	}
	
	public void addUser(UserVO userVO) throws Exception {
		Connection con = null;
		PreparedStatement pStmt = null;
				
		try {
			
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
			
			pStmt =	con.prepareStatement("INSERT INTO uservo values(?,?,?||'.'||?||'.'||?,?,?)");
			pStmt.setString(1,userVO.getName());
			pStmt.setString(2,userVO.getGender());
			pStmt.setString(3,userVO.getBirthyear());
			pStmt.setString(4,userVO.getBirthmonth());
			pStmt.setString(5,userVO.getBirthday());
			pStmt.setString(6,userVO.getPhonnumber());
			pStmt.setString(7,userVO.getAddress());
			
			int rs = pStmt.executeUpdate();
			System.out.println("DB입력결과 : "+rs+"행이 입력 되었습니다.");
			
			if(rs == 1) {
				userVO.setActive(true);
			}else {
				userVO.setActive(false);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pStmt != null) {
				try {
					pStmt.close();
				}catch(Exception e1) {	}
			}
			if(con != null) {
				try {
					con.close();
				}catch(Exception e2) {	}
			}
		}
	}
}

