<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<style>
</style>
<script>
	
</script>
</head>
<body>

	<h1>회원 정보 등록</h1>
	<hr>
	<form action="regMember.jsp" method="post">
		<table border="1" width="500">
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="id" required placeholder="id를 입력하세요.">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" id="pw" name="pw" required placeholder="비밀번호를 입력해주세요.">
				</td>
				
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td>
					<input type="password" id="repw" required placeholder="비밀번호를 한번더 입력하세요.">
				</td>
			<!-- 	<td>
					<div id="check">비밀번호가 일치하지 않습니다.</div>
				</td> -->
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="name" required	placeholder="이름을 입력하세요.">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="등록"> 
					<input type="reset" value="초기화">
				</td>
			</tr>
		</table>

	</form>



</body>
</html>