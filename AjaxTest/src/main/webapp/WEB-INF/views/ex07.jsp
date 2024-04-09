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
	
</style>
</head>
<body>
	<!-- ex07.jsp -->
	<h1>Ajax 응답 데이터(형식에 따른 분류)</h1>
	
	<h2>Text, ajax.responseText</h2>
	<div>
		<input type="button" value="확인" id="btn1">
		<div class="message" id="div1"></div>
	</div>
	
	<h2>XML, ajax.responseXML</h2>
	<div>
		<input type="button" value="확인" id="btn2">
		<div class="message" id="div2"></div>
	</div>
	
	<h2>JSON(***)</h2>
	<div>
		<input type="button" value="확인" id="btn3">
		<div class="message" id="div3"></div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script>
	
		//텍스트 반환 + 단일값
		$('#btn1').click(()=>{
			
			$.ajax({
				type: 'GET',
				url: '/ajax/ex07check.do',
				
				//전송하는 데이터(값)
				data: 'type=1',
				
				//돌려받는 데이터의 형식(text, xml, json) > result 타입
				dataType: 'text',
				
				success: function(result) {
					
					$('#div1').text(result);
					
				},
				error: function(a,b,c) {
					console.log(a,b,c);
				}				
			});
			
		});
	
	</script>
</body>
</html>










