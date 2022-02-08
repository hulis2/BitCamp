<%@page import="spring.model1.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<% UserVO userVO = (UserVO)session.getAttribute("userVO"); %>

<% if(userVO == null || !userVO.isActive()) {%>
	<jsp:forward page="logon.jsp" />
<% } %>

<html>
<head></head>
<body>
	<p>Simple Model2 Examples</p>
	<p>환영합니다. : <%= userVO.getUserId()%>님</p>
</body>
</html>