<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>작성 페이지</title>
<style>
	div.message_box{
		padding: 10px;
		border: 1px solid #AAA;
		margin: 5px;
		width:300px;
		height; 100px;
	}
	div.paging {
		padding : 10px;
		margin-left : 10px;
		margin-bottom : 150px;
	}
</style>
<script>
</script>
</head>
<body>
	<form action="writemessage.jsp" method="post"> 
		<table border="1">
				<tr>
				<td>이름</td>
				<td>					<!--usebean을 사용하기 위해 messageRequset class의 변수명과 일치  -->
					<input type="text" name="guestname" required>
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="password" required>
				</td>
			</tr>
			<tr>
				<td>메세지</td>
				<td>
					<textarea rows="10" cols="30" name="message"></textarea>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="메시지 남기기">
				</td>
			</tr>			
		</table>
	</form>	
	<hr>
	<c:if test="${listview.messageList ne null and not empty listview.messageList}">
		<c:forEach items="${listview.messageList}" var="message" >
		<div class="message_box">
			<table>
				<tr>
					<td>작성 번호</td>
					<td>${message.messageid}</td>
				</tr>
				<tr>
					<td>작성자</td>
					<td>${message.guestname}</td>
				</tr>
				<tr>
					<td>메세지</td>
					<td>${message.message}</td>
				</tr>
				<tr>
					<td>작성일</td>
					<td>${message.regdate}</td>
				</tr>
				<tr>
					<td></td>
					<td><a href="confirmDelete.jsp?mid=${message.messageid}">삭제</a></td>
				</tr>	
			</table>
		</div>
		</c:forEach>
	
	<!-- 페이징  -->
	<c:if test="${listview.pageTotalCount >0}">
		<div class="paging">
		<c:forEach begin="1" end="${listview.pageTotalCount}" var="num">
			<span>[<a href="list.jsp?page=${num}">${num}</a>]</span>
		</c:forEach>
		</div>
	</c:if>
	</c:if>
</body>
</html>