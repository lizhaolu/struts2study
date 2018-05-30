<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/9/5
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<script type="text/javascript">--%>
    <%--function reloadcode(){--%>
        <%--var verify=document.getElementById('code');--%>
        <%--verify.setAttribute('src','makeCertPic.jsp?it='+Math.random());--%>
    <%--}--%>
<%--</script>--%>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <style type="text/css">
        #container{}
        #head{
            width: 100%;
            height:20%;
        }
        #body{}
        #left{
            height: 80%;
            width: 70%;

            /*width: 800px;*/
            /*height: 600px;*/
            float: left;
        }
        #right{
            height: 80%;
            width: 30%;
            float: right;
        }
    </style>
</head>
<body>
<div id="container">
    <div id="head">
        <img src="head.png" width="100%">
    </div>
    <div id="body">
        <div id="left">
            <img src="body.png" width="800px" height="600px">
        </div>
        <div id="right">
            <h3>Email或昵称登陆</h3>
            <form action="addBook.jsp" method="post">
                <table>
                    <tr><td>登陆账户：<input type="text" name="username"></td></tr>
                    <tr><td>登陆密码：<input type="password" name="password"></td></tr>
                    <tr><td>验证码<input type="text" name="check_code"> &nbsp
                        <img src="/CheckCodeServlet"> </td></tr>
                    <tr><td><input type="submit" value="登陆"></td></tr>
                </table>
            </form>
        </div>
    </div>
</div>
<%--<table>--%>
    <%--<tr>--%>
        <%--<td>--%>
            <%--用户名<input type="text" name="username">--%>
        <%--</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>--%>
            <%--密码<input type="password" name="password">--%>
        <%--</td>--%>
    <%--</tr>--%>
<%--</table>--%>
</body>
</html>
