<%@page import="guest.jdbc.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 페이지</title>
<style>
</style>
<script>
</script>
</head>
<body>
	<%
		Connection conn = ConnectionProvider.getConnection();
		out.print(conn);
	%>
</body>
</html>