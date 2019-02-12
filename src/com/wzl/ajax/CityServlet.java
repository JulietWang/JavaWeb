package com.wzl.ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CityServlet",urlPatterns = "/CityServlet")
public class CityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        String tagetId = request.getParameter("id");
        String xml = "<selects>";
        switch (tagetId){
            case "0":
                xml = "<select><value>0</value><text>请选择城市</text></select>";
                break;
            case "1":
                xml += "<select><value>1</value><text>杭州市</text></select>";
                xml += "<select><value>1</value><text>温州市</text></select>";
                xml += "<select><value>1</value><text>嘉兴市</text></select>";
                break;
            case "2":
                xml += "<select><value>2</value><text>成都市</text></select>";
                xml += "<select><value>2</value><text>广元市</text></select>";
                xml += "<select><value>2</value><text>雅安市</text></select>";
                break;
            default:
                xml = "<select><value>0</value><text>输错了</text></select>";
                break;
        }
        xml = xml + "</selects>";
        pw.println(xml);
        pw.flush();
        pw.close();
    }
}
