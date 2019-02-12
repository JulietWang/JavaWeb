<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/3 0003
  Time: 上午 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/UploadServlet" enctype="multipart/form-data" method="post">
    上传用户:<input type="text" name="username"><br>
    上传文件:<input type="file" name="file1">
    <input type="submit" value="提交">
</form>

</body>
</html>
