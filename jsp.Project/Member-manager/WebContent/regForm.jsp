<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입 page</title>
<link rel="stylesheet" href="${css}">
<style>
</style>
<script>
	
</script>
</head>
<body>

	<c:import url="${head}" />
	<c:import url="${nav}" />

	<div class="contents">

		<h2>회원가입</h2>
		<hr>
		<form action="memberReg.jsp" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="memberId"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="memberPw"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="memberName"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit"> <input type="reset">
					</td>
				</tr>
			</table>
		</form>


	</div>


</body>
</html>