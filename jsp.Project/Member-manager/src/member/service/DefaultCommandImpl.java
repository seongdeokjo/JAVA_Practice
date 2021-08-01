package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefaultCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request,HttpServletResponse response) {
		
		request.setAttribute("result", "첫 시작 페이지입니다.");
		return "/index.jsp";
	}

}
