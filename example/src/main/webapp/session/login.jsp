<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/8/1
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%
    String authority = (String)request.getAttribute("authority");
%>
    <form action="UserLoginServlet" method="post">
        username: <input type="text" name="username"
                         value="<%= null == request.getAttribute("username")? "" : request.getAttribute("username").toString() %>"><br>
        password: <input type="password" name="password"><br>
        authority: <select name="authority">
            <option value="1" <%= "1".equals(authority) ? "selected" : ""%>>common user</option>
            <option value="2" <%= "2".equals(authority) ? "selected" : ""%>>administrator</option>
    </select><br>
        <input type="submit" value="submit">

    </form>--%>

<%
    String username = request.getParameter("username");
    String authority = request.getParameter("authority");
%>
<form action="UserLoginServlet" method="post">
    username: <input type="text" name="username"
                     value="<%= null == username ? "":username%>"><br>
    password: <input type="password" name="password"><br>
    authority: <select name="authority">
    <option value="1" <%= "1".equals(authority) ? "selected":""%>>common user</option>
    <option value="2" <%= "2".equals(authority) ? "selected":""%>>administrator</option>
</select><br>
    <input type="submit" value="submit">

</form>
</body>
</html>
