 <%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

//POST > 한글 인코딩
request.setCharacterEncoding("UTF-8");

// 너비
String width = request.getParameter("width");

//높이
String height = request.getParameter("height");

//배경색
String color = request.getParameter("color");

//텍스트
String txt1 = request.getParameter("txt1");

//개수
String num = request.getParameter("num");
int number = Integer.parseInt(num);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
<style>
body {
	width: 500px;
}

th {
	width: 100px;
	height: 35px;
	padding: 7px;
}

div {
	width: <%=width%>px;
	height: <%=height%>px;
	background-color: <%=color%>;
	margin: 10px;
	border: 1px solid black;
}
</style>
</head>
<body>
	<!-- ex12_ok -->
	<h1>결과</h1>

	<%
	for (int i = 1; i <= number; i++) {
	%>
	<div><%=txt1%></div>
	<%}%>









	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script>
		
	</script>
</body>
</html>