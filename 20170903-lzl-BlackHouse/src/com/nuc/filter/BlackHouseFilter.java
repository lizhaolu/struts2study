package com.nuc.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by superzhaolu on 2017/9/3.
 */
@WebFilter(filterName = "BlackHouseFilter",urlPatterns ="/BlackHouseFilter")
public class BlackHouseFilter implements Filter {
    String[] forbidIPs=null;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if (((HttpServletRequest) req).getRequestURI().contains("smallDarkRoom.jsp") || ((HttpServletRequest) req).getRequestURI().contains("successed.jsp")) {

            chain.doFilter(req, resp);

            return;

        }
        String remoteAddr = req.getRemoteAddr();

        System.out.printf(remoteAddr + " ");

        if (forbidIPs != null) {

            for (int i = 0; i < forbidIPs.length; i++) {

                if (forbidIPs[i].equals(remoteAddr)) {

                    //如果访问的ip与配置的ip相等 则直接过滤掉。

                    ((HttpServletResponse) resp).sendRedirect("smallDarkRoom.jsp");

                    return;

                }

            }

        }

        ((HttpServletResponse) resp).sendRedirect("success.jsp");

        return;
    }

    public void init(FilterConfig config) throws ServletException {
        String initParamter = config.getInitParameter("ForbidIPs");

        if (initParamter != null) {

            forbidIPs = initParamter.split(",");

        }
    }

}
