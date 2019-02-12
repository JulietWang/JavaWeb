<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/2 0002
  Time: 下午 4:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>脏话过滤器</title>
    <form action="${pageContext.request.contextPath}/DirtyServlet" method="post">
        留言: <br>
        <textarea name="message" cols="30" rows="10"></textarea>
        <input type="submit" value="发表">
    </form>
</head>
<body>

</body>
</html>
