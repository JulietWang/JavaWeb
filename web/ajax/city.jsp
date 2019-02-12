<%--
  Created by IntelliJ IDEA.
  User: wangzl
  Date: 2019/2/12 0012
  Time: 下午 2:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>二级联动</title>
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
                var xcity = xmldoc.getElementsByTagName("select");
                var select_root = document.getElementById("city");
                select_root.options.length  = 0;
                for(var i = 0;i < xcity.length;i++){
                    var xValue = xcity[i].childNodes[0].firstChild.nodeValue;
                    var xText = xcity[i].childNodes[1].firstChild.nodeValue;
                    var option = new Option(xText,xValue);
                    select_root.add(option);
                }
            }
        }
    }
    function getCity() {
        var id = document.getElementById("province").value;
        var url ="${pageContext.request.contextPath}/CityServlet?id="+id;
        xmlHttp.onreadystatechange=back;
        xmlHttp.open("GET",url,"true");
        xmlHttp.send(null);
    }
</script>
<body>
    <form action="">
        <table>
            <tr>
                <td>二级联动</td>
            </tr>
            <tr>
                <td>
                    <select name="province" id="province" onchange="getCity()">
                        <option value="0">请选择所在省份</option>
                        <option value="1">浙江省</option>
                        <option value="2">四川省</option>
                    </select>
                    <select name="city" id="city">
                        <option value="0">请选择所在城市</option>
                    </select>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
