<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/8/1
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String username = (String)session.getAttribute("username");
        session.invalidate();
    %>
    <%= username%>再见
    <a href="mailLogin.jsp">重新登录</a>


</body>
</html>
