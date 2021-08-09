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

	<div id="content">

		<h2>회원가입</h2>
		<hr>
		<form method="post" enctype="multipart/form-data"> 
			<table>
				<tr>
					<th>아이디</th>
					<td>
						<input type="text" name="memberid" required >
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="password" name="memberpw" required>
					</td>
				</tr>
				<tr>
					<th>이름</th>
					<td>
						<input type="text" name="membername" required>
					</td>
				</tr>
				<tr>
					<th>사진</th>
					<td>
						<input type="file" name="memberphoto" >
					</td>
				</tr>
				<tr>
					<th></th>
					<td>
						<input type="submit">
					</td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>