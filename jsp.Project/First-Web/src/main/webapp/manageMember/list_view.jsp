<%@page import="member.domain.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- member_list.jsp에서 request에 저장한 데이터 불러오기 -->
<% List<Member> memberList = (List<Member>)request.getAttribute("result");  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 보기</title>
<style>
	button{
		margin: 5px;
	}
</style>
<script>
</script>
</head>
<body>
	<h1>회원 리스트</h1>
	<hr>
	
	<button onclick="location.href='member_regForm.jsp'">회원등록하기</button>
	<table border="1">
		<tr>
			<th>회원 코드</th>
			<th>회원 아이디</th>
			<th>회원 비밀번호</th>
			<th>회원 이름</th>
			<th>회원 가입일</th>
			<th>관리</th>
		</tr>
		
		<%
			if(memberList != null){
				for(int i=0; i<memberList.size(); i++){
					%>
		<tr>
			<td><%=memberList.get(i).getMemberCode() %></td>
			<td><%=memberList.get(i).getMemberId() %></td>
			<td><%=memberList.get(i).getMemberPw() %></td>
			<td><%=memberList.get(i).getMemberName() %></td>
			<td><%=memberList.get(i).getRegDate() %></td>
			<td>
				<a href="member_editForm.jsp?memberCode=<%= memberList.get(i).getMemberCode() %>">수정</a> 
				<a href="javascript:delMember(<%= memberList.get(i).getMemberCode() %>)">삭제</a>
			</td>
			
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