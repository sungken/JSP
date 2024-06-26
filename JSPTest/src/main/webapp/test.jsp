 <%@page import="java.util.Comparator"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//디렉토리 탐색
	String path = application.getRealPath("/pic");
	
	File dir = new File(path);
	File[] list = dir.listFiles();
	
	//시간 순서대로 정렬
	//System.out.println(list[0].lastModified());
	
	Arrays.sort(list, new Comparator<File>() {
		public int compare(File o1, File o2) {
			return Long.compare(o1.lastModified(), o2.lastModified());
		}
	});
	
	Arrays.sort(list, (o1, o2) -> Long.compare(o2.lastModified(), o1.lastModified()));

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료실(탐색기) webapp > files</title>
<link rel="stylesheet" href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
<style>
	#list {
		/* outline: 10px solid black; */
		width: 750px;
		display: flex;
		flex-wrap: wrap;
		padding: 0;
		margin-left: 25px;
	}
	#list > div {
		border: 1px solid #999;
		width: 126px;
		height: 126px;
		margin: 11px;
		background-size: cover;
		background-repeat: no-repeat;
		background-position: center center;
		position: relative;
		left: 0;
		top: 0;
	}
	
	#list > div > span {
		position: absolute;
		right: 5px;
		top: 0;
		font-size: 1.5rem;
		cursor: pointer;
		display: none;
	}
	
	#list > div:hover > span {
		display: inline;
	}
	
	#img1 {
		max-width: 490px;
		display: block;
		margin: 15px auto;
	}
	
	#fff > th{
		border: 0;
		margin: 0;
		padding: 0;
		width: 50px;
		background-color: white;
	}
	
	#fff > td{
		border: 0;
	}
	
	
</style>
</head>
<body>

	<h1>자료실(탐색기) webapp > files</h1>
	
	<form method="POST" action="test_ok.jsp" enctype="multipart/form-data">
	<table>
		<tr>
			<th>파일명</th>
			<th>크기</th>
			<th>수정된 날짜</th>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
	<form method="POST" action="test_ok.jsp"
		enctype="multipart/form-data">
	<table class="vertical">
		<tr id="fff">
			<th>파일: </th>
			<td><input type="file" name="attach" required></td>
		</tr>
	</table>
	<div>
		<input type="submit" value="업로드">
	</div>
	</form>
	
	
	
	</form>
	
	
	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script src="http://pinnpublic.dothome.co.kr/cdn/example-min.js"></script>
	<script>
	
	</script>
</body>
</html>










