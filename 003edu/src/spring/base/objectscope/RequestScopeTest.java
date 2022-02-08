package spring.base.objectscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RequestScopeTest extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
											throws ServletException, IOException{
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		Integer count = (Integer)request.getAttribute("count");
		
		
		if(count == null){
			out.println(" :: Browser 켜고 1 번째 방문 ::");
			request.setAttribute("count",new Integer(1));
		}else{
			int changeCount = count.intValue()+1;
			out.println(":: Browser 켜고 "+changeCount+" 번째 방문 ::");

			request.setAttribute("count",new Integer(changeCount) );
		}
	}
}
