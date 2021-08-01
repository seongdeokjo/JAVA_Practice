<%@page import="member.domain.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보 page</title>
<style>
td {
	text-align: center;
	padding: 5px 10px;
}

button {
	margin: 5px 0;
}
</style>
<script>
</script>
</head>
<body>
	<c:import url="/WEB-INF/frame/header.jsp"/>
	<c:import url="/WEB-INF/frame/nav.jsp"/>
	
	<h1>회원 리스트</h1>
	<hr>
	<a href="index.do">홈</a>
	<hr>
	<table border=1>
		<tr>
			<th>프로필</th>
			<th>회원코드</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>가입일</th>
			<th>관리</th>
		</tr>
		
		<!--member_list.jsp request.setAttribute ->result로 저장  -->
	  <c:if test="${result ne null && !empty result}" >
		<c:forEach items="${result}" var="member">
			<tr>
				<td>
						<img src="<c:url value="/upload/${member.memberPhoto}"/>" style="width: 50px">
				</td>
				<td><c:out value="${member.memberCode}"/></td>
				<td>
				
				<c:out value="${member.memberId}"/></td>
				<td><c:out value="${member.memberPw}"/></td>
				<td><c:out value="${member.memberName}"/></td>
				<td><c:out value="${member.regDate}"/></td>
				
				<td>
					<a href="<c:url value="/editForm.do"/>?memberId=${member.memberId}">수정</a> 
					<a href="javascript:delMember('${member.memberCode}')">삭제</a>
				</td>
			</tr>
		</c:forEach>
		</c:if>
	</table>
	<script>
		function delMember(code){
			if(confirm('정말 삭제하시겠습니까?')){
				location.href ='deleteMember.do?memberCode='+code;
			}		
		}
	</script>
</body>
</html>