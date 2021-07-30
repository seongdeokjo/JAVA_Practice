package member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberRegFormCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request,HttpServletResponse response) {
		request.setAttribute("result", "회원가입 페이지입니다.");
		
		return "/WEB-INF/views/regForm.jsp";
	}

}
