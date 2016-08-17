<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/8/4
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="el2.jsp">
        username:<input type="text" name="username">
        <input type="submit" value="submit">
    </form>
    <% session.setAttribute("hello", "world");%>
</body>
</html>
