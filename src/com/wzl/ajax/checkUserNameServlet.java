package com.wzl.ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "checkUserNameServlet" , urlPatterns = "/checkUserNameServlet")
public class checkUserNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        String username = request.getParameter("username");
        System.out.println("---username--"+username);
        //此处利用UserDao查询数据库(此处为模拟)
        DBUser dbUser = new DBUser();
        int flag = dbUser.checkUserName(username);
        System.out.println("---flag--"+flag);
        //以xml的形式返回到客户端
        StringBuilder sb = new StringBuilder();
        //<response><result>1</result></response>
        //<response><result>0</result></response>
        sb.append("<response>");
        sb.append("<result>");
        sb.append(flag);
        sb.append("</result>");
        sb.append("</response>");
        String xml = sb.toString();
        pw.println(xml);
        pw.flush();
        pw.close();
    }
}
