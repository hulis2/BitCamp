<%@ page contentType="text/html;charset=euc-kr" %>

<html>
<body>

::  06JSPActionIncludeParam.jsp ���� <br/>

<%
	// Scriptlet tag ���� ���� :: service() Method  local variable
	String value = "local variable";

	// request,session,application  ObjectScope  Data ����
	request.setAttribute("aaa",new String("request ObjectScope ����� ���ڿ�"));
	session.setAttribute("bbb",new String("session ObjectScope ����� ���ڿ�"));
	application.setAttribute("ccc",new String("application ObjectScope ����� ���ڿ�"));
%>

<jsp:include  page="07JSPActionIncludeParam.jsp">
	<jsp:param value="<%= value %>" name="str"/>
</jsp:include>

::  06JSPActionInclude.jsp �� <br/>

</body>
</html>