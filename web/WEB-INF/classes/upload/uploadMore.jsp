<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/11 0011
  Time: 上午 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传多个文件</title>
</head>
<script type="text/javascript">
    function addMore() {
        var td = document.getElementById("more");
        var br = document.createElement("br");
        var input = document.createElement("input");
        var button = document.createElement("input");
        input.type = "file";
        input.name = "file1";
        button.type = "button";
        button.value = "remove";

        td.appendChild(br);
        td.appendChild(input);
        td.appendChild(button);

        button.onclick = function (ev){
            td.removeChild(br);
            td.removeChild(input);
            td.removeChild(button);
        }
    }
</script>
<body>

<form action="${pageContext.request.contextPath}/UploadServlet" enctype="multipart/form-data" method="post">
    <table>
        <tr>
            <td>
                上传用户:
            </td>
            <td>
                <input type="text" name="username">
            </td>
        </tr>
        <tr>
            <td>
                上传文件:
            </td>
            <td id="more">
                <input type="file" name="file1">
                <input type="button" value="add more..." onclick="addMore()">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
            <td>
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
