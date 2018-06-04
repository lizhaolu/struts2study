<%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/10/24
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
<s:form action="uploadAction" method="POST" enctype="multipart/form-data">
    <s:textfield label="文件主题" name="title"/>
    <s:file label="选择文件1" name="upload"/>
    <s:file label="选择文件2" name="upload"/>
    <s:file label="选择文件3" name="upload"/>
    <s:submit value="上传"/>
</s:form>
</body>
</html>
