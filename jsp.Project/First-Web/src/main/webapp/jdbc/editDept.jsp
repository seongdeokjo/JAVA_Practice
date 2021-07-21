<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%    
// 1. 사용자가 입력한 데이터를 받고
	
	// 입력 데이터의 한글 처리
	request.setCharacterEncoding("utf-8");
	
	String deptno = request.getParameter("deptno");
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	
	int resultCnt = 0;
	// 2. db처리 : insert
	
	// 데이터베이스 드라이버 로드
	
	try{
	// 연결
	Connection conn = null;
	PreparedStatement pstmt = null;
		
	conn = ConnectionProvider.getConnection();
	
	String sqlUpdate ="update dept set dname=?, loc=? where deptno=?";
	pstmt = conn.prepareStatement(sqlUpdate);
	pstmt.setString(1, dname);
	pstmt.setString(2, loc);
	pstmt.setInt(3,Integer.parseInt(deptno));
	
	resultCnt = pstmt.executeUpdate();
	
	}catch(Exception e){
		
	}
	
	if(resultCnt > 0){
		%>
			<script>
				alert('변경되었습니다.');
				location.href='dept_list.jsp';
			</script>
		<% 
	}else{
		%>
			<script>
			alert('해당 데이터를 찾지 못했습니다.');
			location.href='dept_list.jsp'; //새로운 페이지 로드 값 초기화
			//window.history.go(-1); // 사용자가 입력했던 값 그대로
			</script>
		<%
	}
%>	