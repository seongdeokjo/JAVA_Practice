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

	//텍스트 글자가 깨져서 출력 되는 것을 방지
	request.setCharacterEncoding("utf-8");
	
	// 사용자가 입력한 id,pw를 로그인 페이지의 폼 화면인 "login.jsp"에서 받아올 수 있다.
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//id,pw가 null 값이 아니라면 로그인이 가능하다고 설정
	if(id.trim().length() >0 && pw != null &&id.equals(pw)){
		//로그인에 성공하면 사용자 아이디를 세션 변수에 저장
		session.setAttribute("id", id);
	}
	//어디를 통해서 여기로 왔는지 알려준다.
	String url = request.getHeader("referer"); //-> 통해 어디에서 호출했는지 URL에 저장하고 다시 그곳으로 보낸다
	response.sendRedirect(url);

%> 



</body>
</html>