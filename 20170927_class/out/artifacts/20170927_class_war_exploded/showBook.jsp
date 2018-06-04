<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/9/27
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showBook</title>
</head>
<body>
<table>
    <tr>
        <td>书名</td>
        <td>作者</td>
        <td>价格</td>
    </tr>
    <s:iterator value="books" var="b">
    <tr>
        <td><s:property value="#b.b_name"/></td>
        <td><s:property value="#b.b_author"/></td>
        <td><s:property  value="#b.b_price"/></td>
    </tr>
    </s:iterator>
    <s:debug/>
</table>
</body>
</html>
