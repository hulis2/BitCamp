<%@page import="jw.service.user.dao.UserDAO"%>
<%@page import="jw.service.user.vo.UserVO"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
		request.setCharacterEncoding("EUC_KR");
				
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String birthyear = request.getParameter("birthyear");
		String birthmonth = request.getParameter("birthmonth");
		String birthday = request.getParameter("birthday");
		String phonnumber = request.getParameter("phonnumber");
		String address = request.getParameter("address");
		
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setBirthyear(birthyear);
		userVO.setBirthmonth(birthmonth);		
		userVO.setBirthday(birthday);
		userVO.setPhonnumber(phonnumber);
		userVO.setAddress(address);
		
		System.out.println("UserVO�� ��ϵ� ���� : "+userVO);
		
		UserDAO userDAO= new UserDAO();
		try {
			userDAO.addUser(userVO);
		} catch (Exception e) {
			e.printStackTrace();
		}		
				
		session = request.getSession(true);
		session.setAttribute("userVO",userVO);
		System.out.println("session ����.. user���� ���");
		
%>
<html>
<head></head>
<body>
<h2>Login ȭ��</h2>
	<% if(userVO.isActive()) { %>
		�����Է��� ���������� �ƽ��ϴ�.<br/>
		<% }else {  %>
			������ ������ϴ�.<br/>
		<% } %>
<p><p><a href = 'findUserView.jsp'>������ ����1</a>
<p><p><a href = 'findUser.jsp'>������ ����2</a>
<p><p><a href = 'addUserView.jsp'>�ڷ�</a>
</body>
</html>