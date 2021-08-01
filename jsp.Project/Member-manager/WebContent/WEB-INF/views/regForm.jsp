<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입 page</title>
<link rel="stylesheet" href="${css}">
<style>
	
	.display_none{
		display:none;
	}
	.color_blue{
		color : blue;
	}
	.color_red{
		color : red;
	}
	#loadingimg{
		height : 20px;
	}
	
</style>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script>
	$(document).ready(function(){
		
		$('#memberId').focusin(function(){
			$('#msg').addClass('display_none');
			$('#msg').removeClass('color_blue');
			$('#msg').removeClass('color_red');
			
			$(this).val('');
		});
		$('#memberId').focusout(function(){
			// ajax 비동기 통신 > id를 서버로 보내고 사용 가능 유무의 응답 코드를 받는다. -> 화면에 메세지 출력
			$.ajax({
				url : 'idcheck.do',
				type : 'post',
				data : {
					mid : $(this).val()
					},
				beforSend : function(){
					$('#loadingimg').removeClass('display_none');
				},
				success : function(data){
					// data : y / n 
					if(data == 'Y'){
						$('#msg').html('사용가능');
						$('#msg').addClass('color_blue');
						$('#msg').removeClass('display_none');
					}else{
						$('#msg').html('사용불가');
						$('#msg').addClass('color_red');
						$('#msg').removeClass('display_none');
					}
				},
				error : function(request,status,error){
					alert('서버 통신에 문제가 발생했습니다. 다시 실행해주새요.');
					console.log(request);
					console.log(status);
					console.log(error);
				},
				complete : function(){
					$('#loadingimg').addClass('display_none');
				}
			});
		});
		
		
	});
	
	
</script>
</head>
<body>

<%-- 	<c:import url="${head}" />
	<c:import url="${nav}" /> --%>
<%@ include file="/WEB-INF/frame/header.jsp" %>
<%@ include file="/WEB-INF/frame/nav.jsp" %>
	<div class="contents">

		<h2>${result}</h2>
		<hr>
		<form action="<c:url value="memberReg.do"/>" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" name="memberId" id="memberId">
						<span id="msg" class="display_none"></span>
						<img id="loadingimg" class="display_none" alt="loading" src="<c:url value="/image/loading.gif"/>"> 
					</td>
					
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="memberPw"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="memberName"></td>
				</tr>
				<tr>
					<td>사진</td>
					<td><input type="file" name="memberPhoto"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit"> <input type="reset">
					</td>
				</tr>
			</table>
		</form>


	</div>


</body>
</html>