<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/2 0002
  Time: 上午 11:23
  To change this template use File | Settings | File Templates.
--%>
<%--在页面中使用JSTL定义的EL函数--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>jstl练习</title>
</head>
<body>

    ${fn:toLowerCase("UyHHumm")}<br>
    ${fn:toUpperCase("UnnnKla")}<br>
    ${fn:length("hksh")}<br>
    <%
        List list = Arrays.asList("1","2","3");
        request.setAttribute("list1",list);
    %>
    ${fn:length(list1)}<br>
    ${fn:split("aaa,bbb,vvv","," )[1]}<br>
    ${fn:join(fn:split("www,baidu,com", ","),".")}

</body>
</html>
