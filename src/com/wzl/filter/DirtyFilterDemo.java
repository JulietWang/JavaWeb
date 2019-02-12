package com.wzl.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "DirtyFilterDemo" , urlPatterns = "/*")
public class DirtyFilterDemo implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        DirtyRequest dirtyRequest = new DirtyRequest(request);

        chain.doFilter(dirtyRequest, response);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
