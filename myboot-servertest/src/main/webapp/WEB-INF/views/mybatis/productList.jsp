<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<%= request.getContextPath() %>/resources/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		
	});
</script>
</head>
<body>
	<c:forEach items="${ productList }" var="dto">
		<h3>상품코드: ${ dto.productcode }</h3>
		<h3><a href="/product?productcode=${ dto.productcode }">상품명: ${ dto.productname }</a></h3>
		<h3>가격: ${ dto.price }</h3>
		<hr>
	</c:forEach>
</body>
</html>