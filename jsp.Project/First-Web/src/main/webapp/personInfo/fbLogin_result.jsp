<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String pw = request.getParameter("pw");

request.setAttribute("Id", id);
request.setAttribute("Pw", pw);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link rel="stylesheet" href="/First-Web/personInfo/css/fbLogin.css">
</head>
<body>
	<div id="main_wrap">
		<div id="content_wrap">
			<!-- header -->
			<%@ include file="fbPart/Fb_header.jsp"%>
			<section id="login_wrap">
				<div id="login_set">
					<table border="1">
						<tr>
							<td>
								<h4>
									id:
									<%=id%></h4>
							</td>
							<td>
								<h4>
									pw:
									<%=pw%></h4>
							</td>
						</tr>
					</table>
					<hr>
					<p>저장된 데이터 불러오기</p>
					<table>
						<tr>
							<td><jsp:include page="view.jsp" /></td>
						</tr>
					</table>
				</div>
			</section>
		</div>
		<!-- footer 영역 -->
		<%@ include file="fbPart/Fb_footer.jsp"%>
	</div>
</body>
</html>