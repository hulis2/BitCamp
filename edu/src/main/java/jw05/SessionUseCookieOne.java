package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * FileName : CookieWriterToClient.java
 *	:: Client 에 필요정보를 저장하는 Cookie 사용
*/
//@WebServlet("/CookieWriterToClient")
public class SessionUseCookieOne extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		HttpSession session = req.getSession();
		
		if(session.isNew()) {
			session.setAttribute("name", "임준희");
		}
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><head><title>sessiontest</title></head>");
		pw.println("<body>");
		pw.println("<center><h2>SessionUseCookieOne</h2></center>");
		
		System.out.println("name : "+session.getAttributeNames().nextElement());
		System.out.println("unique한 id : "+session.getId());
		
		if(session.isNew()) {
			pw.println("<span>세션이 새로 생성됨</span>");
		}else {
			pw.println("unique 한 id : "+session.getId()+"사용중");
		}
		
		pw.println("<hr>");
		pw.println("<a href = '/edu/SessionUseCookieTwo'>링크</a>");
		pw.println("</body></html>");
	}
}//end of class