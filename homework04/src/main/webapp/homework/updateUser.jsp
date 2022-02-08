<%@ page import="jw.service.user.vo.UserVO" %>   
<%@ page import="jw.service.user.dao.UserDAO" %>

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
	
	UserDAO userDAO= new UserDAO();
	userDAO.updateUser(userVO);
	
	session = request.getSession(true);
	session.setAttribute("userVO",userVO);
	System.out.println("session 에 있는 user정보 수정");
%>
<html>
<head></head>
<body>
<h2>회원정보 수정 결과</h2>
	<% if(userVO.isActive()) { %>
		정보수정이 성공적으로 됐습니다.<br/>
		<% }else {  %>
			오류가 생겼습니다.<br/>
		<% } %>

<p><p><a href = 'findUser.jsp'>내정보 보기2</a>
<p><p><a href = 'updateUserView.jsp'>뒤로</a>
</body>
</html>