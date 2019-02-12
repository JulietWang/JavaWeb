package com.wzl.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FilterDemo01" , urlPatterns = "/*")
public class FilterDemo01 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("在访问目标前先做一些事情ccc");
        chain.doFilter(req, resp);
        System.out.println("在访问目标后先做一些事情ddd");

    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("进行初始化过滤器2...");
    }

}
