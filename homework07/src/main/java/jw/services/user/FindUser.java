package jw.services.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jw.services.user.dao.UserDAO;
import jw.services.user.vo.UserVO;

public class FindUser extends HttpServlet {
	
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
		
		////////////////////////  Session ������� �߰��� �κ� ///////////////////////////////////////
		//==>id�� null�ΰ��� ?
		//==><a href='/homework03/FindUser'>����������2(session���)</a>
		if(id == null){
			//==>  Session�� ����� userVO instance �� id ���
			HttpSession session = req.getSession(true);
			id =  ( (UserVO)session.getAttribute("userVO")).getId();
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//DB�� �����ϴ� UserDAO�� �̿� ȸ������ select ��
		UserDAO bean = new UserDAO();
		//==> ȸ���� ������ ���� userVO intance�� �ޱ�
		UserVO userVO = bean.findUser(id);

		out.println("<html>");
		out.println("<body>");
		
		out.println("<h2>��û�Ͻ� ȸ������</h2>");
        
		if(userVO != null){
            out.println("no  : "+ userVO.getNo()+" <br/>");
            out.println("id   : "+ userVO.getId()+" <br/>");
            out.println("pwd : "+ userVO.getPwd()+" <br/>");
		}else{
			out.println(id +"�� �ش��ϴ� data�� �����ϴ�.<br/>");
		}

		out.println("</boyd>");
		out.println("</html>");
	}
}