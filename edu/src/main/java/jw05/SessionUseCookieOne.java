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
 *	:: Client �� �ʿ������� �����ϴ� Cookie ���
*/
//@WebServlet("/CookieWriterToClient")
public class SessionUseCookieOne extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		HttpSession session = req.getSession();
		
		if(session.isNew()) {
			session.setAttribute("name", "������");
		}
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><head><title>sessiontest</title></head>");
		pw.println("<body>");
		pw.println("<center><h2>SessionUseCookieOne</h2></center>");
		
		System.out.println("name : "+session.getAttributeNames().nextElement());
		System.out.println("unique�� id : "+session.getId());
		
		if(session.isNew()) {
			pw.println("<span>������ ���� ������</span>");
		}else {
			pw.println("unique �� id : "+session.getId()+"�����");
		}
		
		pw.println("<hr>");
		pw.println("<a href = '/edu/SessionUseCookieTwo'>��ũ</a>");
		pw.println("</body></html>");
	}
}//end of class