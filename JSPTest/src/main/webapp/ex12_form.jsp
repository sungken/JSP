 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</style>
</head>
<body>
	<!-- ex12_form -->
	<h1>박스 만들기</h1>

	<form method="POST" action="ex12_ok.jsp">

		<table class="vartical">
			<tr>
				<th>너비(px)</th>
				<td><input type="number" min="100" max="500" step="10"
					name="width"></td>
			</tr>
			<tr>
				<th>높이(px)</th>
				<td><input type="number" min="100" max="500" step="10"
					name="height"></td>
			</tr>

			<tr>
				<th>배경색</th>
				<td><input type="color" name="color"></td>
			</tr>

			<tr>
				<th>텍스트</th>
				<td><input type="text" name="txt1"></td>
			</tr>

			<tr>
				<th>개수</th>
				<td><input type="number" min="0" max="10" step="1" name="num"></td>
			</tr>

		</table>
		<div>
			<input type="submit" value="보내기">
		</div>
	</form>


	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>

	<script>
		
	</script>
</body>
</html>