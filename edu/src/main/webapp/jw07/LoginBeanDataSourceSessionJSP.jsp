<%@page contentType="text/html;charset=EUC-KR" %>

<%@page import="jw04.UserDataSourceDao"%>
<%@page import="jw04.UserVO"%>


<%
	request.setCharacterEncoding("EUC_KR");		
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	UserVO userVO = (UserVO)session.getAttribute("userVO");
	System.out.println("session�� ����� UserVO ���� Ȯ�� : "+userVO);
		
	if(!(id==null || id.equals(""))){
		userVO = new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		UserDataSourceDao userDataSourceDao = new UserDataSourceDao();
		userDataSourceDao.getUser(userVO);
	}
%>
		
<html>
<head></head>
<body>
<h2>Login ȭ��</h2>
	<% if(userVO !=null && userVO.isActive()){ %>
		<%= userVO.getId() %> �� ȯ���մϴ�.
		<%
			session.setAttribute("userVO",userVO);
		%>
	<%}else{ %>
		Login ���� id,pwd�� Ȯ���ϼ���.
	<%}%>
	
<p><p><a href = '/edu/jw07/loginBeanDataSourceSessionJSP.html'>�ڷ�</a>
</body>
</html>
		



