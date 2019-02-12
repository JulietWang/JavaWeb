package com.wzl.filter;

import com.sun.deploy.net.HttpRequest;
import com.sun.scenario.effect.FilterContext;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "CharseterEncodingFilter " , urlPatterns = "/*")
public class CharseterEncodingFilter implements Filter {

    private FilterConfig config = null;
    private String defaultCharest = "UTF-8";

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        //得到系统指定的编码集
        String charest = config.getInitParameter("charest");
        if(charest == null){
            charest = defaultCharest;
        }
        request.setCharacterEncoding(charest);
        response.setCharacterEncoding(charest);
        response.setContentType("text/html;charest="+charest);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

}
