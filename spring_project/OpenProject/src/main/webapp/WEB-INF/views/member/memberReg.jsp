<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${result < 0 }">
	<script>
		alert('오류로 가입이 실패하였습니다.');
		window.history.go(-1);
	</script>
</c:if>	
<c:if test="${result > 0 }">
	<script>
		alert('회원가입 완료');
		location.href='<c:url value="/"/>';
	</script>
</c:if>