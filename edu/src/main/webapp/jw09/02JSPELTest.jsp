<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page import="java.util.*" %>

<h3> ����(. , []) ������ ���</h3><p/>

<%
   // 1. page ObjectScope ����
   pageContext.setAttribute("abc",new String("page ObjectScope ����� ���ڿ�"));
   
   // 2. request ObjectScope ����
   request.setAttribute("abc",new String("request ObjectScope ����� ���ڿ�"));
   
   //3.1 session ObjectScope  (size() ==0��)  ArrayList ����
   session.setAttribute("abc",new ArrayList());
   
   // 3.2 session ObjectScope ���� ���� ArrayList ����
   ArrayList arrayList =new ArrayList();
   arrayList.add( new String("ArrayList  ����� ���ڿ�") );
   session.setAttribute("def",arrayList);
   
   // 4. Application ObjectScope ���� ���� HashMap ����
   HashMap hashMap = new HashMap();
   hashMap.put("zzz",new String("HashMap ����� ���ڿ�"));
   application.setAttribute("abc",hashMap);
%>

<h5>1.page ObhectScope ����</h5>
${pageScope.abc}=${pageScope["abc"]}

<h5>2.request ObjectScope ����</h5>
${requestScope.abc}=${requestScope["abc"]}

<h5>3.session ObjectScope ���� : ����� ArrayList empty ����</h5>
${empty sessionScope.abc}=${empty sessionScope["abc"]}

<h5>4.1 session n ObjectScope ���� : ����� ArrayList empty ����</h5>
${sessionScope.def}=${sessionScope["def"]}

<h5>4.2 session ObjectScope ����</h5>
${sessionScope.def[0]}=${sessionScope["def"][0]}

<h5>5.1 application ObhectScope ���� : ����� HashMap empty ����</h5>
${empty applicationScope.abc}=${empty applicationScope["abc"]}

<h5>5.2 application ObhectScope ����</h5>
${applicationScope.abc.zzz}=${applicationScope["abc"].zzz}<br/><hr/><br/>

<h3>Object Scope�� ������ �������� �ʰ� EL�� ��� abc ���ٽ� <br/>
� Object Scope���� ����Ǵ��� Ȯ������.<br/><br/>
� Object Scope�� �����ΰ� : ${abc}</h3>