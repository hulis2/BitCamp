package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PchUI extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

		req.setCharacterEncoding("EUC_KR");		
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String birthyear = req.getParameter("birthyear");
		String birthmonth = req.getParameter("birthmonth");
		String birthday = req.getParameter("birthday");
		String phonnumber = req.getParameter("phonnumber");
		String address = req.getParameter("address");
		
		//DbBean dbBean = new DbBean();
		//dbBean.setId(id);
		//dbBean.setPwd(pwd);
		
		//boolean isLogin = dbBean.getUser();
		
		PchVO pchVO = new PchVO();
		pchVO.setName(name);
		pchVO.setGender(gender);
		pchVO.setBirthyear(birthyear);
		pchVO.setBirthmonth(birthmonth);		
		pchVO.setBirthday(birthday);
		pchVO.setPhonnumber(phonnumber);
		pchVO.setAddress(address);
		
		PchSourceDao userDataSourceDao = new PchSourceDao();
		userDataSourceDao.getUser(pchVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login ȭ��</h2>");
		
		if(pchVO.isActive()) {
			out.println("�����Է��� ���������� �ƽ��ϴ�.");
		}else {
			out.println("������ ������ϴ�.");
		}
		
		out.println("<p><p><a href = '/edu/jw04/PchUI.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
		
		