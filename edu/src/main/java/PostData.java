import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	ㅇ Servlet Life Cycle  이해 및 확인
*/
public class PostData extends HttpServlet{

	//Client request 시 마다 호출되는 service() method
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{

		req.setCharacterEncoding("EUC_KR");

		//res.setContentType("text/html");
		res.setContentType("text/html;charset=EUC_KR");

		PrintWriter out = res.getWriter();

		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

	

		System.out.println(clientName + " : " + clientAddr );

		out.println("<html>");
		out.println("<html><title>PostData.java</title></head>");
		out.println("<body>");

		out.println("<h2>Post Test</h2>");
		out.println("<li>이름 : " + clientName );
		out.println("<li>주소 : " + clientAddr );

		out.println("<p><p><a href = '/edu/PostData.html'>뒤로</a>");

		out.println("</body>");
		out.println("</html>");
	
	
	
	}
}//end of class