<%@page import="member.domain.LoginInfo"%>
<%@page import="member.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<%-- <%
	 LoginInfo loginInfo = (LoginInfo)session.getAttribute("loginInfo");
	
	if(loginInfo == null){
		%>
			<script>
				alert('로그인이 필요한 페이지 입니다. \n 로그인 후 사용해 주세요.');
				location.href = '<%= request.getContextPath()%>/loginForm.jsp';
			</script>
		<%
	}else {
		%>  --%>
		<c:if test="${loginInfo eq null}">
		<script>
			alert('로그인이 필요한 페이지입니다.\n 로그인 후 사용하세요.');
			location.href = '<%= request.getContextPath()%>/loginForm.jsp';
		</script>
		</c:if>
<c:if test="${loginInfo ne null}">		
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


	<%-- <c:import url="${head}" />
	<c:import url="${nav}" /> --%>
<%@ include file="/WEB-INF/frame/header.jsp" %>
<%@ include file="/WEB-INF/frame/nav.jsp" %>
	<div class="contents">

		<h2>My Page</h2>
		<hr>
		
		<h3>${loginInfo.getMemberName()}</h3>
		<h3>${loginInfo.getMemberId()}</h3>


	</div>


</body>
</html>
</c:if>
<%-- <% 
	}
%>	 --%>