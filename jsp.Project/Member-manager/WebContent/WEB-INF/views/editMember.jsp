<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 수정</title>
<style>
</style>
<script>
</script>
</head>
<body>
	<c:if test="${result eq 1}" >
		<h3>회원 정보가 수정되었습니다.</h3>
<%-- 		${result.memberId.val()} <br>
		${result.memberPw.val() } <br>
		${result.memberName.val() } <br>
		${result.memberPhoto.val() } <br> --%>
		
		<a href="index.do">홈으로 가기</a>
	</c:if>
	
	<c:if test="${result eq 0}" >
		
		<script>
			alert('회원 정보 수정에 실패했습니다.');
			location.href='/list_view.do';
		</script>
	</c:if>
</body>
</html>