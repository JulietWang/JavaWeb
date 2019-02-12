<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/1 0001
  Time: 下午 4:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
    <title>el练习</title>
</head>
<body>

    <form action="" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td>
                    <input type="text" name="name" value="${user.name}">
                </td>
            </tr>
            <tr>
                <td>性别</td>
                <td>
                    <input type="text" name="gender" value="${user.gender='male'?'checked':''}">男
                    <input type="text" name="gender" value="${user.gender='female'?'checked':''}">女
                </td>
            </tr>
        </table>

    </form>

</body>
</html>
