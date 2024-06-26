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
	#map {
		width: 770px;
		height: 400px;
	}
</style>
</head>
<body>
	<!-- ex03.jsp -->
	<h1>지도 <small>좌표 이동 + 레벨 변경</small></h1>
	
	<div>
		<div id="map"></div>
	</div>
	<hr>
	<div>
		<input type="button" value="한독빌딩으로 이동하기" id="btn1">
		<input type="button" value="상암경기장으로 이동하기" id="btn2">
		<input type="button" value="역삼역으로 이동하기" id="btn3">
	</div>
	<hr>
	<div>
		<input type="button" value="확대" id="btn4">
		<input type="button" value="축소" id="btn5">
	</div>
		
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=aee9a65a1b49a897184f218db1f2b195"></script>
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script>
	
		var container = document.getElementById('map'); 
		
		var options = {
				center: new kakao.maps.LatLng(37.49932744336939, 127.03332155759142),
			level: 3
		};	
		
		var map = new kakao.maps.Map(container, options);
		
		
		//var mapTypeControl = new kakao.maps.MapTypeControl();
		//map.addControl(mapTypeControl, kakao.maps.ControlPosition.TOPRIGHT);
		
		
		map.setDraggable(false);
		map.setZoomable(false);
		
		
		$('#btn1').click(() => {
			const pos = new kakao.maps.LatLng(37.49932744336939, 127.03332155759142);
			//map.setCenter(pos);
			map.panTo(pos);
		});
		
		$('#btn2').click(() => {
			
			//37.56822975982771, 126.89723802535514
			const pos = new kakao.maps.LatLng(37.56822975982771, 126.89723802535514);			
			//map.setCenter(pos);
			map.panTo(pos);
			
		});
		
		$('#btn3').click(() => {
			const pos = new kakao.maps.LatLng(37.5000927135235, 127.03533489530801);
			
			//map.setCenter(pos);
			map.panTo(pos);
		});
		
		$('#btn4').click(() => {
			//map.setLevel(1);
			map.setLevel(map.getLevel() - 1);
		});
		
		$('#btn5').click(() => {
			//map.setLevel(14);
			map.setLevel(map.getLevel() + 1);
		});
		
	</script>
</body>
</html>










