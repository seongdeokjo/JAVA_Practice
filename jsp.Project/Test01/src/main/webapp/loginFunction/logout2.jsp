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
	//현재 세션 객체를 소멸시킨다. -> 세션에 저장된 속성들도 함께 소멸!! 회원정보도 소멸
	session.invalidate();
	//로그인이 성공되어있을 때 sessio.removeAttibute("userid"); 를 통해 저장되어 있는 값을 지우고 
	//loginOk2.jsp 와 같이 어디서 호출했는지 url에 저장하고 다시 보낸다
	String url = request.getHeader("referer");
	response.sendRedirect(url);

 %>    
</body>
</html>