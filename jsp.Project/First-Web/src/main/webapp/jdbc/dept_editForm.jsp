<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="dept.dao.DeptDao"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="dept.domain.Dept"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//사용자가 전달하는 부서번호 받기
	String deptno = request.getParameter("deptno");
	
	out.println(deptno);
	
	// 전달받은 부서번호로 부서정보를 가져온다. -> 처리 -> Dept -> 공유 
	// 1.드라이버 로드
	// 2.db 연결
	Connection conn = null;
	DeptDao dao = null;
	 
	try{
	conn = ConnectionProvider.getConnection();
	dao = DeptDao.getInstance();
	Dept dept = null;
	
	request.setAttribute("dept",dao.selectByDeptno(conn,Integer.parseInt(deptno)));
	
	}catch(SQLException e){
		e. printStackTrace();	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(conn != null){
			JdbcUtil.close(conn);
		}
	}
	// 부서정보를 form_view.jsp 전달(공유)
	
%>
<jsp:forward page="form_view.jsp"/>