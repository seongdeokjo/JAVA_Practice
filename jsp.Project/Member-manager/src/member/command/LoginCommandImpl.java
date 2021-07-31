package member.command;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.dao.MemberDao;
import member.domain.Member;
import member.util.ConnectionProvider;
import member.util.CookieBox;

public class LoginCommandImpl implements Command {

	boolean loginChk = false;

	public boolean login(HttpServletRequest request, HttpServletResponse response) {
		// 사용자가 전달한 데이터를 받고 -> DB에서 확인
		// reid 확인 하고 값을 받아오면 쿠키 설정

		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		String reid = request.getParameter("reid");
		

		Connection conn = null;
		MemberDao dao = null;

		if (memberId != null && memberPw != null && memberId.trim().length() > 0 && memberPw.trim().length() > 0) {

			try {
				conn = ConnectionProvider.getConnection();
				dao = MemberDao.getInstance();

				Member member = dao.selectByLogin(conn, memberId, memberPw);

				if (member != null) {
					// 회원의 정보를 session 객체에 저장
					// session.setAttribute("member", member);
					request.getSession().setAttribute("loginInfo", member.toLoginInfo());
					loginChk = true;
				}else {
					loginChk = false;
				}

				// ID 저장을 위한 쿠키 설정
				// reid 값의 유무 체크
				if (reid != null && reid.equals("on")) {
					// 쿠키 저장 : 사용자ID를 저장
					response.addCookie(CookieBox.makeCookie("reid", memberId, "/", 60 * 60 * 24 * 365));
				} else {
					// 쿠키값을 저장하지 않는다.
					response.addCookie(CookieBox.makeCookie("reid", memberId, "/", 0));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
			
		}
		return loginChk;
	}

	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		login(request,response);
		request.setAttribute("loginChk", loginChk);
		return "/WEB-INF/views/login.jsp";
	}

}
