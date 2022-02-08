<%@page import="jw.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	UserVO userVO = (UserVO)session.getAttribute("userVO");
	if(userVO == null){
		userVO = new UserVO();
	}
%>

<% if(! userVO.isActive()){ %>
	<jsp:include page="../jw07/login.html"/>
	<br/><br/>
	<a href="/edu/jw07/addUser.html">ȸ������...</a>
<% }else{ %>
	<%= userVO.getId() %>�� �α��� �ϼ̽��ϴ�.
	<br/><br/>
	<form method="post" action="<%= request.getRequestURL() %>" >
		URL : <%= request.getRequestURL() %><br/>
		URI : <%= request.getRequestURI() %><br/>
			<input type = "submit" value="Logout" />
	</form>
	<br/><br/>
<% } %>

<%
	if(request.getMethod().equals("POST")){
		//session.invalidate();
		//session.removeAttribute("userVO");
		userVO.setActive(false);
		response.sendRedirect("/edu/jw07/logout.jsp");
	}
%>