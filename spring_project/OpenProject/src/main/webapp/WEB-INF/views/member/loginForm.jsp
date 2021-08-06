<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Open Project</title>

<%@ include file="/WEB-INF/views/frame/metaheader.jsp"%>



</head>
<body>
	<%@ include file="/WEB-INF/views/frame/header.jsp"%>
	<%@ include file="/WEB-INF/views/frame/nav.jsp"%>

	<div>
		<h1>Content : 로그인</h1>
	</div>
	
	<form method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name="id">
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="pw">
				</td>
			</tr>
			<tr>
				<th></th>
				<td>
					<input type="submit" value="로그인">
				</td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>