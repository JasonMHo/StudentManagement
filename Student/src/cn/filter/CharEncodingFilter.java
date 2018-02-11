package cn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @ Copyright (c) Create by JASON  Date:2018-02-10  All rights reserved.
 *
 * @ class description：过滤器，设定字符编码
 *
 */
public class CharEncodingFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest rqu = (HttpServletRequest)request;
		HttpServletResponse rpn = (HttpServletResponse)response;
		rqu.setCharacterEncoding("utf-8");
		rpn.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

}


