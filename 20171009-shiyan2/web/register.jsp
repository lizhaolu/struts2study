<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/10/9
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>register</title>
    <sx:head/>
</head>
<body>
<s:fielderror name="err"></s:fielderror>
<s:form action="RegisterAction" method="POST">
    <s:textfield label="Email地址" name="email"/>
    <s:password label="登录密码" name="password1"/>
    <s:password label="确认密码" name="password2"/>
    <s:textfield label="登录名(昵称)" name="username"/>
    <s:textfield label="真实姓名" name="name"/>
    <s:textfield label="手机号" name="phone"/>
    <sx:datetimepicker label="生日" name="birth" displayFormat="yyyy-mm-dd"> </sx:datetimepicker>
    <s:submit value="提交注册"/>
</s:form>

</body>
</html>
