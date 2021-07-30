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

<body>


<c:import url="/WEB-INF/frame/header.jsp"/>
<c:import url="/WEB-INF/frame/nav.jsp"/>
	

	<div class="contents">

		<h1>${result}</h1>
		<h3>회원가입 mvc 패턴 변경완료</h3>
		<h3>회원 리스트 mvc 패턴 변경완료 </h3>

	</div>


</body>
</html>