package homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddUser extends HttpServlet {
	
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
		
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setBirthyear(birthyear);
		userVO.setBirthmonth(birthmonth);		
		userVO.setBirthday(birthday);
		userVO.setPhonnumber(phonnumber);
		userVO.setAddress(address);
		
		System.out.println("UserVO에 등록된 정보 : "+userVO);
		
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.addUser(userVO);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login 화면</h2>");
		
		if(userVO.isActive()) {
			out.println("정보입력이 성공적으로 됐습니다.");
		}else {
			out.println("오류가 생겼습니다.");
		}
		
		HttpSession session = req.getSession(true);
		session.setAttribute("userVO",userVO);
		System.out.println("session 생성.. user정보 등록");
		
		out.println("<p><p><a href = 'homework/findUser.html'>내정보 보기1</a>");
		out.println("<p><p><a href = 'FindUser'>내정보 보기2</a>");
		out.println("<p><p><a href = 'homework/addUser.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
		
		