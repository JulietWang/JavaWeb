package com.wzl.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FilterDemo" , urlPatterns = "/*")
public class FilterDemo implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("在访问目标资源之前执行某些事....a");
        //决定是否放行到目标资源
        chain.doFilter(req, resp);
        System.out.println("在访问目标资源之后执行某些事....b");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("进行初始化过滤器1...");
    }

}
