<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import =homework.* %>

<%
		request.setCharacterEncoding("EUC_KR");		
				
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String birthyear = request.getParameter("birthyear");
		String birthmonth = request.getParameter("birthmonth");
		String birthday = request.getParameter("birthday");
		String phonnumber = request.getParameter("phonnumber");
		String address = request.getParameter("address");
		
		homework.UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setGender(gender);
		userVO.setBirthyear(birthyear);
		userVO.setBirthmonth(birthmonth);		
		userVO.setBirthday(birthday);
		userVO.setPhonnumber(phonnumber);
		userVO.setAddress(address);
		
		System.out.println("UserVO에 등록된 정보 : "+userVO);
		
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.addUser(userVO);
		} catch (Exception e) {
			e.printStackTrace();
		}		
						
		
		
		HttpSession session = request.getSession(true);
		session.setAttribute("userVO",userVO);
		System.out.println("session 생성.. user정보 등록");
		
		
%>

<html>
<head></head>
<body>
<h2>Login 화면</h2>
	<% if(userVO.isActive()) { %>
		정보입력이 성공적으로 됐습니다.<br/>
		<% }else {  %>
			오류가 생겼습니다.<br/>
		<% } %>
<p><p><a href = 'homework/findUser.html'>내정보 보기1</a>
<p><p><a href = 'homework/findUser.jsp'>내정보 보기2</a>
<p><p><a href = 'homework/addUser.html'>뒤로</a>
</body>
</html>