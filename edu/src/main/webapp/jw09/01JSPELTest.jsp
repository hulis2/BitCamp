<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page isELIgnored = "false" %>

<%-- Expression Tag --%>
���� : <%= "ȫ�浿" %><br/>
<%-- Expression Languge --%>
���� : ${"ȫ�浿"}<br/><br/>

����+���� : ${"1"+2} <br/><br/>

<!-- NumberFormatException -->
<%-- ����*���� : ${"ȫ"*3}<br/> --%>

10==10 : ${10==10}<br/>
10>=1 : ${0>=1}<br/>
!true : ${!true}<br/><br/>

����?true : false = ${10>100 ? "10�� 100����ũ�� true" : "10�� 100���� �۴� false" }<br/><br/>

empty null : ${empty null}<br/>
empty " " : ${empty " "}<br/>
empty "" : ${empty ""}<br/>  <!--  null String : EL���� null String�� true�� �����.-->
