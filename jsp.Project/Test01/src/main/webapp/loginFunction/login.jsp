<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script>
	
</script>
</head>
<body>

	<form action="loginOk.jsp" method="post">
		<table border="1" align="center" width="500">
			<tr>
				<th colspan="2">로그인</th>
			</tr>
			<tr>
				<th>아이디</th>
				<td>
					<input name="id" class="login_input" placeholder="이메일 또는 전화번호" type="text"> 
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input name="pw" class="login_input" placeholder="비밀번호" type="password"> 
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input	type="submit" value="로그인">
				</th>
			</tr>
			
		
			
		</table>
	</form>



</body>
</html>