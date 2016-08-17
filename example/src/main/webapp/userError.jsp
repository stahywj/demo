<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/28
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List list = (List) request.getAttribute("error");
        for (int i = 0; i < list.size(); i++)
        {
    %>
    <%= list.get(i)%><br>
    <%
        }
    %>
</body>
</html>
