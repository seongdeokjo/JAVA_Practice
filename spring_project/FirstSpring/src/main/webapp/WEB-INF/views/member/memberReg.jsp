<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
</head>
<body>
	<table>
		<tr>
			<th>아이디</th>
			<td>${memberId} / ${memberid} /  ${reg.memberId}    </td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td>${memberPw} / ${memberpw} /  ${reg.memberPw}></td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${memberName} / ${membername} /  ${reg.memberName} </td>
		</tr>
		<%-- <tr>
			<th>사진</th>
			<td>${memberPhoto} / ${memberphoto} / ${regMember.photo}</td>
		</tr> --%>

	</table>
	
</body>
</html>