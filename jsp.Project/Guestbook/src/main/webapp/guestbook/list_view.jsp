<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>작성 페이지</title>
<style>
</style>
<script>
</script>
</head>
<body>
	<form action="writemessage.jsp" method="post"> 
		<table border="1">
				<tr>
				<td>이름</td>
				<td>					<!--usebean을 사용하기 위해 messageRequset class의 변수명과 일치  -->
					<input type="text" name="guestname" required>
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="password" required>
				</td>
			</tr>
			<tr>
				<td>메세지</td>
				<td>
					<textarea rows="10" cols="30" name="message"></textarea>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="메시지 남기기">
				</td>
			</tr>			
		</table>
	</form>	
	<hr>
	${listview}
</body>
</html>