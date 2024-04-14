 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex25_cookie</title>
<link rel="stylesheet" href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
<style>

	fieldset{
		width: 250px;
		margin: 10px;
	}
	
	fieldset > #theme{
		padding: 0;
	}
	
</style>
</head>
<body>
	<!-- ex25_cookie.jsp -->
	<h1>사이트 <small>첫번째 페이지</small></h1>
	
	<div>
		<a href="ex25_cookie.jsp">첫번째 페이지</a>
		<a href="ex25_cookie_1.jsp">두번째 페이지</a>
		<a href="ex25_cookie_2.jsp">세번째 페이지</a>
	</div>
	
	<fieldset>
		<legend>Site Options</legend>
		
		<input type="color" id="theme">
		<input type="button" value="적용하기" id="btnApply">
		<input type="button" value="취소하기" id="btnClear">
		
	</fieldset>
	
	<div><%= session.getId() %></div>
	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script src="/jsp/js/cookie.js"></script>
	<!-- webapp > js > "cookie.js" > 사용 -->
	<script>
	
	$('#btnApply').click(() => {
		
		$('body').css('background-color', $('#theme').val());
		
		// 쿠키의 만료 시간 지정
		// 1. 메모리 쿠키
		// 2. 하드 쿠키
		
		setCookie('theme', $('#theme').val(), 365); /* 365일 쿠키 만료값 지정 */
		<!-- webapp > js > "cookie.js" > 에서 확인해보면 만료값 exdays를 확인할 수있다.-->

	});
	
	if(getCookie('theme') != ''){
		$('body').css('background-color', getCookie('theme'));
		
		$('#theme').val(getCookie('theme'));
	}
	
	
	$('#btnClear').click(()=>{
		
		//쿠키 삭제
		setCookie('theme', '', -1);
		
	});
		
	</script>
</body>
</html>










