<%@page import="jw.service.user.dao.UserDAO"%>
<%@page import="jw.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("EUC_KR");		
	UserVO userVO = new UserVO();	
	String name = request.getParameter("name");
	System.out.println("입력받은 name : "+name);
	
	if(name != null){		
		UserDAO userDAO = new UserDAO();
		userVO = userDAO.findUser(name);
		System.out.println("DB접속...name으로 user정보 검색");
	}else{	
		session = request.getSession(true);
		userVO = (UserVO)session.getAttribute("userVO");
		System.out.println("session에 저장된 UserVO확인");
	}
%>

<html>
<head></head>
<body>
<h2>User 정보</h2>
		
	<% if(userVO != null && userVO.isActive()){  %>
  		이름 : <%= userVO.getName() %><br/>
  		성별 : <%= userVO.getGender() %><br/>  
  		생년월일 : <%= userVO.getBirthyear() %>.<%= userVO.getBirthmonth() %>.<%= userVO.getBirthday() %><br/>
  		전화번호 : <%= userVO.getPhonnumber() %><br/>
  		주소 : <%= userVO.getAddress() %><br/>
	<% }else { %>
  		User 정보가 없습니다.
	<% } %><br/>
	<a href='updateUserView.jsp'>내정보수정</a>
</body>
</html>
