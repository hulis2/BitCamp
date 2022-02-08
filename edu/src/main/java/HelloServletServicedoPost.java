import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class HelloServletServicedoPost extends HttpServlet{


public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	this.doPost(req,res);
}
	//Client request �� ���� ȣ��Ǵ� service() method
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("doPost()���� : " );
		System.out.println("Request Client IP : " + req.getRemoteAddr()) ;

		//res.setContentType("text/html");
		res.setContentType("text/html;charset=EUC_KR");

		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<html><title>hello Servlet</title></head>");
		out.println("<body>");
		out.println("English : HelloServlet");
		out.println("<p>");
		out.println("Koera : ��� ����");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

		System.out.println(":: servlet service()����\n");
	}

}//end of class