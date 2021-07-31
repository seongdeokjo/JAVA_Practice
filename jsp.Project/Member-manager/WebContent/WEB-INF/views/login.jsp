<%@page import="org.apache.tomcat.util.bcel.classfile.ConstantLong"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<h1>로그인 결과</h1>
	${loginChk}

	<c:if test="${loginChk eq true}" >
		${loginChk}
	 	<script>
			location.href='<c:url value="/index.do"/>';
		</script> 
		
		
	</c:if>	
		
		
	<c:if test="${loginChk eq false }" >
	${loginChk}
		<script>
			alert('아이디 또는 비밀번호가 일치하지 않습니다.');
			history.go(-1);
		</script> 
	</c:if>			
		

