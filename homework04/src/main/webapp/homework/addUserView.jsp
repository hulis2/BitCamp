<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<body>

 	<form method="post" action="addUser.jsp">
	
	<table width="700">
		<tbody><tr><td style="text-align: left;">ㅇ개인정보</td>
		<td style="text-align: right;"><a href="http://127.0.0.1:8080/homework04/homework/addUserView.jsp">?</a>도움말</td>

	</tr></tbody></table>
 
 <hr width="700" color="blue" align="left" size="3/">
   <table style="text-align:left">
     <tbody><tr>
		<th> *이름(한글실명) </th>
		<td> <input type="text" name="name" size="20"> </td>
	 </tr>
	 
	 <tr>
		<th> *성별 </th>
		<td> 
			<input type="radio" name="gender" value="남"> 남
			<input type="radio" name="gender" value="여"> 여 
		</td>
	 </tr>

	 <tr>
		<th> *생년월일 </th>
		<td> <input type="text" name="birthyear" size="5"> 년
			<select name="birthmonth">
				<% for(int i=1; i<=12; i++) { %>
                   		<option value="<%= i %>"><%= i %></option>
               	<% } %>
			</select> 월
			<select name="birthday">
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
			<input type="text" name="phonnumber" size="12">
		</td>
	 </tr>
	 
	 <tr>
	 <th> *거주지 주소 </th>
		<td> 
			<input type="text" name="address" size="55">
		</td>
	 </tr>
		
  </tbody></table> 
  <table><tbody><tr>
		
		<td style="text-align: center;"><input type='submit' value='확인' /><input type='reset' value='취소 '/></td>
	</tr></tbody>
	</table>
	</form>
	</body>
   </html>