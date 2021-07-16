<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 	<jsp:include page="view.jsp">
		<jsp:param value="id" name="Id"/>
	</jsp:include> --%>
	
	<%
		String id=	request.getParameter("Id");
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
	<h3>id:<%=request.getAttribute("Id")%></h3>
	<%=id  %>
</body>
</html> 