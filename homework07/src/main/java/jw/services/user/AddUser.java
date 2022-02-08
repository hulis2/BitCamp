package jw.services.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jw.services.user.dao.UserDAO;
import jw.services.user.vo.UserVO;

public class AddUser extends HttpServlet {
	
	//doGet() Overriding
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	//doPost() Overriding
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client���� �Ѿ�� ���� ����.
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		int no = Integer.parseInt(req.getParameter("no"));
		
		//Client�� ���� data�� UserVO instance ���� �� Value set
		UserVO userVO = new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		userVO.setNo(no);
		
		//DB�� �����ϴ� UserDAO�� �̿� ȸ������ Insert
		UserDAO bean = new UserDAO();
		bean.addUser(userVO);

		out.println("<html>");
		out.println("<body>");
		
		out.println("<h2>ȸ������</h2>");
        
        // insert ������ ����...
		if( userVO.isActive() ){
            out.println(userVO.getId()+"�� ȯ���մϴ�.<br/>");
            //////////////////Session ������� �߰��� �κ�/////////////////////////////////
            //==> ȸ�����ԿϷ�Ǹ�... userVO instance session �� ����
            req.getSession(true).setAttribute("userVO", userVO);
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
            
        }else{
            out.println("�ٽð����� �ּ���.<br/>");
        }

		out.println("<p><p><a href='/homework04/servlet/findUser.html'>����������(id �Է�)</a>");
		out.println("<p><p><a href='/homework04FindUser'>����������2(session���)</a>");
		out.println("</boyd>");
		out.println("</html>");
	}
}//end of class