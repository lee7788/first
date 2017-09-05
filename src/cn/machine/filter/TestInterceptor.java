package cn.machine.filter;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.machine.tools.LoginStatic;

public class TestInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// 最后执行，一般用作清理资源使用，整个请求结束后调用
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		// 进行视图返回渲染之前被调用,用来修改信息，跳转等
		arg0.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("GBK");
		HttpSession session = arg0.getSession();
		if (session.getAttribute(LoginStatic.LOGIN_NAME) == null || session.getAttribute(LoginStatic.LOGIN_NAME) == ""
				|| session.getAttribute(LoginStatic.LOGIN_NAME) == "USER_INFO") {
			PrintWriter out = response.getWriter();
			
			out.print("<script type='text/javascript'>window.location='/index/toLogin' ;</script>");
			out.flush();
			out.close();
		}
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// 请求之前调用，在此处添加要操作code
		return true;

	}

}
