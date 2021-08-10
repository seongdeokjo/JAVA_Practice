<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <c:if test="${result < 0 }">
	<script>
		alert('오류로 가입이 실패하였습니다.');
		window.history.go(-1);
	</script>
</c:if>
<c:if test="${result > 0 }">
	<script>
		alert('회원가입 완료');
		location.href = '<c:url value="/"/>';
	</script>
</c:if> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Open Project</title>
<%@ include file="/WEB-INF/views/frame/metaheader.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/views/frame/header.jsp"%>
	<%@ include file="/WEB-INF/views/frame/nav.jsp"%>

	<div id="content">

		<h2>회원가입 결과</h2>
		<hr>
		${reg}
		<table>
			<tr>
				<th>아이디</th>
				<td></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td></td>
			</tr>
			<tr>
				<th>이름</th>
				<td></td>
			</tr>
			<tr>
				<th>사진</th>
				<td></td>
			</tr>
		</table>
	</div>

</body>
</html>