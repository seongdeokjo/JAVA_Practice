<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String repw = request.getParameter("repw");
	String name = request.getParameter("name");
	String birth = request.getParameter("birth");
	String month = request.getParameter("month");
	String day = request.getParameter("day");
	String sex = request.getParameter("sex");
	String email = request.getParameter("email");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
<link rel="stylesheet" href="/First-Web/personInfo/css/facebook.css">

</head>
<body>
		<table>
			<tr>
				<td>아이디</td>
				<td><%=id %></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><%=pw %></td>
			</tr>
			<tr>
				<td>비밀번호재확인</td>
				<td><%=repw %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=name %></td>
			</tr>
			<tr>
				<td></td>
				<td><%=id %></td>
			</tr>
			<tr>
				<td>생년월일</td>
				<td><%=birth %></td>
				<td><%=month %></td>
				<td><%=day %></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%=sex %></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><%=email %></td>
			</tr>
			
		</table>

</body>
</html>