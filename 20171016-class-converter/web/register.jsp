<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/10/16
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>register</title>
</head>
<body>
<s:form action="registeraction" method="POST">
    <s:textfield label="用户名" name="username"/>
    <s:textfield label="固话" name="tel"/>
    <s:textfield lable="省" name="adress"/>
    <s:textfield label="市" name="adress"/>
    <s:textfield label="区" name="adress"/>
    <s:textfield label="街道" name="adress"/>
    <s:submit value="提交"/>
</s:form>
</body>
</html>
