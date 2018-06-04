<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/10/9
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<s:fielderror fieldName="err"></s:fielderror>
<s:form action="loginAction" method="POST">
    <s:textfield label="用户名" name="username"/>
    <s:password  label="密码" name="password"/>
    <s:submit value="登录"></s:submit>
</s:form>
</body>
</html>
