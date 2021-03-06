<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import="jw.services.user.vo.UserVO" %>   
<%@ page import="jw.services.user.dao.UserDAO" %>

<%
	request.setCharacterEncoding("EUC_KR");
	
	//client에서 넘어온 값을 받자.
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	int no = Integer.parseInt(request.getParameter("no"));
	
	//Client에 받은 data로 UserVO instance 생성 및 Value set
	UserVO userVO = new UserVO();
	userVO.setId(id);
	userVO.setPwd(pwd);
	userVO.setNo(no);
	
	//DB에 접근하는 UserDAO를 이용 회원정보 Insert
	UserDAO userDAO = new UserDAO();
	userDAO.addUser(userVO);
%>

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>Insert title here</title>
	</head>
	<body>
	
	<h2>회원가입</h2>
	
	<%if( userVO.isActive() ){  %>
	    <%= userVO.getId()  %> 님 환영합니다.<br/>
	    <% //==> 회원가입완료되면... userVO instance session 에 저장
		    request.getSession(true).setAttribute("userVO", userVO);
	    %>
	<% }else{  %>
	    	다시가입해 주세요.<br/>
	<% }  %>
	
	<p><p><a href='/homework07/jsp01/findUserView.jsp'>내정보보기1(id 입력)</a>
	<p><p><a href='/homework07/jsp01/findUser.jsp'>내정보보기2(session사용)</a>
	</boyd>
	
</html>