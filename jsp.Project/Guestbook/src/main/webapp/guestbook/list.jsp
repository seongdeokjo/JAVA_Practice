<%@page import="guest.domain.MessageListView"%>
<%@page import="guest.service.MessageListService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//사용자로부터 페이지 번호를 받는다. list.jsp?page=1, list.jsp
	String pageNumStr = request.getParameter("page");
	int pageNum = 1;
	if(pageNumStr != null){
		pageNum = Integer.parseInt(pageNumStr);
	}
	
	MessageListView listview = MessageListService.getInstance().getMessageList(pageNum);
	
	request.setAttribute("listview", listview);
	
%>
<jsp:forward page="list_view.jsp"/>