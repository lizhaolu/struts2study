<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/9/26
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script type="text/javascript">
        function login() {
            //获取到form，[]中的数字代表第几个form
            targetForm=document.forms[0];
            //""中的必须与配置文件中的Action和method一致
            targetForm.action="loginAction!loginMethod";
            targetForm.submit();
        }
        function regist() {
            targetForm=document.forms[0];
            targetForm.action="registAction!registMethod";
            targetForm.submit();
        }
    </script>
</head>
<body>
<s:property value="info"/>
<font color="red">
    ${requestScope.error}
    <s:fielderror/>
</font>
<form action="action!methodName" method="post">
    <table>
        <tr><td>登陆账户：<input type="text" name="username"></td></tr>
        <tr><td>登陆密码：<input type="password" name="password"></td></tr>
        <tr><td><input type="button" value="登陆" onclick="login()"></td></tr>
        <tr><td><input type="button" value="注册" onclick="regist()"></td></tr>
    </table>
</form>
</body>
</html>
