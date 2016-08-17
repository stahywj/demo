<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/26
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%= request.getParameter("hidden")%> 喜欢的娱乐是：<%= request.getParameter("amuse")%> 年龄是：<%= request.getParameter("age")%>
</body>
</html>
