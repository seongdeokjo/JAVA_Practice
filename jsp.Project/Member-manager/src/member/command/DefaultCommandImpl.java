package member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefaultCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request,HttpServletResponse response) {
		
		request.setAttribute("result", "메인 페이지 입니다.");
		return "/index.jsp";
	}

}
