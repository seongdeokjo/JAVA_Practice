<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%

	session.setAttribute("userName", "son");

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

	<h1>세션에 사용자 이름을 저장했습니다. : <%= session.getAttribute("userName") %></h1>
	<h3><a href="sessionView.jsp">세션의 속성 정보 확인</a></h3>
	<h1> <%= session.getId() %></h1>
	
</body>
</html>