<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제</title>
<style>
</style>
<script>
</script>
</head>
<body>
		<c:if test="${result eq 1}" >
			<script>
				alert('삭제가 완료되었습니다.');
				location.href='member_list.do';
			</script>
		
		</c:if>
		
		<c:if test="${result eq 0}" >
			<script>
				alret('오류로 삭제가 되지 않았습니다. \n 다시 시도해주세요.');
				location.href='member_list.do';
			</script>
		</c:if>
</body>
</html>