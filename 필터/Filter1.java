package edu;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class Filter1 implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain arg2)
			throws IOException, ServletException {

		// UTF-8을 필터에 걸어주면 일일이 적을 필요가 없다
		req.setCharacterEncoding("UTF-8");
		System.out.println("Myfilter1 - dofilter");
		arg2.doFilter(req, resp);
	}

}
