<%@ page contentType="text/html;charset=EUC-KR" %>

<%@ page import="java.sql.*" %>

<%
		request.setCharacterEncoding("EUC_KR");		
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String fromDbId = null;
		String fromDbPwd = null;
		
		try {
			String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbuser ="scott";
			String dbpwd = "tiger";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			
			PreparedStatement pStmt =
					con.prepareStatement("SELECT id, pwd FROM users WHERE id=?");
			pStmt.setString(1, id);
			
			ResultSet rs = pStmt.executeQuery();
			
			if(rs.next()) {
				fromDbId = rs.getString("id");
				fromDbPwd = rs.getString("pwd");
				System.out.println("db���� Ȯ�� �� id,pwd ==> : "+fromDbId+" : "+fromDbPwd);
			}else {
				System.out.println("db�� client���� �Է��� <"+id+"> �� <"+pwd+"> �� �����ϴ�");
			}
			
			rs.close();
			pStmt.close();
			con.close();
		}catch(Exception e) {
			System.out.println("=====> JDBC ���� Excpetion�� �߻��� ��� <=====");
			e.printStackTrace();
		}
%>
		
<html>
<head></head>
<body>
<h2>Login ȭ��</h2>
	<!-- //DBMS Data�� Client Form Data �� ȸ������ �Ǵ� -->
	<% if(fromDbId != null && fromDbPwd != null
			&&fromDbId.equals(id) && fromDbPwd.equals(pwd)) {  %>
		<%= id %>�� ȯ���մϴ�.
	<% }else { %>
		id, pwd�� Ȯ���ϼ���
	<% } %>
		
	<p><p><a href = '/edu/jw04/login.html'>�ڷ�</a>
	</body>
	</html>









<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>