<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/28
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
        String sex = request.getParameterValues("sex")[0];
        String[] ball = request.getParameterValues("ball");
        String address = request.getParameter("address");
        String instruction = request.getParameter("textarea");

    %>
        用户名： <%= name%><br>
        密码：<%= pwd%><br>
        性别：<%= sex%><br>
        兴趣：
        <%
            for (int i = 0; i < ball.length; i++)
            {
        %>
            <%= ball[i]%>
        <%
            }
        %>
        <br>
        地址：<%= address%><br>
        说明：<%= instruction%>

</body>
</html>
