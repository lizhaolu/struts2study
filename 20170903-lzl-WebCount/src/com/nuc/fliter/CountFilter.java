package com.nuc.fliter;

import com.sun.deploy.config.Config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by superzhaolu on 2017/9/3.
 */
@WebFilter(filterName = "CountFilter")
public class CountFilter implements Filter {
    private int count ;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        count++;
        HttpServletRequest request=(HttpServletRequest)req;
        ServletContext context=request.getSession().getServletContext();
        System.out.print("count");
        context.setAttribute("count",count);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        String param= config.getInitParameter("count");
        count=Integer.valueOf(param);
    }
}
