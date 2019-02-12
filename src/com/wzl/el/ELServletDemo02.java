package com.wzl.el;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ELServletDemo02")
public class ELServletDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("username","小一");
        request.getSession().setAttribute("username","小二");
        request.getServletContext().setAttribute("username","小三");
        request.getRequestDispatcher("/el/el1.jsp").forward(request,response);
    }
}
