<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
</head>
<body>
	<h1>이전 페이지의 주소 : ${re}</h1>
	<input type="hidden" name="redirectUrl" value="${re}">
</body>
</html>