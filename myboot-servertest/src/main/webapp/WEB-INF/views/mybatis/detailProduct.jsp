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
	<table>
		<tr>
			<td>상품코드</td>
			<td>${ product.productcode }</td>
		</tr>
		<tr>
			<td>상품명</td>
			<td>${ product.productname }</td>
		</tr>
		<tr>
			<td>가격</td>
			<td>${ product.price }</td>
		</tr>
		<tr>
			<td>제조 회사</td>
			<td>${ product.company }</td>
		</tr>
		<tr>
			<td>재고량</td>
			<td>${ product.balance }</td>
		</tr>
		<tr>
			<td>입고일</td>
			<td>${ product.regdate }</td>
		</tr>
	</table>
</body>
</html>