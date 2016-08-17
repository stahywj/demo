<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/26
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>
        <%
            String name = request.getParameter("username");
            //session.setAttribute("username", name);
        %>
        您的姓名是： <%= name%>
        <form action="my3.jsp" method="post">
            您最喜欢的娱乐：<br>
            age: <input type="text" name="age"><br>
            amuse; <input type="text" name="amuse"><br>
            <input type="hidden" name="hidden" value=<%= name%>><br>
            <input type="submit" value="submit">
        </form>
    </p>
</body>
</html>
