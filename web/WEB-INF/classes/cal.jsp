<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/29 0029
  Time: 下午 4:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算结果</title>
</head>
<body>

    <jsp:useBean id="calculatorBean" class="com.wzl.jspmvc.CalculatorBean"></jsp:useBean>
    <jsp:setProperty name="calculatorBean" property="*"/>
    <%
        calculatorBean.calculate();
    %>
    计算结果是:
    <jsp:getProperty name="calculatorBean" property="firstNum"/>
    <jsp:getProperty name="calculatorBean" property="operation"/>
    <jsp:getProperty name="calculatorBean" property="secondNum"/>
    =
    <jsp:getProperty name="calculatorBean" property="result"/>

</body>
</html>
