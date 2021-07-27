package member.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginCheckFilter implements Filter {

	

	@Override
	public void doFilter(
			ServletRequest request, 
			ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		//요청의 필터 처리 ; request
		// 회원의 로그인 여부 확인! : session의 속성에 회원의 로그인 정보를 가지고 있는지 확인
		// 1.Session 객체를 구한다.
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpSession session = httpRequest.getSession(false);
		//getSession(true) : 세션이 존재하면 세션객체를 반환, 세션 객체가 없다면 새로운 세션 객체 생성 후 반환
		//getSession(false) : 세션 객체가 없다면 null 반환
		//getSeesion() : 현재 세션 아이디와 같은 세션을 반환
		
		if(session != null && session.getAttribute("loginInfo") != null) {
			chain.doFilter(request, response);
		}else {
			String viewPage ="/loginForm.jsp";
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
 		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}
	@Override
	public void destroy() {}

}
