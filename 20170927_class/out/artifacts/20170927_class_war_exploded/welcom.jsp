<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/9/27
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
欢迎${sessionScope.user}登陆
<hr>
<a href="addBook.jsp" target="main">增加书籍</a>
<a href="deletBook.jsp">删除书籍</a>
<a href="modifyBook.jsp">修改书籍</a>
<a href="selectBook.jsp">查询书籍</a>
<iframe name="main" width="680" height="380"></iframe>
</body>
</html>
