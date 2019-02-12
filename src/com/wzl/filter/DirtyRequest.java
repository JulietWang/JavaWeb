package com.wzl.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Arrays;
import java.util.List;

/**
 * 〈功能简述〉
 * 〈脏话字典〉
 *  利用装饰者模式 对request进行增强
 * @author Administrator
 * @create 2019/2/2 0002
 */
public class DirtyRequest extends HttpServletRequestWrapper {

    private List<String> dirtyList = Arrays.asList("王八蛋","傻子","傻蛋");
    private HttpServletRequest request;

    public DirtyRequest(HttpServletRequest request) {
        super(request);
        this.request = request;
    }

    @Override
    public String getParameter(String name) {
        //获取用户请求的参数
        String value = this.request.getParameter(name);
        //把获取的value的数据进行替换即可
        if(value == null){
            return null;
        }

        for (String str : dirtyList) {
            if(value.contains(str)){
                value = value.replace(str, "***");
            }
        }

        return value;
    }
}
