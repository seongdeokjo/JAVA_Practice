<%@page import="member.util.JdbcUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="member.util.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<%
	// dept_list.jsp -> 요청을 받고 처리 -> 결과 데이터를 객체속성에 저장 -> view 지정
	// 1. 드라이버 로드
	
	// 2. DB 연결
	
	
%>		
<jsp:forward page="list_view.jsp" />
 <!--  list_view.js : view 의 역할만!!!! -->









