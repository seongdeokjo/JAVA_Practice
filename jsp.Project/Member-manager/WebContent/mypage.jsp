<%@page import="domain.LoginInfo"%>
<%@page import="domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%= request.getContextPath()%>/css/default.css">
<style>
</style>
<script>
</script>
</head>
<body>

	<%@ include file="/WEB-INF/frame/header.jsp"%>

	<%@ include file="/WEB-INF/frame/nav.jsp"%>

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