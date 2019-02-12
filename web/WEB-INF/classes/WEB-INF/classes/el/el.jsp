<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/1 0001
  Time: 下午 4:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
                    <input type="radio" name="gender" value="male" ${user.gender=='male'?'checked':''}>男
                    <input type="radio" name="gender" value="female" ${user.gender=='female'?'checked':''}>女
                </td>
            </tr>
            <tr>
                <td>爱好</td>
                <td>
                    <input type="checkbox" name="likes" value="sing" ${fn:contains(fn:join(user.likes,","),"sing")?'checked':''}>唱歌
                    <input type="checkbox" name="likes" value="dance" ${fn:contains(fn:join(user.likes,","),"dance")?'checked':''}>跳舞
                    <input type="checkbox" name="likes" value="code" ${fn:contains(fn:join(user.likes,","),"code")?'checked':''}>敲代码
                    <input type="checkbox" name="likes" value="game" ${fn:contains(fn:join(user.likes,","),"game")?'checked':''}>游戏
                </td>
            </tr>
        </table>

    </form>

</body>
</html>
