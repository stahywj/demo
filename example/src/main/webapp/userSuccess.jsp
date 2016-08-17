<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/28
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
        String name = (String) request.getAttribute("username");
    %>
    <%= name%><br>所有的信息都验证通过！！！
</body>
</html>
