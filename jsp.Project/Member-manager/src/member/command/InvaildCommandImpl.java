package member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InvaildCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request,HttpServletResponse response) {
		// 핵심 처리......
		request.setAttribute("result", "실패 페이지입니다.");

		return "/fail.jsp";
	}

}
