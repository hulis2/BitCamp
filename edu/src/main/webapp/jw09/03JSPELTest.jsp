<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% request.setCharacterEncoding("EUC_KR"); %>

<h3>EL ���尴ü�� ���</h3>

1. pageContext EL ���尴ü�� �̿��� requestURI : ${pageContext.request.requestURI}<br/>

2. pageContext EL ���尴ü�� �̿��� session�� id : ${pageContext.session.id}<br/>

3. Expression tag�� ��� : <%= pageContext.getSession().getId() %><br/>

4. �̸� : <%= request.getParameter("name") %><br/>

5. ���� : ${param.age}<br/>

<% String[] sw = request.getParameterValues("sw"); %>
6. ������ ����Ʈ ���� :<%= sw[0] %><br/>
6. ������ ����Ʈ ���� :${paramValues.sw[1]}<br/>
6. ������ ����Ʈ ���� :${paramValues.sw[2]}<br/>

<h5>EL Cookie ���尴ü : Map ����</h5>
7. ��Ű�� ����� JSESSIONID name : ${cookie.JSESSIONID.name}<br/>
7. ��Ű�� ����� JSESSIONID value : ${cookie.JSESSIONID.value}<br/> 