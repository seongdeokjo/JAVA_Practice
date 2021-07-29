package service;

import javax.servlet.http.HttpServletRequest;

public class InvaildService {
	
	public String getPage(HttpServletRequest requset) {
		
		requset.setAttribute("result","기본값" );
		
		return "/WEB-INF/views/dafault.jsp";
	}
}
