<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%> <!-- impolt 구문 -->
    
<%

	//Oracle > select > 회원 정보

	ArrayList<String> names = new ArrayList<>();
	
	names.add("홍길동");
	names.add("하무개");
	names.add("하하하");
	names.add("호호호");
	names.add("김두한");


%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
</head>
<body>	
	<!-- ex07_script.jsp -->
	<h1>회원 목록</h1>
	
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
		</tr>
			<% for (int i=0; i<names.size(); i++) { %>
		<tr>
			<td onclick="num(<%= i + 1 %>);"><%= i + 1 %></td>
			<td onclick="info('<%= names.get(i) %>');"><%= names.get(i) %></td>
		</tr>
		<% } %>
	</table>
	
	
	<script>
		function info(name) {
			alert(name);
		}
		
		function num(number) {
			alert(number);
		}
	</script>

</body>
</html>





















