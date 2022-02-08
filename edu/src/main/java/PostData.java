import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class PostData extends HttpServlet{

	//Client request �� ���� ȣ��Ǵ� service() method
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
		out.println("<li>�̸� : " + clientName );
		out.println("<li>�ּ� : " + clientAddr );

		out.println("<p><p><a href = '/edu/PostData.html'>�ڷ�</a>");

		out.println("</body>");
		out.println("</html>");
	
	
	
	}
}//end of class