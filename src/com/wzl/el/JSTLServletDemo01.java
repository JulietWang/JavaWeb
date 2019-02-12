package com.wzl.el;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "JSTLServletDemo01" , urlPatterns = "/JSTLServletDemo01")
public class JSTLServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request , response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName("王小白");
        user.setGender("female");
        String [] likes = {"sing","dance","code"};
        user.setLikes(likes);
        request.setAttribute("user",user);
        request.getRequestDispatcher("/el/el.jsp").forward(request,response);
    }
}
