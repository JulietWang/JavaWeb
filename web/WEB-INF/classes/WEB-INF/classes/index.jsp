<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/28 0028
  Time: 下午 3:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>简易网页计算器</title>
  </head>
  <body style="child-align: middle">

  <!--${username}   $代表从域对象中搜索数据
	等价于
	pageContext.findAttribute("username");
	 findAttribute 会依次在四大域对象中搜索数据   page--request--session--application
	 -->
  <form action="${pageContext.request.contextPath}/cal.jsp" method="post">
          <table border="1" width="50%">
              <tr>
                  <td colspan="2">简易计算器</td>
              </tr>
              <tr>
                  <td>第一个参数</td>
                  <td>
                    <input type="text" name="firstNum">
                  </td>
              </tr>
              <tr>
                  <td>运算符</td>
                  <td>
                      <select name="operation">
                          <option value="+">+</option>
                          <option value="-">-</option>
                          <option value="*">*</option>
                          <option value="/">/</option>
                      </select>
                  </td>
              </tr>
              <tr>
                <td>第二个参数</td>
                <td>
                  <input type="text" name="secondNum">
                </td>
              </tr>
              <tr>
                <td colspan="2">
                  <input type="submit" value="计算">
                </td>
              </tr>
        </table>
      </form>
      <br/>
  </body>
</html>

