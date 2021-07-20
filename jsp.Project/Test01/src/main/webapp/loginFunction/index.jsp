<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<%
		//로그인이 안되어있으므로 로그인 페이지로 링크
		if(session.getAttribute("id")==null){
			out.println("<a href='login.jsp'>로그인</a>");
		//로그인 되어있는 상태를 나타냄	
		 
		}else{
			String id = (String)session.getAttribute("id");
			out.println(id+" 님 반갑습니다.<br>");
			out.println("<a href='logout.jsp'>로그아웃</a>");

	} 
	%>
	
	
	
</body>
</html>