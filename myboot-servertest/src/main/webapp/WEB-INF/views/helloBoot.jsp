<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		alert("jquery");
		$("h1").css("color", "blue")
		$("#ajaxBtn").on('click', function() {
			$.ajax({
				url: '/helloajax',
				type: 'get',
				dataType: 'json',
				success: function(result) { // memberDTO -> JSON 변환
					$("#result").html(result.id + " : " + result.password);
				}
			});
		});
	});
</script>
</head>
<body>
	<img alt="" src="images/jquery.png">
	<h1>${ model } 실행!!!!!</h1>
	<h1>${ other } 실행!!!!!</h1>
	<input type="button" value="ajax 요청" id="ajaxBtn">
	<div id="result"></div>
</body>
</html>