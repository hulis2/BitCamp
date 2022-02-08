<%@ page import="jw.service.user.vo.UserVO" %>   
<%@ page import="jw.service.user.dao.UserDAO" %>

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
<body>
<form method="post" action="updateUser.jsp">
	
	<table width="700">
		<tbody><tr><td style="text-align: left;">ㅇ개인정보수정 페이지 입니다.</td>
		<td style="text-align: right;"><a href="http://127.0.0.1:8080/homework04/homework/addUserView.jsp">?</a>도움말</td>

	</tr></tbody></table>
 
 <hr width="700" color="blue" align="left" size="3/">
   <table style="text-align:left">
     <tbody><tr>
		<th> *이름(한글실명) </th>
		<td> <input type="text" name="name" size="20" value="<%=userVO.getName() %>"> 이름은 수정하면 안됩니다.</td>
	 </tr>
	 
	 <tr>
		<th> *성별 </th>
		<td> 
			<% if(userVO.getGender().equals("남")) {%>
			<input type="radio" name="gender" value="남" checked> 남
			<input type="radio" name="gender" value="여"> 여 
			<%}else{ %>
			<input type="radio" name="gender" value="남" > 남
			<input type="radio" name="gender" value="여" checked> 여
			<%}%> 
		</td>
	 </tr>

	 <tr>
		<th> *생년월일 </th>
		<td> <input type="text" name="birthyear" size="5" value="<%=userVO.getBirthyear() %>"> 년
			<select name="birthmonth">
			<option value="<%=userVO.getBirthmonth()%>"><%=userVO.getBirthmonth()%></option>
				<% for(int i=1; i<=12; i++) { %>
                   		<option value="<%= i %>"><%= i %></option>
               	<% } %>
			</select> 월
			<select name="birthday">
			<option value="<%=userVO.getBirthday() %>"><%=userVO.getBirthday()%></option>
				<% for(int i=1; i<=31; i++) { %>
                	<option value="<%= i %>"><%= i %></option>
                <% } %>
				</select> 일
		</td>
	 </tr>

	 <tr>
	 <th> *연락처 </th>
		<td> 
			전화번호
			<input type="text" name="phonnumber" size="12" value="<%=userVO.getPhonnumber() %>">
		</td>
	 </tr>
	 
	 <tr>
	 <th> *거주지 주소 </th>
		<td> 
			<input type="text" name="address" size="55" value="<%=userVO.getAddress() %>">
		</td>
	 </tr>
		
  </tbody></table> 
  <table><tbody><tr>
		
		<td style="text-align: center;"><input type='submit' value='수정완료' /><input type='reset' value='다시작성'/></td>
	</tr></tbody>
	</table>
	</form>

</body>
</html>