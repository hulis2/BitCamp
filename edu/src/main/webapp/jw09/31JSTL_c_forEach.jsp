<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h3>:: c:forEach 이용 구구단을 출력</h3>
	1. c:forEach 이용 : 5단출력<br/>
	<c:forEach var="i" begin="2" end="9" step="1">
		5*${i} = ${5*i}<br/>
	</c:forEach><br/><hr/>
	
	2.중첩 c:forEach 이용 : 구구단 짝수 출력 <br/>
	<c:forEach var="i" begin="2" end="9" step="2">
		[${i}]단을 출력합니다.<br/>
		<c:forEach var="j" begin="2" end="9" step="1">
			${i}*${j} = ${i*j}<br/>
		</c:forEach>
		<br/>
	</c:forEach>
	
<h3>3.index관리 Collection 접근</h3>
	<%
		java.util.Vector vector = new java.util.Vector();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		
		System.out.println("==========================");
		for(int i = 0;i<vector.size();i++){
			System.out.println((String)vector.get(i));
		}
		System.out.println("==========================");
		for(Object obj : vector){
			System.out.println((String)obj);
		}
		System.out.println("==========================");
	%>
	
	<c:forEach var="i" items="<%= vector%>" begin="0" step="1" end="10">
		::Vector 저장정보 추출 : ${i}<br/>
	</c:forEach><br/>
	
	<c:forEach var="i" items="<%= vector%>" begin="1" step="1">
		::Vector 저장정보 추출 : ${i}<br/>
	</c:forEach><br/>
	
	<c:forEach var="i" items="<%= vector%>" begin="0" step="2">
		::Vector 저장정보 추출 : ${i}<br/>
	</c:forEach><br/>
	
	<c:forEach var="i" items="<%= vector%>" begin="0" step="1" end="1">
		::Vector 저장정보 추출 : ${i}<br/>
	</c:forEach><br/><hr/>
	
<h3>4.key=value형식의 map의 value접근</h3><br/>
	<%
		java.util.HashMap hashMap = new java.util.HashMap();
		hashMap.put("a","A");
		hashMap.put("b","B");
		hashMap.put("c","C");
		hashMap.put("d","D");
	%>
	
	<c:forEach var="i" items="<%= hashMap%>" begin="0" step="1" end="10">
		::HashMap 저장정보 추출 : ${i.key}=${i.value}<br/>
	</c:forEach><br/><hr/>
	
<h3>5.EL / c:set, c:if를 동시 사용</h3><br/>
	<c:set var="aaa" value="<%= hashMap %>"/>
	
	<c:forEach var="i" items="${aaa}">
		<c:if test = "${i.key == 'a' }">
			:: key a의 value : ${i.value}
		</c:if>
		
	</c:forEach>