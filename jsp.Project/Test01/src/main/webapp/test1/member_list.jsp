<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.util.ArrayList"%>
<%@page import="member.domain.Member"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//member_list.jsp -> 요청을 받고 처리
	
	//1.드라이버 로드
	Class.forName("com.mysql.cj.jdbc.Driver");
	//2. db 연결
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	
	try{
	conn = ConnectionProvider.getConnection();
	out.println("접속 성공");
	// statement
	stmt = conn.createStatement();
	
	//sql
	String sqlSelect = "select * from member";
	
	//ResultSet
	rs = stmt.executeQuery(sqlSelect);

	//5.List<Member>
	List<Member> mList = new ArrayList<Member>();
	
	while(rs.next()){
		mList.add(
				new Member(
						rs.getInt("memberCode"),
						rs.getString("memberId"),
						rs.getString("memberPw"),
						rs.getString("memberName"),
						rs.getString("regDate")
						)
				);
	}
	out.println(mList);
	request.setAttribute("result", mList);
	}catch(Exception e){
		e.getMessage();
		e.printStackTrace();
	}
%>
<jsp:forward page="list_view.jsp"/>