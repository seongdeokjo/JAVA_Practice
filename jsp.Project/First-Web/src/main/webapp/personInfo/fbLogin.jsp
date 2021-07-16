<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Facebook 로그인</title>
<link rel="stylesheet" href="/First-Web/personInfo/css/facebook.css">
</head>
<body>
	<div id="main_wrap">
		<div id="content_wrap">
			<!-- header -->
			<%@ include file="fbPart/Fb_header.jsp" %>
			<section id="login_wrap">
				<div id="login_set">
					<form action="fbLogin_result.jsp" method="post">
						<input name="id" class="login_input" placeholder="이메일 또는 전화번호" type="text">
						<input name="pw" class="login_input" placeholder="비밀번호" type="password">
						<input class="login_btn1 btn1_color " type="submit" value="로그인">
						<h5>
							<a href="fbreSetPw.jsp">비밀번호를 잊으셨나요?</a>
						</h5>
						<hr />
					</form>
					
						<a href="fbJoin.jsp"><input class="login_btn2 btn2_color" type="button"
								value="새 계정 만들기"></a>
				</div>
				<h5>
					유명인, 밴드, 비즈니스를 위한<a href="#"> 페이지 만들기</a>
				</h5>
			</section>
		</div>
		<!-- footer 영역 -->
		<%@ include file="fbPart/Fb_footer.jsp" %>
	</div>
</body>
</html>