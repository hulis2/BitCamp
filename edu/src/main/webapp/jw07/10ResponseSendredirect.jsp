<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<body>
	::10ResponseSendRedirect.jsp ���� <br/>
	
	<% request.setAttribute("aaa",new String("�����")); %>
	<% response.sendRedirect("09JSPActionForward.jsp"); %>
	
	::10ResponseSendRedirect.jsp ��<br/>
</body>
</html>