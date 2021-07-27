<%@page import="member.util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 쿠키의 삭제 : 쿠키 유지시간을 0으로 설정
	//Cookie c = new Cookie("cname","");
	
	//기간 : 일주일
	//	c.setMaxAge(60*60*24*7); 
	//쿠키가 바로 소멸: 삭제
	//c.setMaxAge(0);
	
	response.addCookie(CookieBox.makeCookie("name", "","/web/cookie" ,0));
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
	<h1>쿠키가 삭제되었습니다.</h1>
	<a href="viewCookie.jsp">쿠키 보기</a>
</body>
</html>