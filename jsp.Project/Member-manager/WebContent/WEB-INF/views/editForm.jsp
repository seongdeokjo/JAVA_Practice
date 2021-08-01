<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--  <%
 String memberCode = request.getParameter("memberCode");
 %>   --%> 
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
	<h3>${param.memberId}</h3>
	<hr>
		<form action="editMember.do" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" name="memberId" id="memberid" value="${param.memberId}" readonly>
					</td>
					
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="memberPw" value="${param.memberPw}" required></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="memberName" value="${param.memberName}" required></td>
				</tr>
				<tr>
					<td>사진</td>
					<td><input type="file" name="memberPhoto" value="${param.memberPhoto}"></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit"> 
						<input type="reset">
					</td>
				</tr>
			</table>
		</form>
</body>
</html>