package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
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
 *	:: Client �� �ʿ������� �����ϴ� Cookie ���
*/
//@WebServlet("/CookieWriterToClient")
public class SessionUseCookieTwo extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter pw = res.getWriter();
		
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(int i = 0; i<cookies.length; i++) {
					
				System.out.println(cookies[i].getName()+":  "+cookies[i].getValue());
				System.out.println();
				}
		}
		
		HttpSession session = req.getSession(false);
		
		
		pw.println("<html><head><title>sessiontest</title></head>");
		pw.println("<body>");
		pw.println("<center><h2>SessionUseCookieOne</h2></center>");
		if(session != null) {
			System.out.println("name : "+session.getAttributeNames().nextElement());
			System.out.println("unique�� id : "+session.getId());
			pw.print("�̸� : "+(String)session.getAttribute("name"));
		}else {
			pw.println("ó���Դϴ�.");
		}
		pw.println("</body></html>");
	}
}//end of class