<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
	<!-- ex05_script.jsp -->
	
	<h1>구구단</h1>
	
	<%
		//자바 영역 제공
		int dan = 5;
	
	%>
	<h2>5단</h2>
	<%for(int i=1; i<=9; i++){ %>
	<div><%= dan%> x <%= i%> = <%= dan * i%></div>
	<%}%>
	<h2>6단</h2>
	<%for(int i=1; i<=9; i++){ %>
	<div><%= dan + 1 %> x <%= i %> = <%= (dan+1) * i %></div>
	<%} %>


</body>
</html>