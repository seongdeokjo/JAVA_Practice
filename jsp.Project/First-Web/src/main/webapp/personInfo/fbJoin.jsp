<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Facebook 회원가입</title>
<link rel="stylesheet" href="/First-Web/personInfo/css/facebook.css">
<style>
</style>
<script>
	
</script>
</head>
<body>
<div id="main_wrap2">
	<h1>Facebook 회원가입을 시작합니다.</h1>

	<form id="form_area" action="fbJoin_result.jsp" method="post">
		<table id="table_area">
			 <tr>
			 	<td> 
					<label for="user">아이디</label> 
					<input id="user" name="id"  type="text"> 
				</td>
			</tr>
			<tr>	
				<td>	
					<label for="pw">비밀번호</label>
					<input id="pw" name="pw" type="password">
				</td>
			</tr>
			<tr>	
				<td>			
					<label for="pwck">비밀번호 재확인</label> 
					<input id="pwck" name="repw"  type="password">
				</td>
			</tr>
			<tr>	
				<td>	
					<label for="name">이름</label>
					<input id="name" name="name"  type="text">
				</td>
			</tr>
			<tr>	
				<td>
					<label for="birth">생년월일</label> 
					<input id="birth" name="birth"  type="text" placeholder="년(4자)"> 
					<select
						name="month" id="month" class="select_shortbox">
						<option value="월" selected>월</option>
						<option value="1">1</option>
						<option value="1">2</option>
						<option value="1">3</option>
						<option value="1">4</option>
						<option value="1">5</option>
						<option value="1">6</option>
						<option value="1">7</option>
						<option value="1">8</option>
						<option value="1">9</option>
						<option value="1">10</option>
						<option value="1">11</option>
						<option value="1">12</option>
					</select> 
					<input name="day" type="text" placeholder="일">
				</td>
			</tr>
			<tr>
				<td>		
					<label for="gender" >성별</label>
			                <select id="gender" name="sex" >
			                    <option value="성별" selected>성별</option>
			                    <option value="남자">남자</option>
			                    <option value="여자">여자</option>
			                    <option value="선택안함">선택안함</option>
			                </select>
			     </td>           
			</tr>    
			<tr>
				<td>            
			        <label for="option_ck">본인 확인 이메일<span>(선택)</span></label>
			        <input id="option_ck" name="email" type="text" placeholder="선택입력">
				</td>
				
			</tr>
			
		</table>
		<div id="btn">
			<input type="submit" value="가입하기">
		</div>
	</form>
</div>	
</body>
</html>