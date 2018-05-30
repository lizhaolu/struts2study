<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/8/28
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculator</title>
</head>
<body>
<form action="CalculaterServlet" method="post">
    <table>
        <tr>
            <td>操作数1</td>
            <td><input type="text" name="num1" value="${requestScope.calculator.num1}"></td>
        </tr>
        <tr>
            <td>符号</td>
            <td>
            <input type="radio" name="op" value="+" ${requestScope.calculator.op=="+"?"checked":""}>+
            <input type="radio" name="op" value="-" ${requestScope.calculator.op=="-"?"checked":""}>-
            <input type="radio" name="op" value="*" ${requestScope.calculator.op=="*"?"checked":""}>*
            <input type="radio" name="op" value="/" ${requestScope.calculator.op=="/"?"checked":""}>/
            </td>
        </tr>
        <tr>
            <td>操作数2</td>
            <td><input type="text" name="num2" value="${requestScope.calculator.num2}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="计算"></td>
        </tr>
        <tr>
            <td>结果</td>
            <td><input type="text" value="${option}"></td>
        </tr>
    </table>
</form>
</body>
</html>
