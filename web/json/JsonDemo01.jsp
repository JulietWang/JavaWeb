<%--
  Created by IntelliJ IDEA.
  User: wangzl
  Date: 2019/3/4 0004
  Time: 上午 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Josn练习</title>
</head>
<script type="text/javascript">
    var jsonObject = {
        username:"wangzl",
        password:"123456",
        age:18
    }
    function whriteFunction() {
        document.getElementById("username").innerText = jsonObject.username;
        document.getElementById("password").innerText = jsonObject.password;
        document.getElementById("age").innerText = jsonObject.age;
    }
</script>
<body>
    <!--JSON是JavaScript原生格式(JavaScript中处理JSON数据不需要任何特殊的API或工具包)-->
    <p id="username"></p>
    <p id="password"></p>
    <p id="age"></p>
    <button onclick="whriteFunction()">点击我</button>
</body>
</html>
