<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");	
%>    
<jsp:useBean id="messageRequest" class="guest.domain.MessageRequest"/>
					<!--모든 속성 바인딩 처리  -->
<jsp:setProperty property="*" name="messageRequest"/>
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
	${messageRequest}
</body>
</html>