<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% session.setAttribute("client", new jw09.Client()); %>

<hr/>
<h3>2.EL 이용 session 저장 Bean(Data) 화면구성</h3>

name : ${sessionScope.client.name}<br/>
addr : ${client.addr}<br/>
age : ${client.age}<br/>

info 배열은 empty : ${empty client.info}<br/>

info 배열은 index 0 value : ${sessionScope.client.info[0]}<br/>
info 배열은 index 1 value : ${client.info[1]}<br/>