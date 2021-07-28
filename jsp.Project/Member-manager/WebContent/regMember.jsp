<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:if test="${result == 0}" >
	<h3>등록 실패</h3>
</c:if>
<c:if test="${result ==1}" var="test">
<a href="list_view.jsp">리스트 보기</a>
 <!--  list_view.js : view 의 역할만!!!! -->
</c:if>
    