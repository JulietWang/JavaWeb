<%--
  Created by IntelliJ IDEA.
  User: wangzl
  Date: 2019/2/11 0011
  Time: 下午 4:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>邮箱测试</title>
</head>
<script type="text/javascript">
    //1.创建XMLHttpRequest对象
    var xmlHttp;
    if(window.XMLHttpRequest){// code for IE7+, Firefox, Chrome, Opera, Safari
        xmlHttp = new XMLHttpRequest();
    }else{// code for IE6, IE5
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    function back() {
        ////判断当前对象的状态  4代表完成
        //代表信息已经成功返回到客户端  可以对数据进行相关的处理
        if(xmlHttp.readyState == 4) {
            if (xmlHttp.state = 200) {
                var xmldoc = xmlHttp.responseXML;
                var un = document.getElementById("un");
                var res = xmldoc.getElementsByTagName("result")[0].firstChild.nodeValue;
                if(res==1){
                    var error = "该邮箱已经被注册,请重新输入";
                    un.innerHTML = error;
                }else if(res==0){
                    un.innerHTML="恭喜可以使用";
                }

            }
        }
    }
    
    function checkUserName() {
        var name = document.getElementById("username").value;
        var url = "/checkUserNameServlet?username="+name;
        xmlHttp.onreadystatechange = back;
        xmlHttp.open("GET",url,true);
        xmlHttp.send(null);
    }

</script>
<body>
    <form action="">

        用户名:
        <input type="text" name="username" id="username" onblur="checkUserName()">
        <span id="un"></span> <br>
        密码:
        <input type="password" name="password" id="password"> <br>
        <input type="submit" value="注册">

    </form>
</body>
</html>
