<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<body>

 <br>정보보기 할 User 이름을 입력하세요.<br/>

	<form method="post" action="findUser.jsp">
		
		<table border="1" width="80%">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" value="입력완료"/></center></td>
			</tr>
		</table>
		
	</form>	
	
</body>
</html>