<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<body>

 	<form method="post" action="addUser.jsp">
	
	<table width="700">
		<tbody><tr><td style="text-align: left;">����������</td>
		<td style="text-align: right;"><a href="http://127.0.0.1:8080/homework04/homework/addUserView.jsp">?</a>����</td>

	</tr></tbody></table>
 
 <hr width="700" color="blue" align="left" size="3/">
   <table style="text-align:left">
     <tbody><tr>
		<th> *�̸�(�ѱ۽Ǹ�) </th>
		<td> <input type="text" name="name" size="20"> </td>
	 </tr>
	 
	 <tr>
		<th> *���� </th>
		<td> 
			<input type="radio" name="gender" value="��"> ��
			<input type="radio" name="gender" value="��"> �� 
		</td>
	 </tr>

	 <tr>
		<th> *������� </th>
		<td> <input type="text" name="birthyear" size="5"> ��
			<select name="birthmonth">
				<% for(int i=1; i<=12; i++) { %>
                   		<option value="<%= i %>"><%= i %></option>
               	<% } %>
			</select> ��
			<select name="birthday">
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
			<input type="text" name="phonnumber" size="12">
		</td>
	 </tr>
	 
	 <tr>
	 <th> *������ �ּ� </th>
		<td> 
			<input type="text" name="address" size="55">
		</td>
	 </tr>
		
  </tbody></table> 
  <table><tbody><tr>
		
		<td style="text-align: center;"><input type='submit' value='Ȯ��' /><input type='reset' value='��� '/></td>
	</tr></tbody>
	</table>
	</form>
	</body>
   </html>