<%@page import="member.service.MemberRegService"%>
<%@page import="member.*" %>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	int result = MemberRegService.getInstance().regMember(request);
	//request.setAttribute("result", result);
%> 	
<jsp:forward page="reg_view.jsp" />


