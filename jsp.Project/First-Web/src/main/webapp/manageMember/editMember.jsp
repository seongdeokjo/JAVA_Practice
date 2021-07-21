<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="member.domain.Member"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String memberCode = request.getParameter("memberCode");
	String memberId = request.getParameter("id");
	String memberPw = request.getParameter("pw");
	String memberName = request.getParameter("name");
	
	int result = 0;
	
	Connection conn = null;
	MemberDao dao = null;
	
	try{
	conn = ConnectionProvider.getConnection();
	dao = MemberDao.getInstance();
	result = dao.updateMember(conn, new Member(Integer.parseInt(memberCode),memberId,memberPw,memberName));
		
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
				alert('변경되었습니다.');
				location.href='member_list.jsp';
			</script>
		<%
		
	}else{
		%>
			<script>
				alert('해당 데이터를 찾지 못했습니다.');
				location.href='member_list.jsp';
			</script>
		<%
	}
%>