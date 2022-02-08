package jw.service.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jw.common.dao.AbstractDao;
import jw.service.user.vo.UserVO;

public class UserDAO extends AbstractDao{
	
	public UserDAO() {
	}
	
	public UserVO findUser(String name) {
		
		UserVO userVO = new UserVO();
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
				
		try {
			
			con = this.connect();
		
			pStmt =	con.prepareStatement("SELECT * FROM uservo WHERE name=?");
			pStmt.setString(1,name);
		
			rs = pStmt.executeQuery();
			rs.next();
			
			userVO.setName(rs.getString(1));
			userVO.setGender(rs.getString(2));
			userVO.setBirthyear(rs.getString(3));
			userVO.setBirthmonth(rs.getString(4));
			userVO.setBirthday(rs.getString(5));
			userVO.setPhonnumber(rs.getString(6));
			userVO.setAddress(rs.getString(7));
			userVO.setActive(true);
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.close(con, pStmt, rs);
		}
			return userVO;
	}
	
	public void addUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
				
		try {
			
			con = this.connect();
			
			pStmt =	con.prepareStatement("INSERT INTO uservo values(?,?,?,?,?,?,?)");
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
			this.close(con,pStmt);
		}
	}
	
	public void updateUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
				
		try {
			
			con = this.connect();
			
			pStmt =	con.prepareStatement("UPDATE uservo "+ "set gender=?"
					+",birthyear=?,birthmonth=?,birthday=?,phonenumber=?,Address=?"
					+ "where name=?");
			pStmt.setString(1,userVO.getGender());
			pStmt.setString(2,userVO.getBirthyear());
			pStmt.setString(3,userVO.getBirthmonth());
			pStmt.setString(4,userVO.getBirthday());
			pStmt.setString(5,userVO.getPhonnumber());
			pStmt.setString(6,userVO.getAddress());
			pStmt.setString(7,userVO.getName());
			
			int rs = pStmt.executeUpdate();
			System.out.println("DB입력결과 : "+rs+"행이 수정 되었습니다.");
			
			if(rs == 1) {
				userVO.setActive(true);
			}else {
				userVO.setActive(false);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.close(con,pStmt);
		}
	}
}

