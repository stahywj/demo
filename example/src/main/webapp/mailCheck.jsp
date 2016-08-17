<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/8/1
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String username = request.getParameter("username");
        session.setAttribute("username", username);
    %>
    <a href="mailLogin.jsp">转向登录</a>
    <a href="mailLogout.jsp">注销</a>
    <p>当前用户为：<%= username%></p>
    <p>您的邮箱有1000封邮件</p>
</body>
</html>
