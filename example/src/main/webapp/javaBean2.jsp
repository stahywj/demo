<%@ page import="Bean.Person" %><%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/28
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Person p = (Person) request.getAttribute("person");
        System.out.println(p.getName());
    %>
</body>
</html>
