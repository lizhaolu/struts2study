<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/9/27
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addBook</title>
</head>
<body>
<form action="addBookAction" method="post">
    <table>
        <tr>
            <td>书名</td>
            <td><input type="text" name="b_name"></td>
        </tr>
        <tr>
            <td>作者</td>
            <td><input type="text" name="b_author"></td>
        </tr>
        <tr>
            <td>价格</td>
            <td><input type="text" name="b_price"></td>
        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>
        </tr>
    </table>
</form>
</body>
</html>
