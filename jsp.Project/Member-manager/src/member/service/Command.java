package member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public interface Command {
	String getPage(HttpServletRequest request, HttpServletResponse response);
}
