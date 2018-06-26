<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/11/14
  Time: 8:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<s:i18n name="nuc.sw.i18n.hello">
    <html>
    <head>
        <title>Title</title>
    </head>
    <body>
    <jsp:useBean id="d" class="java.util.Date" scope="page"/>
    <s:text name="hello"/>
    <s:text name="welcome.msg">
        <s:param><s:property value="username"/></s:param>
        <s:param>${d}</s:param>
    </s:text>
    </body>
    </html>
</s:i18n>