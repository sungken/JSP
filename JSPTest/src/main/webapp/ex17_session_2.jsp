 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%




%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex17_session_2</title>
<link rel="stylesheet" href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
<style>
	
</style>
</head>
<body>
	<!-- ex17_session_2.jsp -->
	<h1>session & application</h1>
	
	<div>a: <%= session.getAttribute("a") %></div>
	<div>b: <%= application.getAttribute("b") %></div>
	
	
	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script>
		
	</script>
</body>
</html>