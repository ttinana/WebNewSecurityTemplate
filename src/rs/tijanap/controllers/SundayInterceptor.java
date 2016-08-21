/**
 * 
 */
package rs.tijanap.controllers;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author ttinana
 *
 */
public class SundayInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object)
			throws IOException {

		Calendar cal = Calendar.getInstance();

		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		if (dayOfWeek == 2) {
			response.getWriter().write("Nedeljom ne radimo. Hvala na razumevanju.");
			return false;
		}
		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
		System.out.println("postHandle: uri: " + request.getRequestURI().toString());
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
		System.out.println("afterCompletion: uri: " + request.getRequestURI().toString());
	}

}
