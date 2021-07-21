<%@page import="dept.dao.DeptDao"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dept.domain.Dept"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// dept_list.jsp -> 요청을 받고 처리
	
	// 1.드라이버 로드 : 서블릿 클래스 Loader에서 드라이버 로드
	// 2.db 연결
	Connection conn = null;	
	DeptDao dao = new DeptDao();

	conn = ConnectionProvider.getConnection();

	// 6.결과 데이터를 request 의 속성에 저장 -> 데이터 공유(전달)
	request.setAttribute("result", dao.getDetpList(conn));
	
%>
 <jsp:forward page="list_view.jsp"/> <!-- view의 역활만! -->