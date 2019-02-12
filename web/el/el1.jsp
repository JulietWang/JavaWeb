<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/2 0002
  Time: 上午 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el练习1:获取不用域对象中相同的key值的数据</title>
</head>
<body>
    <!-- 默认从最小的域对象中取数据 -->
    ${username}<br>
    <!-- 获取指定的session对象的数据 -->
    ${requestScope.username}<br>
    ${sessionScope.username}<br>
    ${applicationScope.username}
</body>
</html>
