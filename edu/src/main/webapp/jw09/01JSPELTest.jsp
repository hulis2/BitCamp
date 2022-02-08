<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page isELIgnored = "false" %>

<%-- Expression Tag --%>
문자 : <%= "홍길동" %><br/>
<%-- Expression Languge --%>
문자 : ${"홍길동"}<br/><br/>

문자+숫자 : ${"1"+2} <br/><br/>

<!-- NumberFormatException -->
<%-- 문자*숫자 : ${"홍"*3}<br/> --%>

10==10 : ${10==10}<br/>
10>=1 : ${0>=1}<br/>
!true : ${!true}<br/><br/>

조건?true : false = ${10>100 ? "10이 100보다크다 true" : "10이 100보다 작다 false" }<br/><br/>

empty null : ${empty null}<br/>
empty " " : ${empty " "}<br/>
empty "" : ${empty ""}<br/>  <!--  null String : EL에선 null String도 true로 잡아줌.-->
