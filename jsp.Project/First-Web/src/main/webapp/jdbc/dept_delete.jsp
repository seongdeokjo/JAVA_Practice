<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 사용자가 전달하는 deptno 받고
	String deptno = request.getParameter("deptno");
	
	// DB 에 있는 데이터를 삭제
	int resultCnt = 0;
	// 2. db처리 : insert
	
	// 데이터베이스 드라이버 로드
	
	try{
	// 연결
	Connection conn = null;
	PreparedStatement pstmt = null;
		
	conn = ConnectionProvider.getConnection();	
	String sqlDelete = "delete from dept where deptno=?";
	pstmt = conn.prepareStatement(sqlDelete);
	pstmt.setInt(1, Integer.parseInt(deptno));
	
	resultCnt = pstmt.executeUpdate();
	}catch(Exception e){
		
	}
	
	if(resultCnt > 0){
		%>
			<script>
				alert('삭제되었습니다.');
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
	// 실행결과에 맞는 응답
%>