package homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FindUser extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		req.setCharacterEncoding("EUC_KR");		
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		System.out.println("�Է¹��� name : "+name);
		
		UserDAO userDAO = new UserDAO();
		UserVO userVO = userDAO.findUser(name);
		System.out.println("DB����...name���� user���� �˻�");
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>User ����</h2>");
		
		if(userVO.isActive()) {
			out.println("�̸� : "+userVO.getName()+"\t���� : "+userVO.getGender()+"\t������� : "+userVO.getBirthday()+
					"\t��ȭ��ȣ : "+userVO.getPhonnumber()+"\t�ּ� : "+userVO.getAddress());
		}else {
			out.println("User ������ �����ϴ�.");
		}
		out.println("</body>");
		out.println("</html>");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		req.setCharacterEncoding("EUC_KR");		
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
			
		HttpSession session = req.getSession(true);
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		System.out.println("session�� ����� UserVOȮ��");
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>User ����</h2>");
		
		if(userVO != null && userVO.isActive()){
			out.println("�̸� : "+userVO.getName()+"\t���� : "+userVO.getGender()+"\t������� : "+userVO.getBirth()+
					"\t��ȭ��ȣ : "+userVO.getPhonnumber()+"\t�ּ� : "+userVO.getAddress());
		}else {
			out.println("User ������ �����ϴ�.");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
