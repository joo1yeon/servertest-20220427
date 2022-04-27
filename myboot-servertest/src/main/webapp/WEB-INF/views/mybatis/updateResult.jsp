<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ result == 1 }">
		<h3>정상 회원 정보 수정 완료!!!</h3>
	</c:if>
	<a href="membermybatislist">회원 리스트 보러가기</a>
</body>
</html>