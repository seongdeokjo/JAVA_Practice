<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//현재 세션 객체를 소멸시킨다. -> 세션에 저장된 속성들도 함께 소멸!! 회원정보도 소멸
	session.invalidate();
	response.sendRedirect("login.jsp");

 %>    
    
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

</body>
</html>