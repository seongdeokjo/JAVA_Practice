<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberReg Form</title>
</head>
<body>
	<h1>회원가입</h1>
	<hr>
	<!-- enctype="multipart/form-data" -->
	<form  method="post" >
			<table>
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" name="memberId" id="memberId">
						<span id="msg" class="display_none"></span>
						<img id="loadingimg" class="display_none" alt="loading" src="<c:url value="/image/loading.gif"/>"> 
					</td>
					
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="memberPw"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="memberName"></td>
				</tr>
				<!-- <tr>
					<td>사진</td>
					<td><input type="file" name="memberPhoto"></td>
				</tr> -->
				<tr>
					<td></td>
					<td><input type="submit"> <input type="reset">
					</td>
				</tr>
			</table>
		</form>
</body>
</html>