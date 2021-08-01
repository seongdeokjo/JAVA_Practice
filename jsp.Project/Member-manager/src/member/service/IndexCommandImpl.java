package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request,HttpServletResponse response) {
		
		request.setAttribute("result", "메인 페이지 입니다.");
		return "/index.jsp";
	}

}
