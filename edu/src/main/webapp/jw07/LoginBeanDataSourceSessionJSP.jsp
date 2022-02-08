<%@page contentType="text/html;charset=EUC-KR" %>

<%@page import="jw04.UserDataSourceDao"%>
<%@page import="jw04.UserVO"%>


<%
	request.setCharacterEncoding("EUC_KR");		
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	UserVO userVO = (UserVO)session.getAttribute("userVO");
	System.out.println("session에 저장된 UserVO 유무 확인 : "+userVO);
		
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
<h2>Login 화면</h2>
	<% if(userVO !=null && userVO.isActive()){ %>
		<%= userVO.getId() %> 님 환영합니다.
		<%
			session.setAttribute("userVO",userVO);
		%>
	<%}else{ %>
		Login 실패 id,pwd를 확인하세요.
	<%}%>
	
<p><p><a href = '/edu/jw07/loginBeanDataSourceSessionJSP.html'>뒤로</a>
</body>
</html>
		



