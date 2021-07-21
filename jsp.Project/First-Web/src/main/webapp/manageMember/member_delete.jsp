<%@page import="java.sql.SQLException"%>
<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String memberCode = request.getParameter("memberCode");
	
	int result = 0;
	
	Connection conn = null;
	MemberDao dao = MemberDao.getInstance();
	
	try{
		conn = ConnectionProvider.getConnection();
		result = dao.deleteMember(conn, Integer.parseInt(memberCode));
		
	}catch(SQLException e){
		e.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JdbcUtil.close(conn);
	}
	
	if(result > 0){
		%>
			<script>
				alert('삭제되었습니다.');
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