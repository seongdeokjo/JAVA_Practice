<%@page import="member.domain.Member"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 사용자가 전달하는 회원 코드 받기
	String memberCode = request.getParameter("memberCode");

	out.println(memberCode);
	
	//전달받은 회원번호로 회원정보를 가져온다.
		// 1.드라이버 로드
	Class.forName("com.mysql.cj.jdbc.Driver");
	// 2.db 연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
	conn = ConnectionProvider.getConnection();
	
	Member member = null;
	
	String sqlSelect = "select * from member where memberCode=?";
	pstmt = conn.prepareStatement(sqlSelect);
	
	pstmt.setInt(1, Integer.parseInt(memberCode));
	
	rs = pstmt.executeQuery();
	
	if(rs.next()){
		member = new Member();
		member.setMemberCode(rs.getInt("memberCode"));
		member.setMemberId(rs.getString("memberId"));
		member.setMemberPw(rs.getString("memberPw"));
		member.setMemberName(rs.getString("memberName"));
	}
	out.println(member);
	
	request.setAttribute("member",member);
	
	}catch(Exception e){
		
	}
%>
<jsp:forward page="form_view.jsp"/>