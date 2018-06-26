<%--
  Created by IntelliJ IDEA.
  User: idea
  Date: 2017/10/23
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>上传成功</title>
</head>
<body>
上传成功！上传的文件如下：<br>
<s:iterator value="paths" var="path">
    文件名：<a href="downloadAction.action?inputPath=${savePath}<s:property value="#path.getSaveFileName()"/>&downFileName=<s:property value="#path.getUploadFileName()"/>&contentType=<s:property value="#path.getUploadContentType()"/>">
    <s:property value="#path.getUploadFileName()"/></a><br>
</s:iterator>
</body>
</html>
