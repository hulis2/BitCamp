<%@page import="spring.model1.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<%
	UserVO userVO = (UserVO)session.getAttribute("userVO");
%>
<html>
<head></head>
<body>

	<% if(userVO == null || userVO.isActive() != true) {%>
		<form id="login" method="post" action="/011model1/user/logonAction.jsp">
		
			�� �� �� : <input id="userID" type="text" name="userId" value=""><br/><br/>
			�н����� : <input id="userID" type="text" name="userPasswd" value=""><br/><br/>
			<input id = "submit" type="submit" name="submit" value="Enter" />
		
		</form>
		
	<%}else{%>
	
		<%= userVO.getUserId() %>���� �̹� �α��� �ϼ̽��ϴ�.
	
	<% } %>

</body>
</html>