<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/10/29
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>upload</title>
</head>
<body>
<s:form action="uploadaction" method="POST">
    <s:textfield label="文件主题" name="title"/>
    <input type="file" name="upload">
    <%--<s:file label="选择文件2" name="upload"/>--%>
    <%--<s:file label="选择文件3" name="upload"/>--%>
    <s:submit value="上传"/>
</s:form>
</body>
</html>
