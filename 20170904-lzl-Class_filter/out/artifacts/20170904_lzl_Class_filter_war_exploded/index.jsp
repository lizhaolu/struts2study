<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="nuc.sw.dangdand.vo.Book" %><%--
  Created by IntelliJ IDEA.
  User: superzhaolu
  Date: 2017/9/4
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  你添加的书籍信息
  <body>
  <table border="1">
    <tr>
      <td>书名</td>
      <td>作者</td>
      <td>价格</td>
    </tr>
    <%
      for(Book book:(List<Book>)request.getAttribute("blist")){
         pageContext.setAttribute("book",book);
    %>
      <tr>
        <td><%=book.getBookName()%></td>
        <td><%=book.getBookAuthor()%></td>
        <td><%=book.getBookPrice()%></td></tr>
      <%
        }
      %>
  </table>
  <a href="addBook.jsp">继续添加书籍</a>
  </body>
</html>
