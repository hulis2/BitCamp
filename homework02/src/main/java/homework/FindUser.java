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
		System.out.println("입력받은 name : "+name);
		
		UserDAO userDAO = new UserDAO();
		UserVO userVO = userDAO.findUser(name);
		System.out.println("DB접속...name으로 user정보 검색");
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>User 정보</h2>");
		
		if(userVO.isActive()) {
			out.println("이름 : "+userVO.getName()+"\t성별 : "+userVO.getGender()+"\t생년월일 : "+userVO.getBirthday()+
					"\t전화번호 : "+userVO.getPhonnumber()+"\t주소 : "+userVO.getAddress());
		}else {
			out.println("User 정보가 없습니다.");
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
		System.out.println("session에 저장된 UserVO확인");
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>User 정보</h2>");
		
		if(userVO != null && userVO.isActive()){
			out.println("이름 : "+userVO.getName()+"\t성별 : "+userVO.getGender()+"\t생년월일 : "+userVO.getBirth()+
					"\t전화번호 : "+userVO.getPhonnumber()+"\t주소 : "+userVO.getAddress());
		}else {
			out.println("User 정보가 없습니다.");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
