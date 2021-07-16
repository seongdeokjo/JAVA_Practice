<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>My Blog</title>
<link rel="stylesheet" href="css/myblog.css">
</head>

<body>
	<div id="main_wrap">
		<!-- header 시작 -->
		<%@ include file="header.jsp"%>
		<!-- header 끝 -->

		<!-- nav 시작 -->
		<%@ include file="nav.jsp"%>
		<!-- nav 끝 -->

		<!-- 컨텐츠 영역 시작 -->
		<div id="content_wrap">
			<section>
				<!-- 본문1 시작-->
				<%@ include file="content1.jsp"%>
				<!-- 본문1 끝-->

				<!-- 본문2 시작-->
				<%@ include file="content2.jsp"%>
				<!-- 본문1 끝-->
			</section>
			<!-- 배너 시작-->
			<%@ include file="aside.jsp"%>
			<!-- 배너 끝-->
		</div>
		<!-- 컨테츠 영역 끝 -->

		<!-- footer 시작 -->
		<%@ include file="footer.jsp"%>
		<!-- footer 끝    -->
	</div>
</body>

</html>