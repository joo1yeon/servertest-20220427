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
	<form action="membermybatisinsert" method="post">
		아이디<input type="text" name="id"><br>
		패스워드<input type="password" name="password"><br>
		이름<input type="text" name="name"><br>
		연락처<input type="text" name="phone"><br>
		이메일<input type="text" name="email"><br>
		주소<input type="text" name="address"><br>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>