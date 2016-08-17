<%@ page  language="java" import="java.io.* " pageEncoding="utf-8" %><%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/25
  Time: 17:09
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
        String password = request.getParameter("password");
        PrintWriter pout = response.getWriter();
        pout.println("username: "+username+"<br>");
        pout.println("password: "+password+"<br>");
    %>
</body>
</html>
