<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/11/14
  Time: 8:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:i18n name="nuc.sw.i18n.login">
    <html>
    <head>
        <title><s:text name="title"/></title>
        <s:head></s:head>
    </head>
    <body>
    <s:fielderror name="err"/>
    <s:form action="loginAction" method="POST">
        <s:textfield  name="username" key="user"/>
        <s:password name="password" key="password"/>
        <td><s:text name="type"/><select name="type">
            <option><s:text name="admin"/></option>
            <option><s:text name="puser"/></option>
        </select></td>
        <s:submit key="submit"/>
    </s:form>
    <a href="loginAction?request_locale=zh_CN"><s:text name="language.zh"/></a>
    <a href="loginAction?request_locale=en_US"><s:text name="language.en"/></a>
    </body>
    </html>
</s:i18n>
