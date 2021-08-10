<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Open Project</title>



<%@ include file="/WEB-INF/views/frame/metaheader.jsp"%>
<style>
	#loadingimg {
		height:20px;
	}
	.display_none{
		display:none;
	}
	.color_blue{
		color : blue;
	}
	.color_red{
		color : red;
	}
	
</style>
<script>
	$(document).ready(function(){
		
		$('#memberid').focusin(function(){
			$('#msg').addClass('display_none');
			$('#msg').removeClass('color_blue');
			$('#msg').removeClass('color_red');
			
			$(this).val('');
		});
		$('#memberid').focusout(function(){
			// ajax 비동기 통신 > id를 서버로 보내고 사용 가능 유무의 응답 코드를 받는다. -> 화면에 메세지 출력
			
			$.ajax({
				url : '<c:url value="/member/idcheck"/>',
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
						<input type="text" name="memberid" id="memberid" required >
						<span id="msg" class="display_none"></span>
						<img id="loadingimg" class="display_none" alt="loading" src="<c:url value="/image/loading.gif"/>">
						
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
						<input type="submit">  <input type="reset">
					</td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>