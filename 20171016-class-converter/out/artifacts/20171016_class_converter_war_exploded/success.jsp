<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/10/17
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>

欢迎${sessionScope.user.username}注册成功!详细内容如下：<br>
电话：${sessionScope.user.tel}<br>
地址:${sessionScope.user.address}
</body>
</html>
