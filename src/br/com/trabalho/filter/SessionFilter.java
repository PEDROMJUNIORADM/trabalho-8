package br.com.trabalho.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class SessionFilter implements Filter {

	public void init(FilterConfig config) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
	    if(httpRequest.getSession().getAttribute("login") == null && !canAccessRequest(httpRequest)) {
	    	httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
	    } else {
	    	chain.doFilter(request, response);
	    }
	}
	
	private boolean canAccessRequest(HttpServletRequest httpRequest) {
		if (httpRequest.getRequestURI().matches(".*(css|jpg|png|gif|js|login|error.html|error404.html|error500.html)")) {
			return true;
		}

		return false;
	}

}