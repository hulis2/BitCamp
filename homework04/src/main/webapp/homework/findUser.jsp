<%@page import="jw.service.user.dao.UserDAO"%>
<%@page import="jw.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("EUC_KR");		
	UserVO userVO = new UserVO();	
	String name = request.getParameter("name");
	System.out.println("�Է¹��� name : "+name);
	
	if(name != null){		
		UserDAO userDAO = new UserDAO();
		userVO = userDAO.findUser(name);
		System.out.println("DB����...name���� user���� �˻�");
	}else{	
		session = request.getSession(true);
		userVO = (UserVO)session.getAttribute("userVO");
		System.out.println("session�� ����� UserVOȮ��");
	}
%>

<html>
<head></head>
<body>
<h2>User ����</h2>
		
	<% if(userVO != null && userVO.isActive()){  %>
  		�̸� : <%= userVO.getName() %><br/>
  		���� : <%= userVO.getGender() %><br/>  
  		������� : <%= userVO.getBirthyear() %>.<%= userVO.getBirthmonth() %>.<%= userVO.getBirthday() %><br/>
  		��ȭ��ȣ : <%= userVO.getPhonnumber() %><br/>
  		�ּ� : <%= userVO.getAddress() %><br/>
	<% }else { %>
  		User ������ �����ϴ�.
	<% } %><br/>
	<a href='updateUserView.jsp'>����������</a>
</body>
</html>
