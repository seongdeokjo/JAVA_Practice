<%@page import="java.sql.ResultSet"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
 	request.setCharacterEncoding("utf-8");
 
 	String id = request.getParameter("id");
 	String pw = request.getParameter("pw");
 	String name = request.getParameter("name");
 	
 	
 	int resultCnt = 0;
 	int key= 0;
 	Class.forName("com.mysql.cj.jdbc.Driver");
 	
 	try{
 	Connection conn = null;
 	PreparedStatement pstmt = null;		
 	ResultSet rs = null;	
 	conn = ConnectionProvider.getConnection();
 	//insert into member (memberId,memberPw,memberName) values(?,?,?);
 	//String sqlReg = "insert into member values(0,?, ?, ?)";
 	String sqlReg = "insert into member (memberId,memberPw,memberName) values(?,?,?)";
	pstmt = conn.prepareStatement(sqlReg);
	pstmt.setString(1,id);
	pstmt.setString(2, pw);
	pstmt.setString(3, name);
	
	resultCnt = pstmt.executeUpdate();
	
	
 	}catch(Exception e){
 	}
 	
 	if(resultCnt >0 ){
 		%>
 		<script>
 			alert('등록 되었습니다.');
 			location.href='member_list.jsp';
 		</script>
 		<%
 	}else {
 		%>
 		<script>
 			alert('오류발생으로 등록되지 않았습니다.\n 입력페이지로 다시 이동합니다.');
 			window.history.go(-1);
 		</script>	
 		<% 
 	}
	
 
 %> 