<%@page import="domain.LoginInfo"%>
<%@page import="domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<%
	LoginInfo loginInfo = (LoginInfo)session.getAttribute("loginInfo");
	
	if(loginInfo == null){
		%>
			<script>
				alert('로그인이 필요한 페이지 입니다. \n 로그인 후 사용해 주세요.');
				location.href = '<%= request.getContextPath()%>/loginForm.jsp';
			</script>
		<%
	}else {
		%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>my page</title>
<link rel="stylesheet" href="${css}">
<style>
</style>
<script>
</script>
</head>
<body>


	<c:import url="${head}" />
	<c:import url="${nav}" />
	<div class="contents">

		<h2>My Page</h2>
		<hr>
		
		<h3>
			
		
		</h3>


	</div>


</body>
</html>
<% 
	}
%>	