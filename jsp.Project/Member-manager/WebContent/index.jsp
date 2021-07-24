<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메인 페이지</title>

<c:url  value="/css/default.css" var="css" scope="session"/>
<link rel="stylesheet" href="${css}">

<script>
</script>
</head>
<c:url value="WEB-INF/frame/header.jsp" var="head" scope="session"/>
<c:url value="WEB-INF/frame/nav.jsp" var="nav" scope="session"/>
<body>



<c:import url="${head}"/>
<c:import url="${nav}"/>
	

	<div class="contents">

		<h1>Index</h1>


	</div>


</body>
</html>