package com.springboot.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


@Component
public class RequestHeaderInterceptor implements HandlerInterceptor {


	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub

		/* un-comment to use the interceptor with a requestHeader
		 * if (StringUtils.isBlank(request.getHeader("student-auth-key"))) {
			throw new InvalidHeaderFieldException("Invalid request");
		}*/

		return preHandle(request, response, handler);
	}
}