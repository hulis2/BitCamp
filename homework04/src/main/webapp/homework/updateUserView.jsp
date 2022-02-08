<%@ page import="jw.service.user.vo.UserVO" %>   
<%@ page import="jw.service.user.dao.UserDAO" %>

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
<body>
<form method="post" action="updateUser.jsp">
	
	<table width="700">
		<tbody><tr><td style="text-align: left;">�������������� ������ �Դϴ�.</td>
		<td style="text-align: right;"><a href="http://127.0.0.1:8080/homework04/homework/addUserView.jsp">?</a>����</td>

	</tr></tbody></table>
 
 <hr width="700" color="blue" align="left" size="3/">
   <table style="text-align:left">
     <tbody><tr>
		<th> *�̸�(�ѱ۽Ǹ�) </th>
		<td> <input type="text" name="name" size="20" value="<%=userVO.getName() %>"> �̸��� �����ϸ� �ȵ˴ϴ�.</td>
	 </tr>
	 
	 <tr>
		<th> *���� </th>
		<td> 
			<% if(userVO.getGender().equals("��")) {%>
			<input type="radio" name="gender" value="��" checked> ��
			<input type="radio" name="gender" value="��"> �� 
			<%}else{ %>
			<input type="radio" name="gender" value="��" > ��
			<input type="radio" name="gender" value="��" checked> ��
			<%}%> 
		</td>
	 </tr>

	 <tr>
		<th> *������� </th>
		<td> <input type="text" name="birthyear" size="5" value="<%=userVO.getBirthyear() %>"> ��
			<select name="birthmonth">
			<option value="<%=userVO.getBirthmonth()%>"><%=userVO.getBirthmonth()%></option>
				<% for(int i=1; i<=12; i++) { %>
                   		<option value="<%= i %>"><%= i %></option>
               	<% } %>
			</select> ��
			<select name="birthday">
			<option value="<%=userVO.getBirthday() %>"><%=userVO.getBirthday()%></option>
				<% for(int i=1; i<=31; i++) { %>
                	<option value="<%= i %>"><%= i %></option>
                <% } %>
				</select> ��
		</td>
	 </tr>

	 <tr>
	 <th> *����ó </th>
		<td> 
			��ȭ��ȣ
			<input type="text" name="phonnumber" size="12" value="<%=userVO.getPhonnumber() %>">
		</td>
	 </tr>
	 
	 <tr>
	 <th> *������ �ּ� </th>
		<td> 
			<input type="text" name="address" size="55" value="<%=userVO.getAddress() %>">
		</td>
	 </tr>
		
  </tbody></table> 
  <table><tbody><tr>
		
		<td style="text-align: center;"><input type='submit' value='�����Ϸ�' /><input type='reset' value='�ٽ��ۼ�'/></td>
	</tr></tbody>
	</table>
	</form>

</body>
</html>