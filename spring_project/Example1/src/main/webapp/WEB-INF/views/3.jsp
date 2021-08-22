<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
$(function() {
    //input을 datepicker로 선언
    $("#datepicker").datepicker({
        dateFormat: 'yy-mm-dd' //달력 날짜 형태
        ,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
        ,showMonthAfterYear:true // 월- 년 순서가아닌 년도 - 월 순서
        ,changeYear: true //option값 년 선택 가능
        ,changeMonth: true //option값  월 선택 가능                
        ,showOn: "both" //button:버튼을 표시하고,버튼을 눌러야만 달력 표시 ^ both:버튼을 표시하고,버튼을 누르거나 input을 클릭하면 달력 표시  
        ,buttonImage: "https://brewery.jejubeer.co.kr/static/images/reservationRenew/img_icon_calendar.png" //버튼 이미지 경로
        ,buttonImageOnly: true //버튼 이미지만 깔끔하게 보이게함
        ,buttonText: "선택" //버튼 호버 텍스트              
        ,yearSuffix: "년" //달력의 년도 부분 뒤 텍스트
        ,monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 텍스트
        ,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip
        ,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 텍스트
        ,dayNamesShort: ['일', '월', '화', '수', '목', '금', '토']
        ,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 Tooltip
        ,minDate: "-5y" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
        ,maxDate: "+5y" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)
    	,beforeShowDay: noBefore
    	,onSelect: function(){
     		 var date = $('#datepicker').val();
     		 selectReset();
     	
    		 console.log(date);
    	  	$.ajax({
    			url : '<c:url value="/selectResult"/>',
    			type : 'get',
    			data : {
    				mid : date
    				},
    			success : function(data){
    				$('#cnt').html();
    					var count = data;
    					console.log(count);
    				var num = $('#cnt option').length;
    				console.log(num);
    					$('#msg').text('가능인원:'+count);
    					if(count == 0){
    						$('#cnt').attr('disabled',true);
    					}
    					if(count < num){
    						for(var i=num; i>count; i--){
    							$('#cnt option[value='+i+']').hide();
    						}
    					}
    					
    			}  			
    		}); 
    	}
    });                    
    
    //초기값을 오늘 날짜로 설정해줘야 합니다.
    $('#datepicker').datepicker('setDate', '+1D'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
    function selectReset(){
    	$('#cnt option').show();
 		$('#cnt').attr('disabled',false);
    }
  
});
// 현재 날짜 이전의 날짜는 선택 비활성화
function noBefore(date){
    if (date < new Date()){
    	return [false];
    }
    return [true];
}

</script>




</head>
<body>
	<form  method="post">
		<input type="text" id="datepicker" name="date"><br>
		<span id="msg"></span>
		<select id="cnt">
			<option selected value="0" >인원선택</option>
			<option value="1">1명</option>
			<option value="2">2명</option>
			<option value="3">3명</option>
			<option value="4">4명</option>
		</select>
		
		
	
	</form>
</body>
</html>