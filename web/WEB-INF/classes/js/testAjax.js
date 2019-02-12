/**
 *  AJax建立和服务器端的连接  接受服务器的请求，处理服务器返回的数据
 *   开发步骤：
 *   	1.创建XMLHttpRequest对象
 *   	2.打开和服务器的连接
 *      3.发送数据到服务器端
 *      4.接收服务器端的响应
 */
window.onload = function () {
    document.getElementById("ok").onclick = function () {
        //1.创建XMLHttpRequest对象
        var xmlHttp;
        if(window.XMLHttpRequest){// code for IE7+, Firefox, Chrome, Opera, Safari
            xmlHttp = new XMLHttpRequest();
        }else{// code for IE6, IE5
            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        //2.打开和服务器的连接
        xmlHttp.open("GET","/AjaxServlet",true);
        //3.发送数据
        xmlHttp.send(null);
        //4.响应服务的端的返回的数据
        xmlHttp.onreadystatechange = function () {
            ////判断当前对象的状态  4代表完成
            //代表信息已经成功返回到客户端  可以对数据进行相关的处理
            if(xmlHttp.readyState == 4){
                if(xmlHttp.state = 200){
                    var xmldoc = xmlHttp.responseText;
                    alert("返回的数据是:"+xmldoc);
                }
            }
        }
    }
}