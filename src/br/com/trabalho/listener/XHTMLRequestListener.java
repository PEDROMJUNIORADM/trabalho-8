package br.com.trabalho.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class XHTMLRequestListener implements ServletRequestListener {
	long countXHTMLRequest = 0;

	@Override
	public void requestDestroyed(ServletRequestEvent event) {}

	@Override
	public void requestInitialized(ServletRequestEvent event) {
		ServletContext context = event.getServletContext();
		ServletRequest request = event.getServletRequest();

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		
		if (context.getAttribute("countXHTMLRequest") != null) {
			countXHTMLRequest = (long) context.getAttribute("countXHTMLRequest");
		}
		
		if (httpRequest.getRequestURI().endsWith(".xhtml") && httpRequest.getSession().getAttribute("login") != null) {
			countXHTMLRequest++;
		}

		System.out.println("countXHTMLRequest:" + countXHTMLRequest);
		context.setAttribute("countXHTMLRequest", countXHTMLRequest);
	}

}
