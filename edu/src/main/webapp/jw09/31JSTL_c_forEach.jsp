<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h3>:: c:forEach �̿� �������� ���</h3>
	1. c:forEach �̿� : 5�����<br/>
	<c:forEach var="i" begin="2" end="9" step="1">
		5*${i} = ${5*i}<br/>
	</c:forEach><br/><hr/>
	
	2.��ø c:forEach �̿� : ������ ¦�� ��� <br/>
	<c:forEach var="i" begin="2" end="9" step="2">
		[${i}]���� ����մϴ�.<br/>
		<c:forEach var="j" begin="2" end="9" step="1">
			${i}*${j} = ${i*j}<br/>
		</c:forEach>
		<br/>
	</c:forEach>
	
<h3>3.index���� Collection ����</h3>
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
		::Vector �������� ���� : ${i}<br/>
	</c:forEach><br/>
	
	<c:forEach var="i" items="<%= vector%>" begin="1" step="1">
		::Vector �������� ���� : ${i}<br/>
	</c:forEach><br/>
	
	<c:forEach var="i" items="<%= vector%>" begin="0" step="2">
		::Vector �������� ���� : ${i}<br/>
	</c:forEach><br/>
	
	<c:forEach var="i" items="<%= vector%>" begin="0" step="1" end="1">
		::Vector �������� ���� : ${i}<br/>
	</c:forEach><br/><hr/>
	
<h3>4.key=value������ map�� value����</h3><br/>
	<%
		java.util.HashMap hashMap = new java.util.HashMap();
		hashMap.put("a","A");
		hashMap.put("b","B");
		hashMap.put("c","C");
		hashMap.put("d","D");
	%>
	
	<c:forEach var="i" items="<%= hashMap%>" begin="0" step="1" end="10">
		::HashMap �������� ���� : ${i.key}=${i.value}<br/>
	</c:forEach><br/><hr/>
	
<h3>5.EL / c:set, c:if�� ���� ���</h3><br/>
	<c:set var="aaa" value="<%= hashMap %>"/>
	
	<c:forEach var="i" items="${aaa}">
		<c:if test = "${i.key == 'a' }">
			:: key a�� value : ${i.value}
		</c:if>
		
	</c:forEach>