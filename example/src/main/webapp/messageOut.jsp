<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/8/4
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String username = (String) request.getAttribute("username");
        String message = (String)request.getAttribute("message");
    %>
    username:<%= username%><br>
    message:<%= message%>
</body>
</html>
