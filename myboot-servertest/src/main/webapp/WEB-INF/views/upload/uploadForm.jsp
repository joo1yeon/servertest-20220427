<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		
	});
</script>
</head>
<body>
	<h1>파일 전송 폼</h1>
	<form action="fileupload" method="post" enctype="multipart/form-data">
		작성자 <input type="text" name="name" /><br>
		설명 <input type="text" name="description"><br>
		업로드 파일명1 <input type="file" name="file1"><br>
		업로드 파일명2 <input type="file" name="file2"><br>
		<input type="submit" value="파일 전송" />
	</form>
</body>
</html>