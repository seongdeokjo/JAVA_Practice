<%@page import="member.domain.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
List<Member> mList = (List<Member>)request.getAttribute("result");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
<style>
</style>
<script>
</script>
</head>
<body>
	<h1>회원 리스트</h1>
	<hr>
	
	<button onclick="location.href='member_regForm.jsp';">회원 정보 등록</button>
	<table border="1">
		<tr>
			<th>회원 번호</th>
			<th>회원 아이디</th>
			<th>회원 비밀번호</th>
			<th>회원 이름</th>
			<th>가입일</th>
			<th>관리</th>
		</tr>
		<%
			if(mList != null){
				for(int i=0; i<mList.size(); i++){
				%>	
		<tr>
			<td><%= mList.get(i).getMemberCode() %></td>
			<td><%= mList.get(i).getMemberId() %></td>
			<td><%= mList.get(i).getMemberPw() %></td>
			<td><%= mList.get(i).getMemberName() %></td>
			<td><%= mList.get(i).getRegDate() %></td>
			<td><a href="member_editForm.jsp?memberCode=<%= mList.get(i).getMemberCode() %>">수정</a> 
				<a href="javascript:delMember(<%= mList.get(i).getMemberCode()%>)">삭제</a></td>
		</tr>
				<%
				}
			}
		%>	
	</table>
	
	<script>
		function delMember(memberCode){
			if(confirm('정말 삭제하시겠습니까?')){
				location.href='member_delete.jsp?memberCode='+memberCode;
			}
		}
	</script>
</body>
</html>