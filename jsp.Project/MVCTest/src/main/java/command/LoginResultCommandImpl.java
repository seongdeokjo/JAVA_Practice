package command;

import javax.servlet.http.HttpServletRequest;

public class LoginResultCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request) {
		//..핵심 처리
		
		String id =request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String[] login = new String[]{id,pw};
		
		request.setAttribute("result", login);
		
		return "/WEB-INF/views/loginResult.jsp";
	}

}
