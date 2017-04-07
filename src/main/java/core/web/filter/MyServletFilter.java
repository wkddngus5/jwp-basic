package core.web.filter;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import next.web.UpdateUserServlet;

@WebFilter("/*")
public class MyServletFilter implements Filter{
	private static final Logger log = LoggerFactory.getLogger(MyServletFilter.class);

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		LocalDateTime startTime = LocalDateTime.now();
		chain.doFilter(request, response);
		LocalDateTime endTime = LocalDateTime.now();
		log.debug("소요시간: {}", endTime.getNano()-startTime.getNano());
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
	}
}
