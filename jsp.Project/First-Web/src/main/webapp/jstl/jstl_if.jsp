<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script>
</script>
</head>
<body>
	
	<c:if test="${true}">
		참일때만 보여집니다.
	</c:if>
	<br><hr><br>
	<h3>이름 : ${members[1].name}
	<c:if test="${members[1].name eq null}">
		입력된 정보가 없습니다.
	</c:if>
	</h3>
	
	<c:if test="${members[0].name == 'COOL00'}" var="result" scope="request" />
	<br> members[0].name == 'COOL00' :
	${result}
	
</body>
</html>