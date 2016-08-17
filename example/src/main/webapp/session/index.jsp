<%@ page import="Bean.User" %><%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/8/1
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        User user = (User) session.getAttribute("user");
        if (null == user){
            response.sendRedirect("login.jsp");
            return;
        }
    %>

    <a href="QueryServlet">query</a>
    <%

        if ("2".equals(user.getAuthority()))
        {
    %>
    <a href="UpdateServlet">update</a>
    <%
        }
    %>
</body>
</html>
