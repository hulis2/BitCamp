<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<body>
	::10ResponseSendRedirect.jsp 시작 <br/>
	
	<% request.setAttribute("aaa",new String("연결됨")); %>
	<% response.sendRedirect("09JSPActionForward.jsp"); %>
	
	::10ResponseSendRedirect.jsp 끝<br/>
</body>
</html>