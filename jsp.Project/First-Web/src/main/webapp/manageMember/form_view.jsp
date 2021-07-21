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
<title>회원 정보 수정 페이지</title>
<style>
</style>
<script>
</script>
</head>
<body>
	<h1>회원 정보 수정</h1>
	<hr>
	<form action="editMember.jsp" method="post">
		<table border="1">
			<tr>
				<td>회원 번호</td>
				<td>
					<input type="text" name="memberCode" value="<%=member.getMemberCode() %>" readonly>
					
				</td>
			</tr>		
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="id" value="<%=member.getMemberId() %>" readonly>
					
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" id="pw" name="pw" value="<%=member.getMemberPw() %>" required>
				</td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td>
					<input type="password" id="repw" name="repw" value="<%= member.getMemberPw() %>" required>
					<div id="msg"></div>
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="name" value="<%= member.getMemberName() %>" required>
				</td>
			</tr>
			<tr>
				<td>
					<input type="reset" value="초기화">
									
				</td>
				<td>
					<input type="submit"  value="등록">	
				</td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>