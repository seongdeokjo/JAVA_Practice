<%@page import="member.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member member = (Member)request.getAttribute("member");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 수정 페이지</title>
<style>
</style>
<script>
</script>
</head>
<body>
	<h1>회원 정보 수정</h1>
	<hr>
	<form action="editMember.jsp" method="post">
		<table>
			<tr>
				<td>회원 코드</td>
				<td><input type="number" name="memberCode" value="<%= member.getMemberCode() %>" readonly></td>
			</tr>
			<tr>
				<td>회원 아이디</td>
				<td><input type="text" name="memberId" value="<%= member.getMemberId() %>" required></td>
			</tr>
			<tr>
				<td>회원 비밀번호</td>
				<td><input type="password" name="memberPw" value="<%= member.getMemberPw() %>" required></td>
			</tr>
			<tr>
				<td>회원 이름</td>
				<td><input type="text" name="memberName" value="<%= member.getMemberName() %>" required></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="등록">
					<input type="reset"> 
				</td>
			</tr>
		</table>	
	</form>
</body>
</html>