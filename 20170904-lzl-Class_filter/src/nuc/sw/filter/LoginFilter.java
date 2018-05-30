package nuc.sw.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by superzhaolu on 2017/9/7.
 */
@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest) req;
        String username=(String)request.getSession().getAttribute("user");
        if (username!=null){
            chain.doFilter(req, resp);
        }
        else {
            request.setAttribute("error","请先登录");
            request.getRequestDispatcher("error.jsp").forward(request,resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
