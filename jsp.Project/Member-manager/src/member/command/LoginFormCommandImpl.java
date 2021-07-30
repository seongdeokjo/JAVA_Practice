package member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFormCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("result", "로그인 페이지 입니다.");
		
		return "/WEB-INF/views/loginForm.jsp";
	}

}
