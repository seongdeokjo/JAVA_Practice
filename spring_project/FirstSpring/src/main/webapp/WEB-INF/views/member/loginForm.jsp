<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<style>
</style>
<script>
</script>
</head>
<body>
	<h1>loginForm</h1>
	<hr>
	<c:url value="/member/login.jsp" var="url"/>
	<form action="${url}" method="post" > <!-- /web/member/mypage/mypage.jsp -->
		<table border="1">
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name ="id">
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="pw">
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>