package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("result", "로그아웃합니다.");
		return "/WEB-INF/views/logout.jsp";
	}

}
