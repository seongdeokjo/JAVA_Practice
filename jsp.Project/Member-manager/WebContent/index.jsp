<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메인 페이지</title>

<c:url  value="/css/default.css" var="css"/>
<link rel="stylesheet" href="${css}">

<script>
</script>
</head>
<body>
<%-- 	<c:url value="/WEB-INF/frame/header.jsp" var="header" scope="session"/>
	<c:url value="/WEB-INF/frame/nav.jsp" var="nav" scope="session" /> 
13 <c:out value="${myurl}" escapeXml="false"/>--%>

	<c:url value="WEB-INF/frame/header.jsp" var="head" scope="session"/>
<c:url value="WEB-INF/frame/nav.jsp" var="nav" scope="session"/>

<c:import url="${head}"/>
<c:import url="${nav}"/>
	
	
<%-- 	<c:import url="/WEB-INF/frame/header.jsp"/>
	<c:import url="/WEB-INF/frame/nav.jsp" /> --%>

	<div class="contents">

		<h1>Index</h1>


	</div>


</body>
</html>