<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- ex04.jsp -->
	<h1>커뮤니티</h1>
	
	<p>이런기능</p>
	<p>저런기능</p>
	
	<!-- 
		로그인 부분 적용
		1. 클라이언트
		2. 서버
	
	 -->
	<!-- 1. 외부 페이지 삽입 - 특별한 목적을 가지고 있을때 쓰임 -->
	<iframe src="login.jsp" frameborder="0"></iframe>
	
	<!-- 2. 외부 페이지 삽입 - 보통 많이 쓰임 -->
	<%@ include file="login.jsp" %>
	
</body>
</html>









































