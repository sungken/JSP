<%@page import="com.test.jsp.MyUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//지역 변수
	int a = 10;

	/* public void test() {
		
	} */
	
	/* class Test {
		
	} */
	
	
	// import
	MyUtil util = new MyUtil();

%> 

<%!

	//선언부
	// class 멤버 변수
	int b = 20;

	public int sum(int a, int b){
		return a + b;
	}

%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ex08.jsp -->
	
	<div>10 + 20 = <%= sum(10, 20) %></div>
	<div>30 + 40 = <%= sum(30, 40) %></div>
	
	
	<!-- 다른 페이지의 클래스를 가져오기*** -->
	<div>50 + 60 = <%= util.sum(50,60) %></div> 
	
</body>
</html>












