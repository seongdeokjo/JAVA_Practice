<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="member.domain.Member"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.SQLException"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//사용자가 전달하는 회원 번호 받기
	String memberCode= request.getParameter("memberCode");
	
	out.println(memberCode);
	
	//전달받은 회원번호로 회원 정보를 가져온다. -> 처리 -> member -> 공유
	
	Connection conn = null;
	MemberDao dao = null;
	
	try{
		conn = ConnectionProvider.getConnection();
		dao = MemberDao.getInstance();
		Member member = null;
		
		request.setAttribute("member",dao.selectByMemberCode(conn, Integer.parseInt(memberCode)));
		
	}catch(SQLException e){
		e.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
			JdbcUtil.close(conn);
	}
%>    
<jsp:forward page="form_view.jsp"/>