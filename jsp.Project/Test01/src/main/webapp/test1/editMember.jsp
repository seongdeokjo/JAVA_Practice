<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String memberCode = request.getParameter("memberCode");
	String memberId = request.getParameter("memberId");
	String memberPw = request.getParameter("memberPw");
	String memberName = request.getParameter("memberName");
	
	int resultCnt = 0;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try{
	// 연결
	Connection conn = null;
	PreparedStatement pstmt = null;
		
	conn = ConnectionProvider.getConnection();
	
	String sqlUpdate ="update member set memberId=?, memberPw=?, memberName=? where memberCode=?";
	pstmt = conn.prepareStatement(sqlUpdate);
	pstmt.setString(1, memberId);
	pstmt.setString(2, memberPw);
	pstmt.setString(3,memberName);
	pstmt.setInt(4,Integer.parseInt(memberCode));
	
	resultCnt = pstmt.executeUpdate();
	
	}catch(Exception e){
		
	}
	
	if(resultCnt > 0){
		%>
			<script>
				alert('변경되었습니다.');
				location.href='member_list.jsp';
			</script>
		<% 
	}else{
		%>
			<script>
			alert('해당 데이터를 찾지 못했습니다.');
			location.href='member_list.jsp'; //새로운 페이지 로드 값 초기화
			//window.history.go(-1); // 사용자가 입력했던 값 그대로
			</script>
		<%
	}

%>