<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
<style>
	
	#item1 { background: tomato; }
	#item2 { background: gold; }
	#item3 { background: cornflowerblue; }
	#item4 { background: yellowgreen; }
	
	#iframe1{
		width: 100%;
		height: 600px;
	}
	
</style>
</head>
<body>
	<iframe id="iframe1" src="/ajax/ex01.do" frameborder="0" scrolling="no"></iframe>
	
	<hr>
	
	<h2>다른 내용</h2>
	
	<div>
		<input type="text">
		<br><br>
		<input type="checkbox">
	</div>
	
	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script>
	

	</script>
</body>
</html>










